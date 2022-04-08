package ar.edu.unq.po2.tp3;

import java.time.LocalDate;

/*Si un objeto cualquiera que le pide la edad a una Persona: ¿Conoce cómo ésta calcula u
obtiene tal valor? ¿Cómo se llama el mecanismo de abstracción que permite esto?

No, el objeto que lo pide no sabe cómo la persona calcula su edad. 
El mecanismo se llama encapsulamiento. 
*/


public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	private LocalDate fechaDeNacimiento;
	
	public Persona(String nombre, LocalDate fecha) {
		setNombre(nombre);
		setFechaDeNacimiento(fecha);
	}
	
	//este constructor es del equipo de trabajo
	public Persona(String nombre, String apellido,int edad) {
		setNombre(nombre);
		setApellido(apellido);
		setEdad(edad);
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


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	


}
