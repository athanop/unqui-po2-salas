package ar.edu.unq.po2.práctica_9.Template.SueldosRecargados;

public class EmpleadoTemporario extends Empleado{

	private Integer horasTrabajadas;
	private Double sueldoBasico;
	private Boolean esCasado;
	private Boolean tieneHijos;
	
	
	public EmpleadoTemporario(Integer horasTrabajadas, Double sueldo, Boolean esCasado, Boolean tieneHijos) {
		this.horasTrabajadas = horasTrabajadas;
		this.sueldoBasico = sueldo;
		this.esCasado = esCasado;
		this.tieneHijos = tieneHijos;
	}
	
	
	
	@Override
	public Double sueldoBruto() {
		return this.sueldoBasico + this.sueldoPorHorasTrabajadas() +  this.bonoPorHijoOCasamiento();
	}

	
	public Double sueldoPorHorasTrabajadas() {
		return this.horasTrabajadas*5.0;
	}
	
	public double bonoPorHijoOCasamiento() {
		if(this.esCasado==true || this.tieneHijos==true) {
			return 100.0;
		}
		else {
			return 0;
		}
	}

}
