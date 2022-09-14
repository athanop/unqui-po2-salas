package ar.edu.unq.po2.práctica_5.MercadoCentral;

public class Producto {

	private String nombre;
	private Double precio;
	
	

	public Double getPrecio() {
		return precio;
	}

	public String getNombre() {
		return nombre;
	}
	

	public Producto(String nombre, Double precio) {
		super();
		this.precio = precio;
		this.nombre = nombre;
	}

	
}
