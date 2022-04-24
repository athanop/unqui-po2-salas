package ar.edu.unq.po2.tp5;

public abstract class Factura{

	private double tasaDeServicio;
	private double costoPorUnidad;
	private double cantidadDeUnidades;
	
	
	public double getTasaDeServicio() {
		return tasaDeServicio;
	}


	public void setTasaDeServicio(double tasaDeServicio) {
		this.tasaDeServicio = tasaDeServicio;
	}


	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}


	public void setCostoPorUnidad(double costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}


	public double getCantidadDeUnidades() {
		return cantidadDeUnidades;
	}


	public void setCantidadDeUnidades(double cantidadDeUnidades) {
		this.cantidadDeUnidades = cantidadDeUnidades;
	}


	public abstract double montoAPagar();

	 
}
