package ar.edu.unq.po2.práctica_3.Rectangulo;

import ar.edu.unq.po2.práctica_3.Point.Point;

public class Cuadrado extends Figura{

	
	public Cuadrado(Point p1) {
		
		this.setDA(p1);
		this.setCB(p1);
	}
	
	
	@Override
	public int area() {
		return this.getDA().getY()*this.getDA().getY();
	}

	@Override
	public int perimetro() {
		return (this.getCB().getX()+this.getCB().getY())*2;
	}

	@Override
	public Boolean vertical() {
		return this.getCB().getX() < this.getCB().getY();
	}

	@Override
	public Boolean horizontal() {
		return !this.vertical();
	}

	
	
	
	

}
