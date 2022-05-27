package ar.edu.unq.po2.tp10.SueldosRecargados;

public class EmpleadoPasante extends Empleado{

	private int horasTrabajadas;
	
	public EmpleadoPasante(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	@Override
	public double sueldoBruto() {
		return this.sueldoPorHorasTrabajadas();
	}

	public double sueldoPorHorasTrabajadas() {
		return this.horasTrabajadas*40.0;
	}

}
