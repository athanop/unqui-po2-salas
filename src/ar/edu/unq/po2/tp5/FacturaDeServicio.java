package ar.edu.unq.po2.tp5;

public class FacturaDeServicio extends Factura{

	
	
	public FacturaDeServicio(double costoPorUnidad, double cantidadDeUnidades) {
		super.setCostoPorUnidad(costoPorUnidad);
		super.setCantidadDeUnidades(cantidadDeUnidades); 
	}

	
	public double montoAPagar() {
		return super.getCostoPorUnidad()*super.getCantidadDeUnidades();
	}
	
	
}
