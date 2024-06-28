package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	
	@Id
	@Column (name="idusuario")
	private String usuario;
	@Column (name="password")
	private String pass;
	
	public Usuario(String usuario, String pass) {
		super();
		this.usuario = usuario;
		this.pass = pass;
	}

	public Usuario() {
		super();
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
