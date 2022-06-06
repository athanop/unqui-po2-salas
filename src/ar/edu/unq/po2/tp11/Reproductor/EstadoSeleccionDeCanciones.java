package ar.edu.unq.po2.tp11.Reproductor;

public class EstadoSeleccionDeCanciones implements IEstadosDeReproduccion{

	@Override
	public void play(Reproductor mp3) {
		mp3.getCancion().play();
		mp3.setEstado(new EstadoReproduciendo());
	}

	@Override
	public void pause(Reproductor mp3) throws Exception{
		throw new Exception("Error");
	}

	@Override
	public void stop(Reproductor mp3){
		
	}

	@Override
	public Boolean enReproduccion(Reproductor mp3) {
		return false;
	}

}
