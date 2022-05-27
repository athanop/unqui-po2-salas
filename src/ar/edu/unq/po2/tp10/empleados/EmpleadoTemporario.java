package ar.edu.unq.po2.tp10.empleados;

public class EmpleadoTemporario extends Empleado{

	private int horasTrabajadas;
	private double sueldoBasico;
	private boolean esCasado;
	private boolean tieneHijos;
	
	public EmpleadoTemporario(int horasTrabajadas, double sueldoBasico, boolean esCasado, boolean tieneHijos) {
		super();
		this.horasTrabajadas = horasTrabajadas;
		this.sueldoBasico = sueldoBasico;
		this.esCasado = esCasado;
		this.tieneHijos = tieneHijos;
	}
	
	@Override
	public double sueldoBruto() {
		return this.sueldoBasico + this.sueldoPorHorasTrabajadas() +  this.bonoPorHijoOCasamiento();
	}

	
	public double sueldoPorHorasTrabajadas() {
		return this.horasTrabajadas*5.0;
	}
	
	public double bonoPorHijoOCasamiento() {
		if(this.esCasado==true || this.tieneHijos==true) {
			return 100.0;
		}
		else {return 0;
		}
	}
	
	
}
