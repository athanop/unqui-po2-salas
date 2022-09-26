package ar.edu.unq.po2.práctica_6.BancoYPrestamos;

public class CreditoHipotecario extends SolicitudDeCredito{

	Propiedad propiedad;
	
	public CreditoHipotecario(Cliente cliente, Double monto, int plazo, Propiedad propiedad) {
		this.setCliente(cliente);
		this.setMonto(monto);
		this.setPlazoEnMeses(plazo);
		this.propiedad = propiedad;
	}
	
	@Override
	public Boolean esAceptable() {
		return montoMenorAl50PorCiento() && montoMenorAl70PorCientoDelValorFiscal()
				&& edadAceptableParaCredito();
	}

	private boolean edadAceptableParaCredito() {
		return this.getCliente().getEdad() < 65;
	}

	private boolean montoMenorAl70PorCientoDelValorFiscal() {
		return this.getMonto() < propiedad.getValorFiscal()*0.70;
	}

	private boolean montoMenorAl50PorCiento() {
		return this.getMonto() < this.getCliente().getNetoMensual()*0.50;
	}

	
}
