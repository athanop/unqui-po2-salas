package ar.edu.unq.po2.práctica_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Empresa {

	
	private String nombreEmpresa;
	private String CUIT;
	private List<Empleado> empleados;
	
	
	
	public Empresa(String nombreEmpresa, String cUIT) {
		this.nombreEmpresa = nombreEmpresa;
		this.CUIT = cUIT;
		this.empleados = new ArrayList<Empleado>();
	}
	
	
	public double totalBrutos() {
		double total = 0;
		for(Empleado em : this.empleados) {
			total += em.sueldoBruto();
		}
		return total;
	}
	
	public double totalNetos() {
		double total = 0;
		for(Empleado em : this.empleados) {
			total += em.sueldoNeto();
		}
		return total;
	}
	
	public double totalRetenciones() {
		double total = 0;
		for(Empleado em : this.empleados) {
			total += em.retenciones();
		}
		return total;
	}
	
	public HashMap<Empleado, ReciboDeHaberes> liquidaciones() {
		HashMap<Empleado, ReciboDeHaberes> liquidaciones = new HashMap<Empleado, ReciboDeHaberes>();
		for(Empleado em:this.empleados) {
			liquidaciones.put(em, this.generarRecibo(em));
		}
		return liquidaciones;
	}
	
	public ReciboDeHaberes generarRecibo(Empleado empleado) {
		return (new ReciboDeHaberes(empleado.getNombre(), empleado.getDireccion(), LocalDate.now(), empleado.sueldoBruto(), empleado.sueldoNeto(), "concepto"));
	}
	
}
