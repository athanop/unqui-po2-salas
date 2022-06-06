package ar.edu.unq.po2.tp11.Reproductor;

public class Reproductor {

	private IEstadosDeReproduccion estado;
	private Song cancion;
	
	
	public Reproductor() {
		this.setEstado(new EstadoSeleccionDeCanciones());
	}
	
	public Song getCancion() {
		return cancion;
	}
	
	public void setEstado(IEstadosDeReproduccion estado) {
		this.estado = estado;
	}

	public void play() throws Exception {
		this.estado.play(this);
	}
	
	public void pause() throws Exception {
		this.estado.pause(this);
	}
	
	public void stop() {
		this.estado.stop(this);;
	}

	public void agregarCancionAReproduccion(Song song) {
		this.cancion = song;
	}
	
	public void quitarCancionDeReproduccion() {
		this.cancion = null;
	}
	
	public Boolean enReproduccion() {
		return this.estado.enReproduccion(this);
	}
	
	

	



	
}
