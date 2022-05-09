package ar.edu.unq.po2.tp6;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNeto;

	
	public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoNeto) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNeto = sueldoNeto;
	}

	

	public int getEdad() {
		return edad;
	}

	public double getSueldoNeto() {
		return sueldoNeto;
	}

	public void solicitarPrestamo(IBanco banco, SolicitudDeCredito solicitud) {
		banco.registrarSolicitud(solicitud);
	}

	public double sueldoNetoAnual() {
		return this.getSueldoNeto()*12;
	}
	

}
