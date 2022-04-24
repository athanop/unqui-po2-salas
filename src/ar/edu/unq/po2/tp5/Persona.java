package ar.edu.unq.po2.tp5;

import java.time.LocalDate;

public class Persona implements Nombre{

	private String nombre;
	private LocalDate fechaNacimiento;
	
	public String getNombre() {
		return nombre;
	}
	
	public int edad() {
		return (LocalDate.now().getYear()) - (getFechaDeNacimiento().getYear());
	}
	
	public LocalDate getFechaDeNacimiento() {
		return fechaNacimiento;
	}
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	

}
