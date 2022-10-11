package ar.edu.unq.po2.práctica_8_Observer.EncuentrosDeportivos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AdmDePartido implements IPartido{

	private Map<IObserver, String> observers;
	private List<Partido> partidos;
	
	public List<Partido> getPartidos() {
		return partidos;
	}
	
	public Map<IObserver, String> getObservers() {
		return observers;
	}
	
	public AdmDePartido() {
		this.partidos = new ArrayList<Partido>();
		this.observers = new HashMap<IObserver, String>();
	}
	
	public void agregarPartido(Partido partido) {
		this.partidos.add(partido);
		for(String tema:partido.datosDelPartido()) {
			notificar(tema);
		}
	}
	
	public void eliminarPartido(Partido partido) {
		this.partidos.remove(partido);
	}
	
	@Override
	public void suscribir(IObserver observer, String temaDeInteres) {
		this.getObservers().put(observer, temaDeInteres);
	}

	@Override
	public void desuscribir(IObserver observer, String temaDeInteres) {
		this.getObservers().remove(observer, temaDeInteres);
	}

	@Override
	public void notificar(String temaDeInteres) {
		for(Entry<IObserver, String> observer : this.getObservers().entrySet()) {
			if(observer.getValue().contains(temaDeInteres)) {
				observer.getKey().update(temaDeInteres);
			}
		}
	}


}
