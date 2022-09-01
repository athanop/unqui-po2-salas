package ar.edu.unq.po2.práctica_3.Encapsulamiento;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {

	Persona persona1;
	Persona persona2;
	LocalDate fecha1;
	LocalDate fecha2;
	
	
	@BeforeEach
	void setUp() throws Exception {
		fecha1 = LocalDate.of(1996, 6, 17);
		fecha2 = LocalDate.of(2002, 2, 15);
		persona1 = new Persona("Nahuel", fecha1);
		persona2 = new Persona("Marcos", fecha2);
		
	}

	@Test
	void testUnaPersonaConoceSuNombre() {
		assertEquals("Nahuel", persona1.getNombre());
	}

	
	@Test
	void testUnaPersonaConoceSuEdad() {
		assertEquals(26, persona1.edad());
	}

	
	@Test
	void testUnaPersonaEsMenorQueLaOtra() {
		assertTrue(persona2.menorQue(persona1));
	}

}
