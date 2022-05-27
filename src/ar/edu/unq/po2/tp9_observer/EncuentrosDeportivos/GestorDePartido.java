package ar.edu.unq.po2.tp9_observer.EncuentrosDeportivos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GestorDePartido {

	private Set<Partido> partidos;
	private Map<String, ArrayList<IObserverServidor>> intereses;
	
	public GestorDePartido() {
		this.partidos = new HashSet<Partido>();
		this.intereses = new HashMap<String, ArrayList<IObserverServidor>>();
	}


	public void agregarObserver(IObserverServidor observer, Set<String> intereses) {
		for(String interes:intereses) {
			this.vincularInteresConObserver(interes, observer);
		}
	}

	private void vincularInteresConObserver(String interes, IObserverServidor observer) {
		if(suscriptoresConInteresEn(interes) == null) {
			this.intereses.put(interes, new ArrayList<IObserverServidor>());
		}
		suscriptoresConInteresEn(interes).add(observer);
	}

	private ArrayList<IObserverServidor> suscriptoresConInteresEn(String interes) {
		return this.intereses.get(interes);
	}

	public void recibirPartido(Partido partido) {
		this.partidos.add(partido);
		for(String interes:this.datosDelPartido(partido)) {
			notificar(interes, partido);
		}
	}

	private ArrayList<String> datosDelPartido(Partido partido) {
		ArrayList<String> datos = new ArrayList<String>();
		datos.add(partido.getDeporte());
		datos.addAll(partido.getContrincantes());
		return datos;
	}
	

	private void notificar(String interes, Partido partido) {
		if(this.intereses.containsKey(interes)) {
			notificarSuscriptores(suscriptoresConInteresEn(interes), partido);
		}
		
	}

	private void notificarSuscriptores(ArrayList<IObserverServidor> suscriptores, Partido partido) {
		for(IObserverServidor suscriptor:suscriptores) {
			suscriptor.update(partido);
		}
	}
	
}
