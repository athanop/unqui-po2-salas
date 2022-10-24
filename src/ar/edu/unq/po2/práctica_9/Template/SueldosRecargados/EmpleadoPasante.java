package ar.edu.unq.po2.práctica_9.Template.SueldosRecargados;

public class EmpleadoPasante extends Empleado{

	private Integer horasTrabajadas;

	public EmpleadoPasante(Integer horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	@Override
	public Double sueldoBruto() {
		return this.sueldoPorHorasTrabajadas();
	}

	public double sueldoPorHorasTrabajadas() {
		return this.horasTrabajadas*40.0;
	}

	
}
