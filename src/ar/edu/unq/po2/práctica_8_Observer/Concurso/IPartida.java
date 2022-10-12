package ar.edu.unq.po2.práctica_8_Observer.Concurso;

public interface IPartida {

	
	public void agregarParticipante(IObserver participante) throws Exception;
	public void eliminarParticipante(IObserver participante);
	public void notificarATodosQueHayUnGanador(Participante participante);
	public void notificarParticipanteRespondioCorrectamente(Participante participante, Integer numeroPregunta);
	public void notificarRespuestaCorrecta(IObserver participante);
	public void sumarUnPunto(IObserver participante);
}
