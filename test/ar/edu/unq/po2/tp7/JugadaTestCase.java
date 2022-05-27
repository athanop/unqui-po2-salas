package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.Poker.Carta;
import ar.edu.unq.po2.tp7.Poker.Jugada;
import ar.edu.unq.po2.tp7.Poker.PokerStatus;

import static org.mockito.Mockito.*
;
class JugadaTestCase {

	//jugada 1
	Carta carta;
	//jugada 2
	Carta otraCarta;
	
	PokerStatus poker;
	
	Jugada jugada1;
	Jugada jugada2;
	
	@BeforeEach
	void setUp() {
		poker = new PokerStatus();
		
		carta = mock(Carta.class);
		when(carta.getPalo()).thenReturn("D");
		when(carta.getColor()).thenReturn("Rojo");
		
		otraCarta = mock(Carta.class);
		when(otraCarta.getPalo()).thenReturn("T");
		when(otraCarta.getColor()).thenReturn("Negro");
		
		
		List<Carta> mano = poker.repartirMano(carta, carta, carta, carta, carta);
		jugada1 = new Jugada(mano);
		List<Carta> otraMano = poker.repartirMano(otraCarta,otraCarta,otraCarta,otraCarta,otraCarta);
		jugada2 = new Jugada(otraMano);
		
		
	}
	
	

	@Test
	void testGanadorDeLaMano() {
		 assertEquals(poker.jugadaGanadora(jugada1, jugada2), "Gana la jugada 2");
	}
	
	@Test
	void testGanadorDelDesempate() {
		 assertEquals("Gana la jugada 2", poker.ganadorDelDesempate(jugada1, jugada2));
	}
	
	@Test
	void testGanadorEntre() {
		 assertEquals("Gana la jugada 1", poker.ganadorEntre("Poker", "Trio"));
	}
	

}
