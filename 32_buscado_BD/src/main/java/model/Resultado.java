package model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="resultados")
public class Resultado {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private String idResulstado; //primaryKey
	@Column (name="url") // Se pone cuando el atributo se llama diferente al de la bbdd.
	private String url;
	private String categoria;
	private String descripcion;
	
	public Resultado(String idResulstado, String url, String categoria, String descripcion) {
		super();
		this.idResulstado = idResulstado;
		this.url = url;
		this.categoria = categoria;
		this.descripcion = descripcion;
	}
	
	public Resultado() {
		super();
	}
	
	public String getIdResulstado() {
		return idResulstado;
	}
	
	public void setIdResulstado(String idResulstado) {
		this.idResulstado = idResulstado;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}
