package ar.edu.unq.po2.tp6;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito{

	public SolicitudDeCreditoPersonal(Cliente cliente, double montoSolicitado, int plazoEnMeses) {
		super(cliente, montoSolicitado, plazoEnMeses);
		// TODO Auto-generated constructor stub
	}

	@Override
    public boolean esAceptable() {
        return getCliente().sueldoNetoAnual() >= 1500 && 
                montoCuotaMensual() < setentaPorCientoIngresoMensual();
    }

    
	private Double setentaPorCientoIngresoMensual() {
        return getCliente().getSueldoNeto() * 70 / 100;
    }

}
