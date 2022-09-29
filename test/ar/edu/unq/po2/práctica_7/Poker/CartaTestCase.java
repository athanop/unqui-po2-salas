package ar.edu.unq.po2.pr�ctica_7.Poker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTestCase {

	Carta carta1, carta2;
	
	@BeforeEach
	void setUp() throws Exception {
		
		carta1 = new Carta(Palo.CORAZON, ValorFigura.A, Color.NEGRO);
		carta2 = new Carta(Palo.CORAZON, ValorFigura.SEIS, Color.NEGRO);
	}

	@Test
	void testDosCartasSonDelMismoPalo() {
		assertTrue(carta1.esMismoPaloQue(carta2));
	}

	@Test
	void testDosCartasSonDelMismoValor() {
		carta1 = new Carta(Palo.CORAZON, ValorFigura.SEIS, Color.NEGRO);
		carta2 = new Carta(Palo.CORAZON, ValorFigura.SEIS, Color.NEGRO);
		assertTrue(carta1.esMismoValorQue(carta2));
	}
	
	@Test
	void testLaPrimeraCartaEsMayorQueLaSegundaCarta() {
		carta1 = new Carta(Palo.CORAZON, ValorFigura.A, Color.NEGRO);
		carta2 = new Carta(Palo.CORAZON, ValorFigura.SEIS, Color.NEGRO);
		assertTrue(carta1.esMayorQue(carta2));
	}
	
}
