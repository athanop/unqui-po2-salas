package ar.edu.unq.po2.tp9_observer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PartidaTestCase {

	Partida partida;
	Participante participante;
	Participante otroParticipante;
	HashMap<Integer, String> cuestionario;
	HashMap<Integer, String> respuestas;
	
	@BeforeEach
	void setUp() throws Exception {
		partida = new Partida();
		participante = new Participante();
		otroParticipante = new Participante();
		cuestionario = new HashMap<Integer, String>();
		respuestas = new HashMap<Integer, String>();
		
		this.cuestionario.put(0, "pregunta 1");
		this.cuestionario.put(1, "pregunta 2");
		
		this.respuestas.put(0, "burro");
		this.respuestas.put(1, "simio");
		
		this.partida.setCuestionario(cuestionario);
		this.partida.setRespuestas(respuestas);
	}

	
	@Test
	void testLaPartidaTieneUnParticipanteEnEspera() {
		participante.solicitarUnirse(partida);
		assertEquals(1, partida.getParticipantesEnEspera().size());
	}

	
	@Test
	void testParticipanteRespondeCorrectamente() {
		participante.solicitarUnirse(partida);
		partida.aceptarJugador(participante);
		participante.verificarRespuesta("simio");
		assertEquals(participante.getNotificaciones().size(),0);
	}

	@Test
	void testLaPartidaTieneDosParticipantesAceptados() {
		participante.solicitarUnirse(partida);
		otroParticipante.solicitarUnirse(partida);
		partida.aceptarJugador(participante);
		partida.aceptarJugador(otroParticipante);
		assertEquals(2, partida.getParticipantesJugando().size());
	}
	
}
