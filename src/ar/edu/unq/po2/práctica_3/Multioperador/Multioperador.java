package ar.edu.unq.po2.práctica_3.Multioperador;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {

	private List<Integer> numeros = new ArrayList<Integer>();
		
	public Multioperador(List<Integer> numeros) {
		super();
		this.numeros = numeros;
	}


	public int sumar() {
		int resultado = this.numeros.stream().mapToInt(Integer::intValue).sum();
		return resultado;
	}


	public Integer restar() {
		int resultado = this.numeros.stream().mapToInt(Integer::intValue).reduce(0, (acumulado,nuevo) -> nuevo-acumulado);
		return resultado;
	}
	
	public Integer multiplicar() {
		int resultado = this.numeros.stream().mapToInt(Integer::intValue).reduce(1, (acumulado,nuevo) -> nuevo*acumulado);
		return resultado;
	}
	
}
