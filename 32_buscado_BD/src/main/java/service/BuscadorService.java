package service;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.Resultado;

public class BuscadorService {
	
	
	private EntityManager eManager;
	
	public BuscadorService() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("buscador");
		eManager=factory.createEntityManager();
	}
	
	public void altaResultado (Resultado resultado) {
		EntityTransaction tx=eManager.getTransaction();
		tx.begin();
		try {
			eManager.persist(resultado);
			tx.commit();
		}catch (Exception ex) {
			tx.rollback();
		}
	}
	
	public Resultado buscarResultadoPorId (int idResultado) {
		return eManager.find(Resultado.class, idResultado);
	}
	
	public void eliminarResultado (int idResultado) {
		Resultado resultado=buscarResultadoPorId(idResultado);
		if(resultado!=null) {
			EntityTransaction tx=eManager.getTransaction();
			tx.begin();
			eManager.remove(resultado);
			tx.commit();
		}
		
	}
	
	public List<Resultado> resultadosPorTematica(String tematica) {
		String jpql="Select r From Resultado r where r.categoria=?1";
		TypedQuery<Resultado> qr= eManager.createQuery(jpql,Resultado.class);
		qr.setParameter(1, tematica);
		List<Resultado> resultado=qr.getResultList();
		return resultado;
	}

}
