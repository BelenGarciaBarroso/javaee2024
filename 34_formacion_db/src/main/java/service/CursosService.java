package service;

import java.util.ArrayList;
import java.util.List;

import dao.CursosDao;
import model.Curso;

public class CursosService {
	
	CursosDao dao= new CursosDao();
	
	public boolean altaCurso (Curso curso) {
		if (dao.findByCurso(curso.getNombre())!=null) {
			dao.save(curso);
			return true;			
		}
		return false;
	}
	
	public List<Curso> buscarPorPrecio (double precio) {
		List<Curso>listaPrecios=dao.findByPrecio(precio);
		if((listaPrecios!=null)) {
			return listaPrecios;
		}
		return null;
	}
	
	public boolean eliminarCurso (String nombre) {
		
		if (dao.findByCurso(nombre)!=null) {
			dao.deleteByCurso(nombre);
			return true;
		}
		return false;
	}
	
	public boolean modificaDuracion (String nombre, int duracion) {
		if (dao.findByCurso(nombre)!=null) {
			dao.modificarDuracion(nombre, duracion);
			return true;
		}
		return false;
	}

}
