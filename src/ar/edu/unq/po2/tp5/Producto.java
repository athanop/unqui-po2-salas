package ar.edu.unq.po2.tp5;

public class Producto{
	
	private String nombre;
	private double precio;
	
	
	public Producto(String nombre, Double precio) {
		this.setNombre(nombre);
		this.setPrecio(precio);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	

	
	
}


