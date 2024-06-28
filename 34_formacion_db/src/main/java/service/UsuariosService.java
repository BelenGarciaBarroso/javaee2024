package service;

import dao.UsuariosDao;

public class UsuariosService {
	
	UsuariosDao dao= new UsuariosDao();
	
	public boolean autenticacion (String usuario, String pass) {
		if (dao.findUserPass(usuario, pass)==null) {
			return false;
		}
		return true;
	}
	


}
