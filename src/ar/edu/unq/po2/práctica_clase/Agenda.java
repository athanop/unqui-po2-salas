package ar.edu.unq.po2.práctica_clase;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	List<String> nombres;
	
	public List<String> getNombres() {
		return nombres;
	}
	
	public void agregarElemento(String elemento) {
		this.nombres.add(elemento);
	}
	
	public Agenda() {
		this.nombres = new ArrayList<String>();
	}


	public Boolean tieneAlMenosUnNombreQueEmpiezaCon(String inicio) {
		Boolean tiene = false;
		for(String s : this.getNombres()) {
			if(s.startsWith(inicio)) {
				tiene = true;	
			}
		}
		return tiene;
	}
	
	public Boolean tieneAlMenosUnConStreams(String inicio) {
		return this.getNombres().stream().anyMatch(s -> s.startsWith(inicio));
		}
	
	
	
	public Boolean todosEmpiezanCon(String inicio) {
		Boolean todos = true;
		for(String s:this.getNombres()) {
			if(!s.startsWith(inicio)) {
				todos = false;
			}
		}
		return todos;
	}
	
	public Boolean todosEmpiezanConStream(String inicio) {
		return this.getNombres().stream().allMatch(s -> s.startsWith(inicio));
	}
	
	
	public List<String> filtrar(String inicio) {
		List<String> lista = new ArrayList<String>();
		for(String s : this.getNombres()) {
			if(s.startsWith(inicio)) {
				lista.add(s);
			}
		}
		return lista;
	}
	
	public List<String> filtrarConStream(String inicio) {
		return this.getNombres().stream().filter(s -> s.startsWith(inicio)).toList();
	}
	
	public void printAll() {
		for(String s:this.getNombres()) {
			System.out.println(s);
		}
	}	
	
}