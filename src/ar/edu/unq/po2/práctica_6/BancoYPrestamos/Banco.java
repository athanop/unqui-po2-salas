package ar.edu.unq.po2.práctica_6.BancoYPrestamos;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Cliente> clientes;
	private List<SolicitudDeCredito> solicitudes;
	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public List<SolicitudDeCredito> getSolicitudes() {
		return solicitudes;
	}
	
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<SolicitudDeCredito>();
	}
	
	
	public void agregarCliente(Cliente cliente) {
		this.getClientes().add(cliente);
	}
	
	public void agregarSolicitud(SolicitudDeCredito solicitud) {
		if(solicitud.esAceptable()) {
			this.getSolicitudes().add(solicitud);
		}
	}
	
	public Double montoTotal() {
		Double total = this.getSolicitudes().stream().mapToDouble(SolicitudDeCredito::getMonto).sum();
		return total;
	}
	
	
}
