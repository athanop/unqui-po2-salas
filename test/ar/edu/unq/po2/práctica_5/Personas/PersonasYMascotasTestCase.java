package ar.edu.unq.po2.práctica_5.Personas;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonasYMascotasTestCase {

	SerVivo persona1, persona2, mascota1, mascota2;
	
	
	@BeforeEach
	void setUp() throws Exception {
	
		persona1 = new Persona("Marcos", LocalDate.of(2020, 5, 5));
		persona2 = new Persona("Nahuel", LocalDate.of(2021, 5, 5));
		mascota1 = new Mascota("Theo", "Caniche");
		mascota2 = new Mascota("Puchu", "Caniche");
		
	}

	@Test
	void testTodosLosSeresVivosEnUnArray() {
		List<SerVivo> collection = Arrays.asList(persona1, persona2, mascota1, mascota2);
		assertEquals(collection.size(), 4);
	}
	
	@Test
	void testUnaPersonaConoceSuNombre() {
		assertEquals(persona1.getNombre(), "Marcos");
	}
	
	@Test
	void testUnaMascotaConoceSuNombre() {
		assertEquals(mascota1.getNombre(), "Theo");
	}

}
