package Dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.Libro;

public class LibrosDao {
	
	private static EntityManager eManager;
	
	static {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("libreriaPU");
		eManager=factory.createEntityManager();
	}
	
	public List<Libro> findAll () {
		String jpql="select l from Libro l";
		TypedQuery<Libro> query=eManager.createQuery(jpql,Libro.class);
		
		return query.getResultList();
		
	}
	
	
	public List<Libro> findByTema(int idTema) {
		String jpql="select a from Libro a where a.idTema=?1";
		TypedQuery<Libro> query=eManager.createQuery(jpql,Libro.class);
		query.setParameter(1, idTema);
		return query.getResultList();
		
	}
	
	public Libro addCarrito (int isbn) {
		String jpql="select a from Libro a where a.isbn=?1";
		TypedQuery<Libro> query=eManager.createQuery(jpql,Libro.class);
		
		
	}

}
