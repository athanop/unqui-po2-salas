package ar.edu.unq.po2.tp6;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito{

	Propiedad garantia;
	
	
	public SolicitudDeCreditoHipotecario(Cliente cliente, double montoSolicitado, int plazoEnMeses, Propiedad garantia) {
		super(cliente, montoSolicitado, plazoEnMeses);
		this.setGarantia(garantia);
	}


	public void setGarantia(Propiedad garantia) {
		this.garantia = garantia;
	}


	@Override
    public boolean esAceptable() {
        return montoCuotaMensual() < cincuentaPorCientoIngresoMensual() &&
                this.getMontoSolicitado() < setentaPorCientoValorFiscal() &&
                this.clienteSupera65AñosAlTerminarElCredito();
    }

    private Double setentaPorCientoValorFiscal() {
        return garantia.getValorFiscal() * 70 / 100;
    }

    private Double cincuentaPorCientoIngresoMensual() {
        return getCliente().getSueldoNeto() * 50 / 100;
    }

    private boolean clienteSupera65AñosAlTerminarElCredito() {
		return (getCliente().getEdad() < 65);
	}
	
	
}
