package ar.edu.unq.po2.práctica_8_Observer.Concurso;

import java.util.List;
import java.util.Map;

public interface IObserver {

	public void solicitarParticipacion() throws Exception;
	public void updatePreguntas(Partida partida);
	public void notificarRespuestaCorrecta();
	public void notificarParticipanteRespondioCorrectamente(Participante participante, String pregunta);
	public void notificarGanador(Participante participante);
}
