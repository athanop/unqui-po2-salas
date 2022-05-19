package ar.edu.unq.po2.tp9_observer;

import java.util.Set;

public interface ISistemaObservable {
	
	public void agregarSuscriptor(IListenerSuscriptor observer, Set<String> temasDeInteres);
	public void quitarSuscriptor(IListenerSuscriptor observer, String temaDeInteres);
	public void notificar(String temaDeArticulo);
	
	
}
