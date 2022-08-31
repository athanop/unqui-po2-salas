package ar.edu.unq.po2.práctica_2;

import java.time.LocalDate;

public class EmpleadoTemporario extends Empleado{

	
	private LocalDate fechaFinDesignacion;
	private int horasExtra;
	
	
	
	@Override
	public double sueldoBruto() {
		return this.getSueldoBasico() + this.horasExtra*40;
	}
	
	
	@Override
	public double retenciones() {
		if(this.calcularEdad() > 50) {
			return this.obraSocial() + 25 + this.aportes(); 
		}
		else {
			return this.obraSocial() + this.aportes(); 
		}
	}
	
	
	@Override
	public double sueldoNeto() {
		return this.sueldoBruto()-this.retenciones();
	}


	@Override
	public double obraSocial() {
		return this.sueldoBruto()*10/100;
	}


	@Override
	public double aportes() {
		return this.sueldoBruto()*10/100 + 5*this.horasExtra;
	}
	
	
	
	
}
