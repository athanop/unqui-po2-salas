package ar.edu.unq.po2.práctica_9.Adapter.PalabrasOrdenadas;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListaDePalabrasOrdenadas {
	
	private List<String>palabras;
	
	public ListaDePalabrasOrdenadas(){
		this.palabras=new LinkedList<String>();
	}		
	
	public int compare(Object palabraA, Object palabraB) {
		String a=((String)palabraA);
		String b=(((String)palabraB));
		return a.compareToIgnoreCase(b);
	
	}
	
	
	
	public void agregarPalabra(String palabra){
		this.palabras.add(palabra);
		Collections.sort(this.palabras);
	}
	
	
	public Integer cantidadDePalabras(){
		return this.palabras.size();
	}
	
	
	public String getPalabraDePosicion(int posicion){
		return this.palabras.get(posicion);
	}
}