package ar.edu.unq.po2.tp9_observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Investigador implements IListenerSuscriptor{

	private SistemaDeReferencia sistema;
	private List<String> notificaciones;
	
	
	public Investigador(SistemaDeReferencia sistema) {
		this.sistema = sistema;
		this.notificaciones = new ArrayList<String>();
	}


	public List<String> getNotificaciones() {
		return notificaciones;
	}

	
	public void suscribirseAlSistema(Set<String> temaDeInteres) {
		this.sistema.agregarSuscriptor(this, temaDeInteres);
	}

	public void cargarArticulo(Articulo articulo) {
		sistema.cargarArticulo(articulo);
	}


	@Override
	public void update(String notificacion) {
		this.notificaciones.add(notificacion);
	}

	
}
