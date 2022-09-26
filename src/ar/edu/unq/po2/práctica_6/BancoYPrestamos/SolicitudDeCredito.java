package ar.edu.unq.po2.práctica_6.BancoYPrestamos;

public abstract class SolicitudDeCredito {

	private Cliente cliente;
	private Double monto;
	private int plazoEnMeses;
	
	public abstract Boolean esAceptable();	

	public Cliente getCliente() {
		return cliente;
	}

	public Double getMonto() {
		return monto;
	}
	
	public int getPlazoEnMeses() {
		return plazoEnMeses;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public void setPlazoEnMeses(int plazoEnMeses) {
		this.plazoEnMeses = plazoEnMeses;
	}
	
	public Double getMontoCuotaMensual() {
		return this.getMonto() / this.getPlazoEnMeses();
	}

	
}
