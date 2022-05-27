package ar.edu.unq.po2.tp3.Rectangulo;

import ar.edu.unq.po2.tp3.Point.Point;

public class Rectangulo {

	private Point ladoA;
	private Point ladoBD;
	private Point ladoC;
	
	private int base;
	private int altura;
	
	/*  		D
	 * ------------------
	 * |				|
	 A |				| B
	 * |				|
	 * ------------------
	 * 			C*/
	
	
	public Rectangulo(Point punto, int x, int y) {

		setLadoA(new Point(punto.getX(), punto.getY()+y));
		setLadoBD(new Point(punto.getX()+x, punto.getY()+y));
		setLadoC(new Point(punto.getX()+x, punto.getY())); 
		
		setBase(x); 
		setAltura(y); 
	}


	

	public void setLadoA(Point ladoA) {
		this.ladoA = ladoA;
	}

	public void setLadoBD(Point ladoBD) {
		this.ladoBD = ladoBD;
	}

	public void setLadoC(Point ladoC) {
		this.ladoC = ladoC;
	}
	
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
	public int calcularArea() {
		return getBase()*getAltura();
	}
	
	public int calcularPerimetro() {
		return (getBase()*2) + (getAltura()*2);
	}
	
	public boolean esHorizontal() {
		return getBase() > getAltura();
	}
	
	public boolean esVertical() {
		return !(esHorizontal());
	}
	
}


