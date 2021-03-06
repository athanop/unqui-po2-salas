package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.EquipoDeTrabajo.EquipoDeTrabajo;
import ar.edu.unq.po2.tp3.EquipoDeTrabajo.Persona;

class EquipoDeTrabajoTestCase {

	EquipoDeTrabajo equipo;
	
	private List<Persona> integrantes = new ArrayList<Persona>();
	private Persona jose;
	private Persona mario;
	private Persona maria;
	private Persona laura;
	private Persona lautaro;
	
	
	@BeforeEach
	void setUp() {
		
		jose = new Persona("Jos?", "Sand", 15);
		mario = new Persona("Mario", "Casas", 25);
		maria = new Persona("Mar?a", "Caceres", 30);
		laura = new Persona("Laura", "Blood", 24);
		lautaro = new Persona("Lautaro", "Martinez", 44);
		integrantes.add(jose);
		integrantes.add(mario);
		integrantes.add(maria);
		integrantes.add(laura);
		integrantes.add(lautaro);
		equipo = new EquipoDeTrabajo("Rocket", integrantes);
	}
	
	
	
	@Test
	public void promedioEdades() {
		assertEquals(27,equipo.promedioDeEdad(integrantes));
		
	}

	@Test
	public void nombreEquipo() {
		assertEquals("Rocket", equipo.getNombre());
	}
	
}
