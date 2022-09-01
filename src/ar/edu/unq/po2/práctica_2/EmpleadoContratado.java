package ar.edu.unq.po2.pr�ctica_2;

public class EmpleadoContratado extends Empleado{

	private Integer numeroDeContrato;
	private String medioDePago;
	
	@Override
	public double sueldoBruto() {
		return this.getSueldoBasico();
	}

	@Override
	public double retenciones() {
		return 50;
	}

	@Override
	public double sueldoNeto() {
		return this.sueldoBruto()-this.retenciones();
	}




}
