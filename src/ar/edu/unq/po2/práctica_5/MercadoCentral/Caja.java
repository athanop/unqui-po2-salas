package ar.edu.unq.po2.práctica_5.MercadoCentral;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import ar.edu.unq.po2.práctica_5.MercadoCentral.Producto.Producto;

public class Caja {

	private Double montoAPagar;
	private Map<IElemento, Integer> stock;
	

	public Double getMontoAPagar() {
		return montoAPagar;
	}
	
	public Integer getStock() {
		Integer stockTotal = 0;
		for(Entry<IElemento, Integer> st : this.stock.entrySet()) {
			stockTotal += st.getValue();
		}
		return stockTotal;
	}
	
	public void setStock(Map<IElemento, Integer> stock) {
		this.stock = stock;
	}

	public Caja() {
		this.stock = new HashMap<IElemento, Integer>();
	}
	
	
	public void registrarPago(Cliente cliente) {
		double total = 0;
		for(IElemento p:cliente.getProductos()) {
			total += p.getPrecio();
			this.disminuirStock(p);
		}
		this.montoAPagar=total;
		informarTotal(cliente, total);
	}

	private void informarTotal(Cliente cliente, double total) {
		cliente.totalAPagar(total);
	}


	public void disminuirStock(IElemento producto) {
		int stockActual = this.stock.get(producto);
		this.stock.put(producto, stockActual-1);
	}

	
	
}