package ar.edu.unq.po2.práctica_8_Observer.Concurso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Participante implements IObserver{

	private String nombre;
	private Partida partida;
	private Integer numPregunta;
	private String pregunta;
	private List<String> notificaciones;

	
	public String getNombre() {
		return nombre;
	}
	
	
	public List<String> getNotificaciones() {
		return notificaciones;
	}
	
	
	public Participante(String nombre) {
		this.partida = new Partida();
		this.numPregunta = 1;
		this.pregunta = new String();
		this.nombre = "";
		this.notificaciones = new ArrayList<String>();
		this.partida = new Partida();
	}
	
	public void verificarRespuesta(String respuesta) {
		this.partida.verificarRespuesta(this, this.numPregunta, respuesta);
	}


	@Override
	public void solicitarParticipacion() throws Exception {
		this.partida.agregarParticipante(this);
	}

	@Override
	public void updatePreguntas(Partida partida) {
		this.numPregunta = this.numPregunta+1;
		this.pregunta = partida.getCuestionario().get(numPregunta);
	}

	@Override
	public void notificarRespuestaCorrecta() {
		this.getNotificaciones().add("Respuesta correcta");
	}

	@Override
	public void notificarParticipanteRespondioCorrectamente(Participante participante, String pregunta) {
		this.getNotificaciones().add(participante.getNombre() + "respondió correctamente" + pregunta);
		
	}

	@Override
	public void notificarGanador(Participante participante) {
		this.getNotificaciones().add("El ganador de la partida es: " + participante.getNombre());
	}
	
}
