package ar.edu.unq.po2.tp4.Supermercado;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	List<Ingreso> ingresoAnual = new ArrayList<Ingreso>();

	public List<Ingreso> getIngresoAnual() {
		return ingresoAnual;
	}
	
	
	public double getTotalPercibido() {
		double totalPercibido = 0; //100
		for(int i=0; i < getIngresoAnual().size(); i++) {
			totalPercibido = totalPercibido + getIngresoAnual().get(i).getMonto();
		}
		return totalPercibido;
	}


	public double getMontoImponible() {
		double montoImponibleTotal = 0; //100
		for(int i=0; i < getIngresoAnual().size(); i++) {
			montoImponibleTotal = montoImponibleTotal + getIngresoAnual().get(i).impuestoPorIngreso();
		}
		return montoImponibleTotal;
	}
		
	public double getImpuestoAPagar() {
		return (this.getMontoImponible()*2)/100;
	}

	public void agregarIngreso(Ingreso ingreso) {
		this.ingresoAnual.add(ingreso);
	}
	
}
