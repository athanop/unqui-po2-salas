package ar.edu.unq.po2.tp9_observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Servidor implements IObserverServidor{

	private List<String> intereses;
	private Set<Partido> partidos;
	
	public Set<Partido> getPartidos() {
		return partidos;
	}
	
	public Servidor() {
		this.intereses = new ArrayList<String>();
		this.partidos = new HashSet<Partido>();
	}


	public void agregarPartido(Partido partido) {
		this.getPartidos().add(partido);
	}
	
	public void suscribirseAGestorDePartido(GestorDePartido gestor, Set<String> intereses) {
		gestor.agregarObserver(this, intereses);
		this.intereses.addAll(intereses);
	}
	
	
	@Override
	public void update(Partido partido) {
		this.agregarPartido(partido);
	}


	
}
