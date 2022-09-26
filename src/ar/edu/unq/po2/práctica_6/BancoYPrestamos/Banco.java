package ar.edu.unq.po2.práctica_6.BancoYPrestamos;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Cliente> clientes;
	private List<SolicitudDeCredito> solicitudes;
	private SistemaInformatico sistema;
	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public List<SolicitudDeCredito> getSolicitudes() {
		return solicitudes;
	}
	
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<SolicitudDeCredito>();
		this.sistema = new SistemaInformatico();
		this.sistema.banco = this;
	}
	
	
	public void agregarCliente(Cliente cliente) {
		this.sistema.agregarCliente(cliente);
	}
	
	public void agregarSolicitud(SolicitudDeCredito solicitud) {
		this.sistema.agregarSolicitud(solicitud);
	}
	
	public Double montoTotal() {
		return this.sistema.montoTotal();
	}
	
	
}
