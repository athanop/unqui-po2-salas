package ar.edu.unq.po2.tp5.PersonasYMascotas;

public class Mascota implements Nombre{

	private String nombre;
	private String raza;
	
	
	public String getNombre() {
		return nombre;
	}
	public String getRaza() {
		return raza;
	}
	
	
	public Mascota(String nombre, String raza) {
		super();
		this.nombre = nombre;
		this.raza = raza;
	}
	
	
	
}
