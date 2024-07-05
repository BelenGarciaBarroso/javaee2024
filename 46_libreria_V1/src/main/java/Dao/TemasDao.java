package Dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.Libro;
import model.Tema;

public class TemasDao {

	private static EntityManager eManager;
	static {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("libreriaPU");
		eManager= factory.createEntityManager();
	}
	
	public List<Tema> ListadoCompletoTemas () {
		String jpql="select t from Tema t";
		TypedQuery<Tema> query=eManager.createQuery(jpql,Tema.class);
		try {
			return query.getResultList();
		}catch(NoResultException ex) {
			return null;
		}
	}
}
