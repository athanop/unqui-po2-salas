package ar.edu.unq.po2.práctica_6.BancoYPrestamos;

public class Cliente {
	
	private String nombre;
	private String direccion;
	private int edad;
	private Double netoAnual;
	private Double netoMensual;
	
	public Double getNetoAnual() {
		return netoAnual;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}

	public Double getNetoMensual() {
		return netoMensual;
	}
	
	public Cliente(String nombre, String direccion, int edad, Double netoAnual, Double netoMensual) {
		super();
		this.nombre= nombre;
		this.direccion= direccion;
		this.edad = edad;
		this.netoAnual = netoAnual;
		this.netoMensual = netoMensual;
	}


	
	
}
