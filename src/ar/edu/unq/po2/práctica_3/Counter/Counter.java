package ar.edu.unq.po2.práctica_3.Counter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Counter {


	List<Integer> num = new ArrayList<Integer>();
	
	
	//---------------------------------------------------------EJERCICIO 1-------------------------------------------------------------------------
	public Integer pares() {
		
		List<Integer> pares = this.num.stream().filter(n -> n%2==0).collect(Collectors.toList());
		return pares.size();
	}


	public void addNumber(int i) {
		this.num.add(i);
	}


	public Integer impares() {
		List<Integer> impares = this.num.stream().filter(n -> n%2==1).collect(Collectors.toList());
		return impares.size();
	}
	
	public Integer esMultiplo(int i) {
		List<Integer> multiplos = this.num.stream().filter(n -> n%i==0).collect(Collectors.toList());
		return multiplos.size();
	}
	
	//---------------------------------------------------------EJERCICIO 2-------------------------------------------------------------------------
	
		
	public int desarmarNumeros(ArrayList<Integer> enteros) {
		
		int numerosConMasPares = enteros.get(0);
		for(int entero:enteros) {
			numerosConMasPares = numerosConMasParesEntre(numerosConMasPares, entero);
		}		
		return numerosConMasPares;
	}

	public int numerosConMasParesEntre(int x, int y) {
		int numMayor = (numerosParesEn(x) >= numerosParesEn(y)) ? x : y;		
		return numMayor;
	}

	//obtengo los numeros pares del digito
	public int numerosParesEn(int x) {
		for (int i = 0; i < cantidadDeDigitosDe(x); i++) {
			this.addNumber(x % 10);
			x = x / 10;
		}
		return (this.pares());
	}
	
	public int cantidadDeDigitosDe(int numero) {
		int cifras = 1;
		int n = numero;
		while(n >= 10) {
			n = n/10;
			cifras++;
		}
		return cifras;
	}
	
	//---------------------------------------------------------EJERCICIO 3-------------------------------------------------------------------------
	
	
	public int multiploEntre(int x, int y) {
		int resultado = -1;
		for(int i=0; i < 1000; i++) {
			if(sonMultiplos(x,y,i)) {
				resultado = i;
			}
		}
		return resultado;
	}

	public boolean sonMultiplos(int x, int y, int i) {
		return (i%x==0 && i%y==0);
	}
	
	
}
