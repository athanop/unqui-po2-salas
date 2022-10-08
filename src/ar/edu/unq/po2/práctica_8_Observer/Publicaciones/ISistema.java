package ar.edu.unq.po2.pr�ctica_8_Observer.Publicaciones;


public interface ISistema {

	
	public void agregarSuscriptor(IObserver investigador, String articuloDeInteres);
	
	public void eliminarSuscriptor(IObserver investigador, String articuloDeInteres);
	
	public void notificar(String articuloDeInteres);

}
