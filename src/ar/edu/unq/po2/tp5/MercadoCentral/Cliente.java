package ar.edu.unq.po2.tp5.MercadoCentral;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private List<iElementosAPagar> productos = new ArrayList<iElementosAPagar>();
	private double montoAPagar;

	public double getMontoAPagar() {
		return montoAPagar;
	}

	public void setMontoAPagar(double montoAPagar) {
		this.montoAPagar = montoAPagar;
	}
	
	
	public List<iElementosAPagar> getProductos() {
		return productos;
	}
	
	public int getCantidadProductos() {
		return this.getProductos().size();
	}
	

	public void agregar(iElementosAPagar elemento) {
		this.getProductos().add(elemento);
	}

	
	
	
	
	
	
	
}
