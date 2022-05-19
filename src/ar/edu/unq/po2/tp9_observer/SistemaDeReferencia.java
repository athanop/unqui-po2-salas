package ar.edu.unq.po2.tp9_observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SistemaDeReferencia implements ISistemaObservable{

	private List<Articulo> articulos;
	private Map<String, ArrayList<IListenerSuscriptor>> suscriptores; 
	
	public SistemaDeReferencia() {
		this.articulos = new ArrayList<Articulo>();
		this.suscriptores = new HashMap<String, ArrayList<IListenerSuscriptor>>();
	}


	public void cargarArticulo(Articulo articulo) {
		this.articulos.add(articulo);
		for(String temaDelArticulo:articulo.getCriterios()) {
			this.notificar(temaDelArticulo);
		}
	}


	@Override
	public void agregarSuscriptor(IListenerSuscriptor observer, Set<String> temasDeInteres) {
		for(String temaDeInteres:temasDeInteres) {
			this.vincularObserverConTema(observer, temaDeInteres);
		}
		
	}

	private void vincularObserverConTema(IListenerSuscriptor observer, String temaDeInteres) {
		if(this.suscriptores.get(temaDeInteres) == null) { //si el tema de interés no tiene ningún suscriptor
			this.suscriptores.put(temaDeInteres, new ArrayList<IListenerSuscriptor>()); //asocio el tema con un suscriptor nuevo
		}
		this.suscriptores.get(temaDeInteres).add(observer); //le agrego el suscriptor al tema
	}

	@Override
	public void quitarSuscriptor(IListenerSuscriptor observer, String temaDeInteres) {
		this.suscriptores.get(temaDeInteres).remove(observer);
	}

	@Override
	public void notificar(String temaDelArticulo) {
		if(this.suscriptores.containsKey(temaDelArticulo)) {
			this.notificarASuscriptorSobre(temaDelArticulo);
		}
	}
	
	public void notificarASuscriptorSobre(String temaDeArticulo) {
		for(IListenerSuscriptor suscriptor:this.suscriptores.get(temaDeArticulo)) {
			suscriptor.update(this.notificacionConElTema(temaDeArticulo));
		}	
	}


	private String notificacionConElTema(String temaDeArticulo) {
		return "Se agregó un nuevo artículo con tu tema de interés" + temaDeArticulo;
	}
	
	
	
}
