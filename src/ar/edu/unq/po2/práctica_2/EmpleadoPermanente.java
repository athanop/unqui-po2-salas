package ar.edu.unq.po2.práctica_2;

public class EmpleadoPermanente extends Empleado{

	
	private int cantidadHijos;
	private double antiguedad;
	
	
	@Override
	public double sueldoBruto() {
		return this.getSueldoBasico() + this.salarioFamiliar();

	}
	
	
	private Double salarioFamiliar() {
		if(this.getEstadoCivil().equals("casado")) {
			return 100+this.cantidadHijos*150+this.antiguedad*50;
		}
		else {
			return this.cantidadHijos*150+this.antiguedad*50;
		}
	}

	@Override
	public double retenciones() {
		return this.obraSocial()+20*this.cantidadHijos+this.aportes();
	}
	
	@Override
	public double obraSocial() {
		return this.sueldoBruto() * 10/100;
	}

	@Override
	public double aportes() {
		return this.sueldoBruto() * 15/100;
	}


	@Override
	public double sueldoNeto() {
		return this.sueldoBruto()-this.retenciones();
	}
	
	
	
	
}
