package ar.edu.unq.po2.práctica_3.Encapsulamiento;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {

	EquipoDeTrabajo equipo;
	Persona persona1;
	Persona persona2;
	Persona persona3;
	Persona persona4;
	Persona persona5;
	LocalDate fecha1;
	LocalDate fecha2;
	
	List<Persona> integrantes;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		fecha1 = LocalDate.of(1996, 6, 17);
		fecha2 = LocalDate.of(2002, 2, 15);
		persona1 = new Persona("Nahuel", fecha1);
		persona2 = new Persona("Marcos", fecha2);
		persona3 = new Persona("Maria", fecha2);
		persona4 = new Persona("Juana", fecha1);
		persona5 = new Persona("Lucia", fecha1);
		integrantes = Arrays.asList(persona1, persona2);
		
		equipo = new EquipoDeTrabajo("Dinamita", integrantes);
	}

	@Test
	void testUnEquipoConoceSuNombre() {
		assertEquals("Dinamita", equipo.getNombre());
	}

	
	@Test
	void testUnEquipoConoceElPromedioDeEdadDeSusIntegrantes() {
		assertEquals(23, equipo.promedioEdad());
	}

	
}
