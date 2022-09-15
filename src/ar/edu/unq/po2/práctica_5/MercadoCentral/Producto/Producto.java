package ar.edu.unq.po2.práctica_5.MercadoCentral.Producto;

import ar.edu.unq.po2.práctica_5.MercadoCentral.IElemento;

public class Producto implements IElemento{

	private String nombre;
	private Double precio;
	
	

	public Double getPrecio() {
		return precio;
	}

	public String getNombre() {
		return nombre;
	}
	
	public Producto() {
	}

	public Producto(String nombre, Double precio) {
		super();
		this.precio = precio;
		this.nombre = nombre;
	}

	
}