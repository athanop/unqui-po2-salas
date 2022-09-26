package ar.edu.unq.po2.práctica_6.BancoYPrestamos;

public class SistemaInformatico {

	Banco banco;
	

	public void agregarCliente(Cliente cliente) {
		this.banco.getClientes().add(cliente);
	}
	
	public void agregarSolicitud(SolicitudDeCredito solicitud) {
		if(solicitud.esAceptable()) {
			this.banco.getSolicitudes().add(solicitud);
		}
	}
	
	public Double montoTotal() {
		Double total = banco.getSolicitudes().stream().mapToDouble(SolicitudDeCredito::getMonto).sum();
		return total;
	}
	
}
