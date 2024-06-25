package service;

import java.util.List;

import model.Ficha;

public class AutenticacionService {
	
	private final String USER="admin";
	private final String PASS="curso";
	List<Ficha> fichas=List.of(new Ficha("ar", 19,"aas@g.com"),
			new Ficha("admin", 24,"lll@g.com"),
			new Ficha("jose", 49,"rrr@g.com"),
			new Ficha("hup", 35,"los@g.com")
			);
	
	public boolean autenticar (String usuario, String password) {
		
		return usuario.equals(USER)&&password.equals(PASS);
	}
	
	public Ficha fichaUsuario (String usuario) {
		
		return fichas.stream()
				.filter(n->n.getUsuario().equals(usuario))
				.findFirst()
				.orElse(new Ficha());
				
	}

}
