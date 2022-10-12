package ar.edu.unq.po2.práctica_8_Observer.Concurso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mockito.internal.stubbing.answers.ThrowsException;

public class Partida implements IPartida{
	
	private List<IObserver> jugadoresEnEspera;
	private List<IObserver> jugadoresAceptados;
	private Map<Integer, String> cuestionario;
	private Map<Integer, String> respuestas;
	private Map<IObserver, Integer> puntaje;
	
	public List<IObserver> getParticipantesJugando() {
		return jugadoresAceptados;
	}

	public List<IObserver> getParticipantesEnEspera() {
		return jugadoresEnEspera;
	}
	
	public Map<Integer, String> getCuestionario() {
		return cuestionario;
	}
	
	public void agregarPregunta(Integer numero, String pregunta) {
		this.cuestionario.put(numero, pregunta);
	}
	
	public void eliminarPregunta(Integer numero, String pregunta) {
		this.cuestionario.remove(numero, pregunta);
	}
	
	public Partida() {
		this.jugadoresEnEspera = new ArrayList<IObserver>();
		this.jugadoresAceptados = new ArrayList<IObserver>();
		this.cuestionario = new HashMap<Integer, String>();
		this.respuestas = new HashMap<Integer, String>();
		this.puntaje = new HashMap<IObserver, Integer>();
	}

	@Override
	public void agregarParticipante (IObserver participante) throws Exception{
		if(this.jugadoresEnEspera.contains(participante) && this.jugadoresAceptados.size() < 5) {
			this.jugadoresAceptados.add(participante);
			this.jugadoresEnEspera.remove(participante);
			participante.updatePreguntas(this);
		}
		else{ 
			new Exception("La partida tiene 5 jugadores");
		}
	}

	@Override
	public void eliminarParticipante(IObserver participante) {
		if(this.jugadoresAceptados.contains(participante)) {
			this.jugadoresAceptados.remove(participante);
		}
	}
	
	public void agregarAEspera(IObserver participante) {
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
	
	@Override
	public void sumarUnPunto(IObserver participante) {
		this.puntaje.put(participante, this.puntaje.get(participante)+1);
	}
	
	@Override
	public void notificarRespuestaCorrecta(IObserver participante) {
		participante.notificarRespuestaCorrecta();
	}
	
	@Override
	public void notificarParticipanteRespondioCorrectamente(Participante participante, Integer numeroPregunta) {
		for (IObserver p : this.getParticipantesJugando()) {
			p.notificarParticipanteRespondioCorrectamente(participante, this.cuestionario.get(numeroPregunta));
		}
	}
	
	@Override
	public void notificarATodosQueHayUnGanador(Participante participante) {
		for(IObserver part : this.getParticipantesJugando()) {
			part.notificarGanador(participante);
		}
	}


	

	
	
}
