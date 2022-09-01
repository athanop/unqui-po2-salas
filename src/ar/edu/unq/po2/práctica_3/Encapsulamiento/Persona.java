package ar.edu.unq.po2.práctica_3.Encapsulamiento;

import java.time.LocalDate;

public class Persona {

	
	private String nombre;
	private LocalDate fechaNacimiento;
	
	public String getNombre() {
		return nombre;
	}
	
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	public int edad() {
		return LocalDate.now().getYear() - this.fechaNacimiento.getYear();
	}
	
	
	public Boolean menorQue(Persona persona) {
		return this.edad() < persona.edad();
	}


	
	
	
}
