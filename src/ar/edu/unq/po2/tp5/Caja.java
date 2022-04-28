package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {

	private double montoTotal;
	
	public double getMontoTotal() {
		return montoTotal;
	}
		
	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
	
	public void registrarPago(Cliente cliente, MercadoCentral mercado) {
		double monto = 0;
		for(iElementosAPagar elemento:cliente.getProductos()) {
			monto = monto+elemento.getPrecio();
			mercado.disminuirStock(elemento);
		}
		this.setMontoTotal(monto);
		this.informarMonto(cliente, monto);
	}
	

	private void informarMonto(Cliente cliente, double monto) {
		cliente.setMontoAPagar(monto);
	}

	
	

}
