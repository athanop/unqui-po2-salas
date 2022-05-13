package ar.edu.unq.po2.tp8_composite;

import java.time.LocalDate;

public class Archivo implements FileSystem{
	
	private String nombre;
	private int peso;
	private LocalDate ultimaModificacion;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate getUltimaModificacion() {
		return ultimaModificacion;
	}
	
	
	public Archivo(String nombre, int peso, LocalDate ultimaModificacion) {
		this.nombre = nombre;
		this.peso = peso;
		this.ultimaModificacion = ultimaModificacion;
	}

	
	@Override
	public int totalSize() {
		return this.peso;
	}

	@Override
	public void printStructure() {
		System.out.println(this.getNombre());
	}

	@Override
	public FileSystem lastModified() {
		return this;
	}

	@Override
	public FileSystem oldestElement() {
		return this;
	}

	

	
}
