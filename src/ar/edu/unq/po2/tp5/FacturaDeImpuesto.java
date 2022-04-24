package ar.edu.unq.po2.tp5;

public class FacturaDeImpuesto extends Factura{

	
	
	public FacturaDeImpuesto(double tasaDeServicio) {
		super.setTasaDeServicio(tasaDeServicio);
	}

	public double montoAPagar() {
		return super.getTasaDeServicio();
	}
	
	
	
}
