package ar.edu.unq.po2.tp10.empleados;

public abstract class Empleado {

	
	public final double sueldo(){
		return this.sueldoBruto() - this.calcularAportesYObraSocial();
	}
	
	public abstract double sueldoBruto();
	
	public double calcularAportesYObraSocial() {
		return this.sueldoBruto()*0.13;
	}
	
	
}
