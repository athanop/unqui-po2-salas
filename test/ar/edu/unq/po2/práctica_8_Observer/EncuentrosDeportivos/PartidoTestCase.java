package ar.edu.unq.po2.práctica_8_Observer.EncuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PartidoTestCase {

	Partido partido;
	
	@BeforeEach
	void setUp() throws Exception {
		
		partido = new Partido("Ganador", "Futbol");
		
	}

	@Test
	void testConstructorPartidoDeFutbolGanadorConContrincanteBrasil() {
		partido.agregarContrincante("Brasil");
		assertEquals(partido.getResultado(), "Ganador");
		assertEquals(partido.getDeporte(), "Futbol");
		assertTrue(partido.getContrincante().contains("Brasil"));
	}

}
