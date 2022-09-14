package ar.edu.unq.po2.práctica_5.MercadoCentral;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	
	private List<Producto> productos;
	
	public List<Producto> getProductos() {
		return productos;
	}

	public Cliente() {
		this.productos = new ArrayList<Producto>();
	}
	
	
	public void agregarProducto(Producto p) {
		this.getProductos().add(p);
	}
	
	public void eliminarProducto(Producto p) {
		this.getProductos().remove(p);
	}

	public Double totalAPagar(double total) {
		return total;
	}


	
}
