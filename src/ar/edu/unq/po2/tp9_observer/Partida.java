package ar.edu.unq.po2.tp9_observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Partida {

	private List<Participante> participantesJugando;
	private List<Participante> participantesEnEspera;
	private Map<Integer, String> cuestionario;
	private Map<Integer, String> respuestas;
	private Map<Participante, Integer> puntajes;
	

	
	public List<Participante> getParticipantesJugando() {
		return participantesJugando;
	}

	public List<Participante> getParticipantesEnEspera() {
		return participantesEnEspera;
	}
	
	public Map<Integer, String> getCuestionario() {
		return cuestionario;
	}
	
	public void setCuestionario(Map<Integer, String> cuestionario) {
		this.cuestionario = cuestionario;
	}

	public void setRespuestas(Map<Integer, String> respuestas) {
		this.respuestas = respuestas;
	}
	
	
	public Partida() {
		this.cuestionario = new HashMap<Integer, String>();
		this.respuestas = new HashMap<Integer, String>();
		this.participantesJugando = new ArrayList<Participante>();
		this.participantesEnEspera = new ArrayList<Participante>();
		this.puntajes = new HashMap<Participante, Integer>();
		
	}
	
	public void aceptarJugador(Participante participante) {
		if(this.getParticipantesEnEspera().contains(participante)) {
			this.getParticipantesEnEspera().remove(participante);
			this.getParticipantesJugando().add(participante);
			participante.updatePreguntas(this);
		}
	}


	public void agregarAEspera(Participante participante) {
		this.getParticipantesEnEspera().add(participante);
	}
	
	public void verificarRespuesta(Participante participante, Integer numeroPregunta, String respuesta) {
		if((String)this.respuestas.get(numeroPregunta) == (String)respuesta) {
			this.sumarUnPunto(participante);
			this.notificarRespuestaCorrecta(participante);
			this.notificarParticipanteRespondioCorrectamente(participante, numeroPregunta);
			participante.updatePreguntas(this);
		}
	}
	
	public void sumarUnPunto(Participante participante) {
		this.puntajes.put(participante, this.puntajes.get(participante)+1);
	}
	
	public void notificarRespuestaCorrecta(Participante participante) {
		participante.notificarRespuestaCorrecta();
	}
	
	
	public void notificarParticipanteRespondioCorrectamente(Participante participante, Integer numeroPregunta) {
		for (Participante p : this.getParticipantesJugando()) {
			p.notificarParticipanteRespondioCorrectamente(participante, this.cuestionario.get(numeroPregunta));
		}
	}
	
	public void notificarATodosQueHayUnGanador(Participante participante) {
		for(Participante part : this.getParticipantesJugando()) {
			part.notificarGanador(participante);
		}
	}

	

	
}
