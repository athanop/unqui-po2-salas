package ar.edu.unq.po2.práctica_3.Rectangulo;

import ar.edu.unq.po2.práctica_3.Point.Point;

public abstract class Figura {
	

	/*  		D
	 * ------------------
	 * |				|
	 A |				| B
	 * |				|
	 * ------------------
	 * 			C
	 */
	
	
	private Point DA;
	private Point CB;
	


	public Point getDA() {
		return DA;
	}

	public void setDA(Point aD) {
		DA = aD;
	}

	public Point getCB() {
		return CB;
	}

	public void setCB(Point cB) {
		CB = cB;
	}

	public abstract int area();
	
	public abstract int perimetro();

	public abstract Boolean vertical();
	
	public abstract Boolean horizontal();
	
	public int base() {
		return this.getCB().getX();
	}
	
	public int altura() {
		return this.getCB().getY();
	}
}
