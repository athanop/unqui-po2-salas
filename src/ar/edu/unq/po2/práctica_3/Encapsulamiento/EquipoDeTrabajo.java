package ar.edu.unq.po2.práctica_3.Encapsulamiento;

import java.util.List;

public class EquipoDeTrabajo {

	private String nombre;
	private List<Persona> integrantes;
	
	public String getNombre() {
		return nombre;
	}
	
	public EquipoDeTrabajo(String nombre, List<Persona> integrantes) {
		this.nombre = nombre;
		this.integrantes = integrantes;
	}

	public int promedioEdad() {
		int promedio = (int) this.integrantes.stream().mapToInt(Persona::edad).average().orElse(0);
		return promedio;
	}

	
	
	
	
	
}
