package ar.edu.unq.po2.práctica_5.Personas;

public class Mascota implements SerVivo{

	
	private String nombre;
	private String raza;


	public String getNombre() {
		return nombre;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public Mascota(String nombre, String raza) {
		this.nombre=nombre;
		this.raza=raza;
	}
	
}
