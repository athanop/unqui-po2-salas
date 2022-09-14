package ar.edu.unq.po2.práctica_5.MercadoCentral;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Caja {

	private Double montoAPagar;
	private Map<Producto, Integer> stock;
	
	public Integer getStock() {
		Integer stockTotal = 0;
		for(Entry<Producto, Integer> st : this.stock.entrySet()) {
			stockTotal += st.getValue();
		}
		return stockTotal;
	}
	
	public void setStock(Map<Producto, Integer> stock) {
		this.stock = stock;
	}

	public Caja() {
		this.stock = new HashMap<Producto, Integer>();
	}
	
	
	public void registrarProducto(Cliente cliente) {
		double total = 0;
		for(Producto p:cliente.getProductos()) {
			total += p.getPrecio();
			this.disminuirStock(p);
		}
		informarTotal(cliente, total);
	}

	private void informarTotal(Cliente cliente, double total) {
		cliente.totalAPagar(total);
	}


	public void disminuirStock(Producto producto) {
		int stockActual = this.stock.get(producto);
		this.stock.put(producto, stockActual-1);

	}


	
	
}
