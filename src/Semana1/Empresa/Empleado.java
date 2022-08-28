package Semana1.Empresa;

import java.time.LocalDate;

public abstract class Empleado {

	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fechaNacimiento;
	private Double sueldoBasico;
	
	
	public Integer calcularEdad() {
		return LocalDate.now().getYear() - this.fechaNacimiento.getYear();
	}
	
	public Double getSueldoBasico() {
		return this.sueldoBasico;
	}
	
	public String getEstadoCivil() {
		return this.estadoCivil;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}
	
	public abstract double sueldoBruto();
	
	public abstract double retenciones();
	
	public abstract double sueldoNeto();
	
	public abstract double obraSocial();

	public abstract double aportes();
}
