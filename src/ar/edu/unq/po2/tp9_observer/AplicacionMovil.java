package ar.edu.unq.po2.tp9_observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AplicacionMovil implements IObserverServidor{
	
	private List<String> resultadosDeInteres;

	public AplicacionMovil() {
		this.resultadosDeInteres = new ArrayList<String>();
	}

	
	public void suscribirseAGestorDePartidos(GestorDePartido gestor, Set<String> intereses) {
		gestor.agregarObserver(this, intereses);
	}


	@Override
	public void update(Partido partido) {
		this.agregarResultadoDePartido(partido);
		
	}

	private void agregarResultadoDePartido(Partido partido) {
		this.getResultadosDeInteres().add(partido.getResultado());
	}


	public List<String> getResultadosDeInteres() {
		return resultadosDeInteres;
	}
	

}
