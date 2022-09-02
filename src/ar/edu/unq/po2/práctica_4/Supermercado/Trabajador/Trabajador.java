package ar.edu.unq.po2.práctica_4.Supermercado.Trabajador;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	private List<Ingreso> ingresos;

	
	public Trabajador() {
		this.ingresos = new ArrayList<Ingreso>();
	}

	public void agregarIngreso(Ingreso ingreso) {
		this.ingresos.add(ingreso);
	}
	
	public double getTotalPercibido() {
		return this.ingresos.stream().mapToDouble(Ingreso::montoPercibido).sum();
	}
	
	public double getMontoImponible() {
		return this.ingresos.stream().mapToDouble(Ingreso::montoImponible).sum();
	}
	
	public double getImpuestoAPagar() {
		return (this.getMontoImponible()*2)/100;
	}
	
	
	
}
