package ar.edu.unq.po2.tp5;

public abstract class Factura implements iElementosAPagar{

	private double montoTotal;

	public abstract double montoAPagar();
	 
	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
	
}
