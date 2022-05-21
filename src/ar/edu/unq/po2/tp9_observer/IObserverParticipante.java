package ar.edu.unq.po2.tp9_observer;

public interface IObserverParticipante {

	public void updatePreguntas(Partida partida);
	public void notificarRespuestaCorrecta();
	public void notificarParticipanteRespondioCorrectamente(Participante participante, String pregunta);
	public void notificarGanador(Participante participante);
	
}
