package ar.edu.unq.po2.tp6;

public abstract class SolicitudDeCredito {

	Cliente cliente;
	double montoSolicitado;
	int plazoEnMeses;
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	public void setMontoSolicitado(double montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}

	
	public double getMontoSolicitado() {
		return montoSolicitado;
	}

	public int getPlazoEnMeses() {
		return plazoEnMeses;
	}

	public void setPlazoEnMeses(int plazoEnMeses) {
		this.plazoEnMeses = plazoEnMeses;
	}

	public SolicitudDeCredito(Cliente cliente, double montoSolicitado, int plazoEnMeses) {
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.plazoEnMeses = plazoEnMeses;
	}

	protected abstract boolean esAceptable();

	public Double montoCuotaMensual() {
        return this.getMontoSolicitado() / this.getPlazoEnMeses();
    }

}
