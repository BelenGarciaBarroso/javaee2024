package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.Usuario;

public class UsuariosDao {
	
private static EntityManager eManager;
	
	static { // aquí se crea el Entity para que lo utilicen todos los métodos. Al ser static a secas se pasa por él una única vez.
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("cursos");
		eManager=factory.createEntityManager();
	}
	
	public Usuario findUserPass (String usuario, String pass) {
		String jpql="Select r from Resultado r where r.usuario=:usuario and r.pass=:pass";
		TypedQuery<Usuario> query= eManager.createQuery(jpql, Usuario.class);
		query.setParameter("usuario", usuario);
		query.setParameter("pass", pass);
		return query.getResultList().stream()
				.findFirst()
				.orElse(null);
		
		
		}
	

}
