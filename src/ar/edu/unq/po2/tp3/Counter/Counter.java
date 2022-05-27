package ar.edu.unq.po2.tp3.Counter;

import java.util.ArrayList;

public class Counter {

	private ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	
	public ArrayList<Integer> getNumeros() {
		return numeros;
	}
	
	//agrego un numero al array
	public void addNumber(int i) {
		this.numeros.add(i);
	}

	//método con el tamaño del array
	public int longitudArray() {
		return this.numeros.size();
	}

	//primer elemento del array
	public int primerElementoDelArray(int i) {
		return getNumeros().get(i);
	}

	
	//obtiene la cantidad de pares
	public int obtenerCantidadDePares() {
		int cantParesVistos = 0;
		for(int i=0; i < longitudArray(); i++) {
			cantParesVistos = cantParesVistos + unoSiCeroSino(esNumeroPar(primerElementoDelArray(i)));
		}
		return cantParesVistos;
	}

	//obtiene la cantidad de impares
	public int obtenerCantidadDeImpares() {
		int cantImparesVistos = 0;
		for(int i=0; i < longitudArray(); i++) {
			cantImparesVistos = cantImparesVistos + unoSiCeroSino(esNumeroImpar(primerElementoDelArray(i)));
		}
		return cantImparesVistos;
	}
	
	//obtiene la cantidad de multiplos
	public int obtenerCantidadDeMultiplos(int multiplo) {
		int cantMultiplosVistos = 0;
		for(int num:this.getNumeros()) {
			cantMultiplosVistos = cantMultiplosVistos + unoSiCeroSino(esMultiplo(num, multiplo));
		}
		return cantMultiplosVistos;
	}
	
	//devuelve uno si cumple la condición, 0 sino
	public int unoSiCeroSino(Boolean condicion) {
			if(condicion) return 1; else return 0;
	}
	
	//métodos bool para las condiciones
	public boolean esNumeroPar(int nro) {
		return nro%2==0;
	}

	public boolean esNumeroImpar(int nro) {
		return !(nro%2==0);
	}
	
	public boolean esMultiplo(int n1, int n2) {
		return (n1%n2==0);
	}
	
	//EJERCICIO 2 DESARMANDO NÚMEROS.
	
	public int desarmarNumeros(ArrayList<Integer> enteros) {
		
		int numerosConMasPares = enteros.get(0);
		for(int entero:enteros) {
			numerosConMasPares = numerosConMasParesEntre(numerosConMasPares, entero);
		}		
		return numerosConMasPares;
	}

	public int numerosConMasParesEntre(int x, int y) {
		int numMayor;
		if 	(numerosParesEn(x) >= numerosParesEn(y)){
			numMayor = x;
		}
		else {
			numMayor = y;
		}
		return numMayor;
	}

	//obtengo los numeros pares del digito
	public int numerosParesEn(int x) {
		for (int i = 0; i < cantidadDeDigitosDe(x); i++) {
			this.addNumber(x % 10);
			x = x / 10;
		}
		return (this.obtenerCantidadDePares());
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
	
	//EJERCICIO 3 MULTIPLOS
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
		return (this.esMultiplo(i,x) && this.esMultiplo(i,y));
	}
	
	
	
	
	
}
