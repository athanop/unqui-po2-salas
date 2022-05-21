package ar.edu.unq.po2.tp10;

public class EmpleadoDePlanta extends Empleado{

	private double sueldoBasico;
	private int cantidadDeHijos;
	
	
	
	public EmpleadoDePlanta(double sueldoBasico, int cantidadDeHijos) {
		this.sueldoBasico = sueldoBasico;
		this.cantidadDeHijos = cantidadDeHijos;
	}

	@Override
	public double sueldoBruto() {
		return this.sueldoBasico+this.bonoPorCadaHijo();
	}

	public double bonoPorCadaHijo() {
		return this.cantidadDeHijos*150.0;
	}
	
}
