package ar.edu.unq.po2.práctica_8_Observer.Publicaciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SistemaConcrete implements ISistema{
	
	private List<Articulo> articulos;
	private Map<IObserver,String> observers;
	
	public Map<IObserver, String> getObservers() {
		return observers;
	}
	
	public List<Articulo> getArticulos() {
		return articulos;
	}
	
	
	public SistemaConcrete() {
		this.articulos = new ArrayList<Articulo>();
		this.observers = new HashMap<IObserver, String>();
	}

	@Override
	public void agregarSuscriptor(IObserver investigador, String articuloDeInteres) {
		this.observers.put(investigador, articuloDeInteres);
	}
	
	@Override
	public void eliminarSuscriptor(IObserver investigador, String articuloDeInteres) {
		this.observers.remove(investigador, articuloDeInteres);
	}
	
	@Override
	public void notificar(String articuloDeInteres) {
		for(Entry<IObserver, String> ob : this.getObservers().entrySet()) {
			if(ob.getValue().contains(articuloDeInteres)) {
				ob.getKey().update(articuloDeInteres);
			}
		}
	}
	
	public void agregarArticulo(Articulo articulo) {
		this.getArticulos().add(articulo);
		for(String temaDeInteres:articulo.criterioDeInteres()) {
			this.notificar(temaDeInteres);
		}
	}
	
	public void eliminarArticulo(Articulo articulo) {
		this.getArticulos().remove(articulo);
	}

	
	
}
