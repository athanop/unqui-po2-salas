package ar.edu.unq.po2.práctica_8_Observer.EncuentrosDeportivos;

import java.util.ArrayList;
import java.util.List;

public class AplicacionMovil implements IObserver{

	private List<String> informacion;
	private AdmDePartido administrador;
	
	public AdmDePartido getAdministrador() {
		return administrador;
	}
	
	public List<String> getInformacion() {
		return informacion;
	}
	
	public AplicacionMovil(AdmDePartido administrador) {
		this.informacion = new ArrayList<String>();
		this.administrador = administrador;
	}

	public void suscribir(String tema) {
		this.getAdministrador().suscribir(this, tema);
	}
	
	public void desuscribir(String tema) {
		this.getAdministrador().desuscribir(this, tema);
	}

	@Override
	public void update(String temaDeInteres) {
		this.informacion.add(temaDeInteres);
	}

	

	

}
