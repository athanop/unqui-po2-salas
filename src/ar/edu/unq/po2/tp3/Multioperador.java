package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	public int sumatoria(ArrayList<Integer> listaDeNumeros) {
		int resultado=0;
		for (int numero:listaDeNumeros) {
			resultado = resultado+numero;
		}
		return resultado;
	}

	public int restarArray(ArrayList<Integer> listaDeNumeros) {
		int resultado=0;
		if(listaDeNumeros.isEmpty()) { //si está vacía la lista, devuelvo un 0
			return resultado;
		}
		else {
			int p = listaDeNumeros.get(0); //agarro el primer elemento de la lista. posición 0
			for(int i=1; i <listaDeNumeros.size(); i++) { //comienzo a iterar desde la posición 1
				resultado = p-listaDeNumeros.get(i); //resto el primer elemento del array con el segundo
			}
		}
		return resultado;
	}

	public int multiplicarArray(ArrayList<Integer> listaDeNumeros) {
		int resultado=1;
		for(int i=0; i<listaDeNumeros.size(); i++) {
			resultado = resultado*listaDeNumeros.get(i);
		}
		return resultado;
	}
	
}
