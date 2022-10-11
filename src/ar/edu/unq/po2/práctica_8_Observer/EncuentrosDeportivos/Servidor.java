package ar.edu.unq.po2.práctica_8_Observer.EncuentrosDeportivos;

import java.util.ArrayList;
import java.util.List;

public class Servidor implements IObserver{

	private List<String> informacionDeporte;
	private AdmDePartido administrador;
	
	public AdmDePartido getAdministrador() {
		return administrador;
	}
	
	public Servidor(AdmDePartido administrador) {
		this.informacionDeporte = new ArrayList<String>();
		this.administrador = administrador;
	}

	public List<String> getInformacionDeporte() {
		return informacionDeporte;
	}

	
	public void suscribir(String deporte) {
		this.getAdministrador().suscribir(this, deporte);
	}
	
	public void desuscribir(String deporte) {
		this.getAdministrador().desuscribir(this, deporte);
	}
	

	@Override
	public void update(String deporte) {
		this.informacionDeporte.add(deporte);
	}


	

}
