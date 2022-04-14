package supermercado;

public class IngresoBasico extends Ingreso{
	
	public IngresoBasico(String mes, String concepto, double monto) {
		super(mes, concepto, monto);
	}

	@Override
	public double impuestoPorIngreso() {
		return super.getMonto()*0.02;
	}
	
}
