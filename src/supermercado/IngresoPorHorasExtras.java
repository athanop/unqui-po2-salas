package supermercado;

public class IngresoPorHorasExtras extends Ingreso{

	private double cantidadHorasExtras;

	public IngresoPorHorasExtras(String mes, String concepto, double monto, double cantidadHorasExtras) {
		super(mes, concepto, monto);
		this.setCantidadHorasExtras(cantidadHorasExtras);
	}

	public void setCantidadHorasExtras(double cantidadHorasExtras) {
		this.cantidadHorasExtras = cantidadHorasExtras;
	}
	
	@Override
	public double impuestoPorIngreso() {
		return 0;
	}
	
}
