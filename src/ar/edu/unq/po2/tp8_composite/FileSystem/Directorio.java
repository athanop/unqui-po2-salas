package ar.edu.unq.po2.tp8_composite.FileSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio implements FileSystem{

	private String nombre;
	private LocalDate fechaCreado;
	private List<FileSystem> contenido = new ArrayList<FileSystem>();
	
	

	public Directorio(String nombre, LocalDate fecha, List<FileSystem> contenido) {
		this.nombre = nombre;
		this.fechaCreado = fecha;
		this.contenido = contenido;
	}


	@Override
	public LocalDate getUltimaModificacion() {
		return fechaCreado;
	}

	
	public List<FileSystem> getArchivos() {
		return contenido;
	}
	
	public void agregarFile(FileSystem file) {
		this.getArchivos().add(file);
	}

	@Override
	public int totalSize() {
		int peso = 0;
		for(FileSystem file:this.getArchivos()) {
			peso = peso+file.totalSize();
		}
		return peso;
	}

	@Override
	public void printStructure() {
		for(int i=0; i < this.getArchivos().size(); i++) {
			System.out.println("    ");	    
			this.getArchivos().get(i).printStructure();
		}
	}

	@Override
	public FileSystem lastModified() {
		FileSystem ultima = this;
			for (FileSystem file: this.getArchivos()) {
			if (ultima.getUltimaModificacion().compareTo(file.lastModified().getUltimaModificacion())<0) {
				ultima = file;
				}
			}
			return ultima;
			}

	
	@Override
	public FileSystem oldestElement() {
		FileSystem oldest = this;
		for (FileSystem file : this.contenido) {
			if (oldest.getUltimaModificacion().compareTo(file.oldestElement().getUltimaModificacion())>0) {
				oldest = file;
			}
		}
		return oldest;
	}


	
	

	

}
