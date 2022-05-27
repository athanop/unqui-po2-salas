package ar.edu.unq.po2.tp9_observer.Concurso;

import java.util.ArrayList;
import java.util.List;

public class Participante implements IObserverParticipante{

	
	private Partida partida;
	private Integer numeroPregunta;
	private String pregunta;
	private List<String> notificaciones;
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}


	public List<String> getNotificaciones() {
		return notificaciones;
	}

	
	public Participante() {
		this.partida = new Partida();
		this.numeroPregunta = 1;
		this.pregunta = new String();
		this.nombre = "";
		this.notificaciones = new ArrayList<String>();
	}
	
	
	public void solicitarUnirse(Partida p) {
		p.agregarAEspera(this);
	}
	
	public void verificarRespuesta(String respuesta) {
		this.partida.verificarRespuesta(this, this.numeroPregunta, respuesta);
	}
	
	
	//COSAS A IMPLEMENTAR DEL OBSERVER
	

	@Override
	public void updatePreguntas(Partida partida) {
		this.numeroPregunta = this.numeroPregunta+1;
		this.pregunta = partida.getCuestionario().get(numeroPregunta);
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
