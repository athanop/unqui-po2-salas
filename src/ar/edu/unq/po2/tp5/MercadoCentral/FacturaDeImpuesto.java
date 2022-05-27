package ar.edu.unq.po2.tp5.MercadoCentral;

public class FacturaDeImpuesto extends Factura{

	private double tasaDeServicio;
	
	public FacturaDeImpuesto(double tasaDeServicio) {
		this.tasaDeServicio = tasaDeServicio;
	}

	public double montoAPagar() {
		return this.getTasaDeServicio();
	}
	
	
	public double getTasaDeServicio() {
		return tasaDeServicio;
	}

	public double getPrecio() {
		return this.montoAPagar();
	}

	public String getNombre() {
		return "Factura de Impuesto";
	}
	
	
	
}
