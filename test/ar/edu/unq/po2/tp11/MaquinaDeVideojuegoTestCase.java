package ar.edu.unq.po2.tp11;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp11.Videojuego.EstadoDosJugadores;
import ar.edu.unq.po2.tp11.Videojuego.EstadoInicio;
import ar.edu.unq.po2.tp11.Videojuego.EstadoUnJugador;
import ar.edu.unq.po2.tp11.Videojuego.MaquinaDeVideojuego;

class MaquinaDeVideojuegoTestCase {

	MaquinaDeVideojuego maquina;
	EstadoInicio estadoSinFichas;
	EstadoUnJugador estadoUnJugador;
	EstadoDosJugadores estadoDosJugadores;
	
	@BeforeEach
	void setUp() throws Exception {
	maquina = new MaquinaDeVideojuego();
	estadoSinFichas = mock(EstadoInicio.class);
	estadoUnJugador = mock(EstadoUnJugador.class);
	estadoDosJugadores = mock(EstadoDosJugadores.class);
		
	}

	@Test
	void testCuandoSePresionaElBotonDeInicioDeLaMaquinaSinFichas_PideQueIngresenFichas() {	
	assertEquals("Ingrese fichas", maquina.botonDeInicio());
	}

	
	@Test
	void testCuandoSePresionaElBotonDeInicioDeLaMaquinaConUnaFicha_ComienzaElJuegoParaUnJugador() {	
		maquina.ingresarFichas(1);
		String resultado = maquina.botonDeInicio();
		assertEquals("Comienza el juego para un jugador", resultado);
	}
	
	
	@Test
	void testCuandoSePresionaElBotonDeInicioDeLaMaquinaConDosOMasFichas_ComienzaElJuegoParaDosJugadores() {	
		maquina.ingresarFichas(2);
		String resultado = maquina.botonDeInicio();
		assertEquals("Comienza el juego para dos jugadores", resultado);
	}
}
