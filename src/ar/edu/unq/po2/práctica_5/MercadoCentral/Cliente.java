package ar.edu.unq.po2.práctica_5.MercadoCentral;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.práctica_5.MercadoCentral.Producto.Producto;

public class Cliente {

	
	private List<IElemento> productos;
	
	public List<IElemento> getProductos() {
		return productos;
	}

	public Cliente() {
		this.productos = new ArrayList<IElemento>();
	}
	
	
	public void agregarProducto(IElemento p) {
		this.getProductos().add(p);
	}
	
	public void eliminarProducto(IElemento p) {
		this.getProductos().remove(p);
	}

	public Double totalAPagar(double total) {
		return total;
	}


	
}
