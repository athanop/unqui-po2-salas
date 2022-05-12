package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTestCase {

	//sut
	PokerStatus poker;
	
	//doc
	Carta primeraCarta;
	Carta segundaCarta;
	Carta terceraCarta;
	Carta cuartaCarta;
	Carta quintaCarta;
	
	@BeforeEach
	void setUp() {
		poker = new PokerStatus(); //setup
		
		//setup
		primeraCarta = new Carta("K","D","Rojo");
		segundaCarta = new Carta("Q","D","Rojo");
		terceraCarta = new Carta("J","D","Rojo");
		cuartaCarta = new Carta("10","D","Negro");
		quintaCarta = new Carta("A","D","Negro");
	}
	
	
	@Test
	void testVerificacionPoker() {
		//verify && exercise
		assertEquals(poker.verificar(primeraCarta, segundaCarta, terceraCarta, cuartaCarta, quintaCarta), "Poker");
	}

	
	@Test
	void testVerificarTieneColor() {
		
		//setup
		primeraCarta = new Carta("J","D","Rojo");
		segundaCarta = new Carta("Q","P","Rojo");
		terceraCarta = new Carta("K","T","Rojo");
		cuartaCarta = new Carta("A","D","Rojo");
		quintaCarta = new Carta("10","D","Rojo");
		
		//verify && exercise
		assertEquals(poker.verificar(primeraCarta, segundaCarta, terceraCarta, cuartaCarta, quintaCarta), "Color");
	}
	
	@Test
	void testVerificarTieneTrio() {
		//setup
		primeraCarta = new Carta("J","D","Rojo");
		segundaCarta = new Carta("A","P","Negro");
		terceraCarta = new Carta("A","T","Rojo");
		cuartaCarta = new Carta("A","D","Negro");
		quintaCarta = new Carta("10","D","Rojo");
				
		//verify && exercise
		assertEquals(poker.verificar(primeraCarta, segundaCarta, terceraCarta, cuartaCarta, quintaCarta), "Trio");
	}
	
	@Test
	void tienePoquer() {
		Carta dobleCarta = mock(Carta.class);
		when(dobleCarta.getPalo()).thenReturn("D");
		when(dobleCarta.esMismoPalo(dobleCarta)).thenReturn(true);

		assertEquals(poker.verificar(primeraCarta, segundaCarta, terceraCarta, cuartaCarta, quintaCarta), "Poker");
	}
	
}
