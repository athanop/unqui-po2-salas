package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTestCase {

	Carta carta1;
	Carta carta2;
	Carta carta3;
	Carta carta4;
	Carta carta5;
	
	@BeforeEach
	void setUp() throws Exception{
		//setup
		carta1= new Carta("K","D","Rojo");
		carta2= new Carta("5","D","Rojo");
		carta3= new Carta("Q","C","Rojo");
		carta4= new Carta("5","P","Negro");
		carta5= new Carta("A","P","Negro");
	}
	
	@Test
	void esMayorQue() {
		//verify && exercise
		assertTrue(carta5.esMayorQue(carta4));
	}

	
	@Test
	void esMenorQue() {
		//verify && exercise
		assertFalse(carta4.esMayorQue(carta5));
	}
	
	
	@Test
	void sonMismoPalo() {
		//verify && exercise
		assertTrue(carta1.esMismoPalo(carta2));
	}
	
	@Test
	void sonMismoColor() {
		//verify && exercise
		assertTrue(carta1.esMismoColor(carta2));
	}
}
