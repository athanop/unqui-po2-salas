package ar.edu.unq.po2.práctica_4.Supermercado.Trabajador;

import java.time.LocalDate;

public class Ingreso{

	private LocalDate mesDePercepcion;
	private String concepto;
	private Double montoPercibido;
	
	public LocalDate getMesDePercepcion() {
		return mesDePercepcion;
	}

	public String getConcepto() {
		return concepto;
	}
	
	public Double montoPercibido() {
		return montoPercibido;
	}
	
	public Double montoImponible() {
		return montoPercibido;
	}

	
	public Ingreso(LocalDate mesDePercepcion, String concepto, Double montoPercibido) {
		super();
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}

	


	
}
