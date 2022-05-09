package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class SistemaInformatico implements IBanco{

	private IBanco banco;
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<SolicitudDeCredito> solicitudes = new ArrayList<SolicitudDeCredito>();
	

	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public List<SolicitudDeCredito> getSolicitudes() {
		return solicitudes;
	}

	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	@Override
	public void registrarSolicitud(SolicitudDeCredito solicitud) {
		solicitudes.add(solicitud);
		this.evaluarSolicitud(solicitud);
	}

	public void evaluarSolicitud(SolicitudDeCredito solicitud) {
		if(solicitud.esAceptable()) {
			this.otorgarCredito(solicitud.getCliente(), solicitud.getMontoSolicitado());
		}
		
	}

	private void otorgarCredito(Cliente cliente, double montoSolicitado) {
		//le otorga el credito al cliente
	}

	


	


		
	

}
