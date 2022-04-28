package ar.edu.unq.po2.tp5;

public class FacturaDeServicio extends Factura{

	private double costoPorUnidad;
	private double cantidadDeUnidades;
	
	public FacturaDeServicio(double costoPorUnidad, double cantidadDeUnidades) {
		this.costoPorUnidad = costoPorUnidad;
		this.cantidadDeUnidades = cantidadDeUnidades;
	}

	
	public double montoAPagar() {
		return this.getCostoPorUnidad()*this.getCantidadDeUnidades();
	}
	

	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}


	public double getCantidadDeUnidades() {
		return cantidadDeUnidades;
	}

	public double getPrecio() {
		return this.montoAPagar();
	}

	public String getNombre() {
		return "Factura de Servicio";
	}
	

	
}
