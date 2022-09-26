package ar.edu.unq.po2.práctica_6.BancoYPrestamos;

public class CreditoPersonal extends SolicitudDeCredito{

	public CreditoPersonal(Cliente cliente, Double monto, int plazo) {
		this.setCliente(cliente);
		this.setMonto(monto);
		this.setPlazoEnMeses(plazo);
	}
	
	@Override
	public Boolean esAceptable() {
		return netoMensualMayorA15000() && this.montoMenorAl70PorCientoDeIngresos();
	}

	private boolean netoMensualMayorA15000() {
		return this.getCliente().getNetoMensual() >= 15000;
	}

	public Boolean montoMenorAl70PorCientoDeIngresos() {
		return this.getMonto() < (this.getCliente().getNetoMensual())*0.70;
	}
}
