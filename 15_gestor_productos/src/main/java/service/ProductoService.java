package service;

import java.util.ArrayList;
import java.util.List;

import model.Producto;

public class ProductoService {
	
	static List<Producto> productos=new ArrayList<>();
	
	public boolean grabar (Producto producto) {
		return productos.add(producto);
	}
	
	public List productosCategoria (String categoria) {
		return productos.stream()
				.filter(n->n.getCategoria().equals(categoria))
				.toList();			
	}
	
	public boolean eliminarProducto(String producto) {
		return productos.remove(producto);
	}

}
