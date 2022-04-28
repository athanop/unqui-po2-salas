package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class MercadoCentral {

	private List<Caja> cajas = new ArrayList<Caja>();
	private List<Producto> productos = new ArrayList<Producto>();
	private int stock;
	
	
	public List<Caja> getCajas() {
		return cajas;
	}

	private List<Producto> getProductos() {
		return productos;
	}
		
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void agregarCaja(Caja caja) {
		this.getCajas().add(caja);
	}
	
	public void agregarStock(int stock) {
		this.setStock(stock);
	}


	

	public void agregarProducto(Producto producto) {
		this.getProductos().add(producto);
	}

	public int cantidadDeCajas() {
		return this.getCajas().size();
	}

	public boolean hayStock(Producto producto) {
		return cantidadDeStock(producto) >= 1;
	}

	public int cantidadDeStock(iElementosAPagar elemento) {
		int stock = 0;
		for (Producto prod:this.getProductos()) {
			if (prod.getNombre().contentEquals(elemento.getNombre())) {
				stock++;
			}
		}
		return stock;
	}

	public void disminuirStock(iElementosAPagar elemento) {
		this.setStock(cantidadDeStock(elemento)-1);
		
	}
	
	
	

	

	

	
}
