package service;

import java.util.List;

import Dao.LibrosDao;
import Dao.TemasDao;
import model.Libro;
import model.Tema;

public class LibrosService {
	
	LibrosDao daoLibros= new LibrosDao();
	TemasDao daoTemas = new TemasDao();
	
		
	public List<Tema> Temas() {
		return daoTemas.ListadoCompletoTemas();
		
	}
	
	public List<Libro> LibrosPorTema(int idTema){
		if(idTema!=0) {
			return daoLibros.findByTema(idTema);
		}else {
			return daoLibros.findAll();
		}
	}
	
	public Libro agregarCarrito(int isbn) {
		return daoLibros.addCarrito(isbn);
		
	}

}
