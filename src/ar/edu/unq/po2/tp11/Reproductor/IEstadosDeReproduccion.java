package ar.edu.unq.po2.tp11.Reproductor;

public interface IEstadosDeReproduccion {

	public void play(Reproductor mp3) throws Exception;
	public void pause(Reproductor mp3) throws Exception;
	public void stop(Reproductor mp3);
	public Boolean enReproduccion(Reproductor mp3);
	
	
}
