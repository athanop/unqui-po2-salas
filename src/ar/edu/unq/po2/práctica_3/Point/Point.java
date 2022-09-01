package ar.edu.unq.po2.práctica_3.Point;

public class Point {

	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}


	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void moverPunto(int i, int j) {
		this.x = i;
		this.y = j;
	}
	
	public Point sumarPoint(Point point) {
		this.x = this.x+point.getX();
		this.y = this.y+point.getY();
		return this;
	}
	
	
	
	
	
	
	
}
