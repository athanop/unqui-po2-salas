package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja implements Agencia {

	private double montoTotal;
	
	public double getMontoTotal() {
		return montoTotal;
	}
		
	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
	
	public void registrarProducto(Cliente cliente, MercadoCentral mercado) {
		double monto = 0;
		for(Producto producto:cliente.getProductos()) {
			monto = monto+producto.getPrecio();
			mercado.disminuirStock(producto);
		}
		this.setMontoTotal(monto);
		this.informarMonto(cliente, monto);
	}
	

	private void informarMonto(Cliente cliente, double monto) {
		cliente.setMontoAPagar(monto);
	}

	
	@Override
	public void registrarPago(Factura factura) {
		this.setMontoTotal(factura.montoAPagar());
	}



		

	

}
