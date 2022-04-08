package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {

	private String nombre;
	private List<Persona> integrantes = new ArrayList<Persona>();
 	
	
	public EquipoDeTrabajo(String nombre, List<Persona> personas) {
		this.setNombre(nombre);
		this.setIntegrantes(personas);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setIntegrantes(List<Persona> integrantes) {
		this.integrantes = integrantes;
	}

	
	public int promedioDeEdad(List<Persona> personas) {
		int resultado = 0;
		for(Persona persona:personas) {
			resultado = resultado+persona.getEdad();
		}
		return resultado/personas.size();
	}
	
	
	
	
}
