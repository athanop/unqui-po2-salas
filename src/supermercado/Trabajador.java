package supermercado;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	List<Ingreso> ingresoAnual = new ArrayList<Ingreso>();
	
	public double getTotalPercibido() {
		return this.getMontoImponible() - this.getImpuestoAPagar();
	}
	
	public List<Ingreso> getIngresoAnual() {
		return ingresoAnual;
	}


	public double getMontoImponible() {
		double montoImponibleTotal = 0;
		for(int i=0; i < getIngresoAnual().size(); i++) {
			montoImponibleTotal = montoImponibleTotal + getIngresoAnual().get(i).getMonto();
		}
		return montoImponibleTotal;
	}
		
	public double getImpuestoAPagar() {
		double impuestoTotal = 0;
		for(int i=0; i < getIngresoAnual().size(); i++) {
			impuestoTotal = impuestoTotal + getIngresoAnual().get(i).impuestoPorIngreso();
		}
		return impuestoTotal;
	}

	public void agregarIngreso(Ingreso ingreso) {
		this.ingresoAnual.add(ingreso);
	}
	
}
