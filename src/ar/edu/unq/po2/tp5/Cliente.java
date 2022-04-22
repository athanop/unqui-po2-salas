package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private List<Producto> productos = new ArrayList<Producto>();
	private double montoAPagar;

	public double getMontoAPagar() {
		return montoAPagar;
	}

	public void setMontoAPagar(double montoAPagar) {
		this.montoAPagar = montoAPagar;
	}
	
	
	public List<Producto> getProductos() {
		return productos;
	}
	
	public int getCantidadProductos() {
		return this.getProductos().size();
	}
	

	public void agregarProducto(Producto producto) {
		this.getProductos().add(producto);
	}
	
	
	
	
	
	
}
