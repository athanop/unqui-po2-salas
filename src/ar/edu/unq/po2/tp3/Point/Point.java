package ar.edu.unq.po2.tp3.Point;

public class Point {

	int x;
	int y;
	
	public Point() {
		setX(0);
		setY(0);
	}

	public Point(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void moverA(int x, int y) {
		setX(x);
		setY(y);
	}
	
	
	public Point sumarPuntos(Point unPunto) {
		setX(this.getX() + unPunto.getX());
		setY(this.getY() + unPunto.getY());
		return unPunto;
	}
	
}
