package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	private String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();
	
	public Supermercado(String nombre, String direccion) {
		this.setNombre(nombre);
		this.setDireccion(direccion);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	public int getCantidadDeProductos() {
		return this.getProductos().size();
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void agregarProducto(Producto unProducto) {
		this.getProductos().add(unProducto);
	}

	public Double getPrecioTotal() {
		double precioTotal=0;
		for(Producto p:this.getProductos()) {
			precioTotal = precioTotal + p.getPrecio();
		}
		return precioTotal;
	}
	
	
	
}
