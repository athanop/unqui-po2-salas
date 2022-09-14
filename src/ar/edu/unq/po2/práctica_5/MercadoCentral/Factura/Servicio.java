package ar.edu.unq.po2.práctica_5.MercadoCentral.Factura;

import java.time.LocalDate;

public class Servicio extends Factura{

	private Double costoPorUnidad;
	private Integer cantidadDeUnidades;
	private LocalDate fechaFacturado;
	
	
	public Servicio(Double costoPorUnidad, Integer cantidadDeUnidades, LocalDate fechaFacturado) {
		this.costoPorUnidad = costoPorUnidad;
		this.cantidadDeUnidades = cantidadDeUnidades;
		this.fechaFacturado = fechaFacturado;
	}


	public Double getPrecio() {
		return this.costoPorUnidad*this.cantidadDeUnidades;
	}
	
	
	@Override
	public void RegistrarPago() {
		this.agencia.registrarPago(this);
	}
	
	
	
}
