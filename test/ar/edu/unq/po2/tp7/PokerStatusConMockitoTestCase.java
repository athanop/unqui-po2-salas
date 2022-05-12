package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

class PokerStatusConMockitoTestCase {

		//sut
		PokerStatus poker;
		
		//doc
		Carta dobleCarta;
	
	
	@BeforeEach
	void setUp() {
		poker = new PokerStatus();
		
	}
	
	
	@Test
	void testVerificarTienePoker() {
		
		dobleCarta = mock(Carta.class);
		when(dobleCarta.getPalo()).thenReturn("D");
		when(dobleCarta.esMismoPalo(dobleCarta)).thenReturn(true);
		
		
		
		
		assertEquals("Poker", poker.verificar(dobleCarta, dobleCarta, dobleCarta, dobleCarta, dobleCarta));
	}

	
	@Test
	void testVerificarTieneColor() {
		
		dobleCarta = mock(Carta.class);
		when(dobleCarta.getColor()).thenReturn("Negro");
		when(dobleCarta.esMismoColor(dobleCarta)).thenReturn(true);
	
		
		
		assertEquals("Color", poker.verificar(dobleCarta, dobleCarta, dobleCarta, dobleCarta, dobleCarta));
	}


	
					
			
	
	
	
}


