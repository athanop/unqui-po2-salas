package ar.edu.unq.po2.tp6.Banco;

public abstract class SolicitudDeCredito {

	Cliente cliente;
	double montoSolicitado;
	int plazoEnMeses;
	
	public Cliente getCliente() {
		return cliente;
	}


	
	public double getMontoSolicitado() {
		return montoSolicitado;
	}

	public int getPlazoEnMeses() {
		return plazoEnMeses;
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
