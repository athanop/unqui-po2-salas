package ar.edu.unq.po2.tp3;

import java.time.LocalDate;

/*Si un objeto cualquiera que le pide la edad a una Persona: ¿Conoce cómo ésta calcula u
obtiene tal valor? ¿Cómo se llama el mecanismo de abstracción que permite esto?

No, el objeto que lo pide no sabe cómo la persona calcula su edad. 
El mecanismo se llama encapsulamiento. 
*/


public class Persona {
	
	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	
	public Persona(String nombre, LocalDate fecha) {
		setNombre(nombre);
		setFechaDeNacimiento(fecha);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public boolean menorQue(Persona persona) {
		return this.calcularEdad() < persona.calcularEdad();
	}

	public int calcularEdad() {
		return (LocalDate.now().getYear()) - (getFechaDeNacimiento().getYear());
	}
	


}
