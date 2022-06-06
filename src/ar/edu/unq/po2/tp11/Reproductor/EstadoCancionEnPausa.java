package ar.edu.unq.po2.tp11.Reproductor;

public class EstadoCancionEnPausa implements IEstadosDeReproduccion{

	@Override
	public void play(Reproductor mp3) throws Exception{
		throw new Exception("Error");
	}

	@Override
	public void pause(Reproductor mp3) {
		mp3.getCancion().play();
		mp3.setEstado(new EstadoReproduciendo());
	}

	@Override
	public void stop(Reproductor mp3) {
		mp3.getCancion().stop();
		mp3.setEstado(new EstadoSeleccionDeCanciones());
	}

	@Override
	public Boolean enReproduccion(Reproductor mp3) {
		return false;
	}

}
