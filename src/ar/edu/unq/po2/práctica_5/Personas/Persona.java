package ar.edu.unq.po2.pr�ctica_5.Personas;

import java.time.LocalDate;

public class Persona implements SerVivo{

	private String nombre;
	private LocalDate fechaNacimiento;
	
	public String getNombre() {
		return nombre;
	}
	
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	

	public LocalDate fechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	
	public int edad() {
		return LocalDate.now().getYear() - this.fechaNacimiento.getYear();
	}
	
}
