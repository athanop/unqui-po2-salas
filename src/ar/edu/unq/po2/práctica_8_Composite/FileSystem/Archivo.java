package ar.edu.unq.po2.práctica_8_Composite.FileSystem;

import java.time.LocalDate;

public class Archivo implements FyleSystem{
	
	private String nombre;
	private int tamanio;
	private LocalDate fechaModificacion;
	
	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}
	
	public Archivo(String nombre, int tamanio, LocalDate fechaModificacion) {
		super();
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.fechaModificacion = fechaModificacion;
	}

	@Override
	public int totalSize() {
		return this.tamanio;
	}

	@Override
	public void printStructure() {
		System.out.println(this.nombre);
	}

	@Override
	public FyleSystem lastModified() {
		return this;
	}

	@Override
	public FyleSystem oldestElement() {
		return this;
	}

	@Override
	public LocalDate getFecha() {
		return this.fechaModificacion;
	}

	@Override
	public FyleSystem ultimoModificadoEntre(FyleSystem archivo) {
		if(this.getFecha().isAfter(archivo.getFecha())) {
			return this;
		}
		else {
			return archivo;
		}
	}

	@Override
	public FyleSystem elementoMasAntiguoEntre(FyleSystem archivo) {
		if(this.getFecha().isBefore(archivo.getFecha())) {
			return this;
		}
		else {
			return archivo;
		}
	}

	

	



}
