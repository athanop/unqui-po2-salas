package ar.edu.unq.po2.tp4;

public class Ingreso {

	private String mes;
	private String concepto;
	private double monto;
	
	public Ingreso(String mes, String concepto, double monto) {
		this.setMes(mes);
		this.setConcepto(concepto);
		this.setMonto(monto);
	}

	
	public double impuestoPorIngreso() {
		return this.getMonto();
	} 
	
	public void setMes(String mes) {
		this.mes = mes;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	public double getMonto() {
		return monto;
	}
	
	
	
	
}
