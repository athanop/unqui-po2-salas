package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.EquipoDeTrabajo.Persona;

class PersonaTestCase {

	Persona persona;
	LocalDate fecha;
	
	
	@BeforeEach
	void setUp() {
		fecha = LocalDate.of(1996, 6, 17);
		persona = new Persona("Rodolfo", fecha);
	}
	
	@Test
	void calcularEdad() {
		assertEquals(26, persona.calcularEdad());
	}

	
	@Test
	void esMenorQue() {
		LocalDate fechaDePepe = LocalDate.of(1992, 6, 17);
		Persona pepe = new Persona("Pepe", fechaDePepe);
		assertTrue(persona.menorQue(pepe));
	}
	
	
}
