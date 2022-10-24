package ar.edu.unq.po2.práctica_9.Template.SueldosRecargados;

public class EmpleadoPlanta extends Empleado{

	private Double sueldoBasico;
	private Integer cantidadDeHijos;
	
	
	public EmpleadoPlanta(Double sueldoBasico, Integer cantidadDeHijos) {
		this.sueldoBasico = sueldoBasico;
		this.cantidadDeHijos = cantidadDeHijos;
	}

	@Override
	public Double sueldoBruto() {
		return this.sueldoBasico+this.bonoPorCadaHijo();
	}

	public Double bonoPorCadaHijo() {
		return this.cantidadDeHijos*150.0;
	}
	
	
}
