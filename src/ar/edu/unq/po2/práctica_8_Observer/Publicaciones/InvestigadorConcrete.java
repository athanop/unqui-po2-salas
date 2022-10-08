package ar.edu.unq.po2.práctica_8_Observer.Publicaciones;

import java.util.ArrayList;
import java.util.List;

public class InvestigadorConcrete implements IObserver{

	private List<String> notificacionesDeInteres;
	
	public List<String> getNotificacionesDeInteres() {
		return notificacionesDeInteres;
	}
		
	public InvestigadorConcrete() {
		this.notificacionesDeInteres = new ArrayList<String>();
	}

	@Override
	public void update(String articuloDeInteres) {
		this.getNotificacionesDeInteres().add(articuloDeInteres);
	}
	
	public void agregarArticulo(SistemaConcrete sistema, Articulo articulo) {
		sistema.agregarArticulo(articulo);
	}
	
	public void eliminarArticulo(SistemaConcrete sistema, Articulo articulo) {
		sistema.eliminarArticulo(articulo);
	}
	
	public void suscribirse(SistemaConcrete sistema, String articuloDeInteres) {
		sistema.agregarSuscriptor(this, articuloDeInteres);
	}
	
	public void desuscribirse(SistemaConcrete sistema, String articuloDeInteres) {
		sistema.eliminarSuscriptor(this, articuloDeInteres);
	}

	
}
