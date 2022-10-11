package ar.edu.unq.po2.práctica_8_Observer.EncuentrosDeportivos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Partido {

	private String resultado;
	private List<String> contrincante;
	private String deporte;
	

	public String getResultado() {
		return resultado;
	}

	public String getDeporte() {
		return deporte;
	}

	public List<String> getContrincante() {
		return contrincante;
	}
	
	
	public Partido(String resultado, String deporte) {
		this.resultado = resultado;
		this.deporte = deporte;
		this.contrincante = new ArrayList<String>();
	}
	
	public void agregarContrincante(String contrincante) {
		this.getContrincante().add(contrincante);
	}
	
	public void eliminarContrincante(String contrincante) {
		this.getContrincante().remove(contrincante);
	}

	public List<String> datosDelPartido(){
		List<String> datos = Arrays.asList(this.getDeporte(), this.getResultado());
		datos.addAll(this.getContrincante());
		return datos;
	}
		
}
