package Semana1.Empresa;

import java.time.LocalDate;

public class ReciboDeHaberes {

	private String nombreEmpleado;
	private String direccion;
	private LocalDate fechaEmision;
	private double sueldoBruto;
	private double sueldoNeto;
	private String conceptos;
	
	
	public ReciboDeHaberes(String nombreEmpleado, String direccion, LocalDate fechaEmision, double sueldoBruto,	double sueldoNeto, String conceptos) {
		this.nombreEmpleado = nombreEmpleado;
		this.direccion = direccion;
		this.fechaEmision = fechaEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		this.conceptos = conceptos;
	}
	
	
	
}
