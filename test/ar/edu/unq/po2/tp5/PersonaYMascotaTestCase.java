package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaYMascotaTestCase {

	Persona persona1;
	Persona persona2;
	LocalDate fecha1;
	LocalDate fecha2;
	Mascota mascota1;
	Mascota mascota2;
	
	
	@BeforeEach
	void setUp() throws Exception {
		//fechas
		fecha1 = LocalDate.of(1996, 6, 17);
		fecha2 = LocalDate.of(1998, 5, 12);
		
		//personas
		persona1 = new Persona("Marcos", fecha1);
		persona2 = new Persona("Nahuel", fecha2);
		
		//mascotas
		mascota1 = new Mascota("Puchu", "Caniche");
		mascota2 = new Mascota("Mora", "Caniche");
		
	}

	@Test
	void testEdadPersona() {
		assertTrue(persona1.edad() > persona2.edad());
	}
	
	@Test 
	void testConstructorMascota() {
		assertEquals("Puchu", mascota1.getClass());
		assertEquals("Caniche", mascota1.getRaza());
	}

}
