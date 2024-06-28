package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import model.Curso;

public class CursosDao {
	private static EntityManager eManager;
	
	static { // aquí se crea el Entity para que lo utilicen todos los métodos. Al ser static a secas se pasa por él una única vez.
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("cursos");
		eManager=factory.createEntityManager();
	}
	
	public void save (Curso curso) {
		EntityTransaction tx=eManager.getTransaction();
		tx.begin();
		try {
			eManager.persist(curso);
			tx.commit();
		}catch (Exception ex) {
			tx.rollback();
		}
		
	}
	
	public  Curso findByCurso(String nombre) {
		String jpql="select c from Curso c where c.nombre=:nombre";
		TypedQuery<Curso> query= eManager.createQuery(jpql, Curso.class);
		query.setParameter("nombre", nombre);
		return query.getResultList().stream()
				.findFirst()
				.orElse(null);
				
	}
	
	public List<Curso>findByPrecio (Double precio) {
		String jpql="select c from Curso c where c.precio<=:precio";
		TypedQuery<Curso> query= eManager.createQuery(jpql, Curso.class);
		query.setParameter("precio", precio);
		return query.getResultList().stream()
				.toList();
	}
	
	public void deleteByCurso (String nombre) {
		String jpql="delete Curso c where c.nombre=:nombre";
		Query qr=eManager.createQuery(jpql);
		qr.setParameter(1, nombre);
		EntityTransaction tx=eManager.getTransaction();
		tx.begin();
		qr.executeUpdate();
		tx.commit();
		
		
	}
	
	public void modificarDuracion (String nombre, int duracion) {
		String jpql="update Curso c where c.nombre=:nombre";
		Query qr=eManager.createQuery(jpql);
		qr.setParameter("duracion", duracion);
		EntityTransaction tx=eManager.getTransaction();
		tx.begin();
		qr.executeUpdate();
		tx.commit();		
	}
		
	

}
