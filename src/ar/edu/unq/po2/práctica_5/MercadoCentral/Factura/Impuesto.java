package ar.edu.unq.po2.pr�ctica_5.MercadoCentral.Factura;

public class Impuesto extends Factura{

	private Double tasaDelServicio;
	
	@Override
	public void RegistrarPago() {
		this.agencia.registrarPago(this);
	}
	
	public Double getPrecio() {
		return this.tasaDelServicio;
	}

	
	
}
