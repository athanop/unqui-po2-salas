package ar.edu.unq.po2.pr�ctica_9.Template.SueldosRecargados;

public abstract class Empleado {

	
	public final Double sueldo() {
		return this.sueldoBruto() - this.conceptosYObraSocial();		
	}
	
	public abstract Double sueldoBruto();
	
	public Double conceptosYObraSocial() {
		return this.sueldoBruto()*0.13; 
	}
	
	
}
 