package ar.edu.unq.po2.práctica_3.Rectangulo;

import ar.edu.unq.po2.práctica_3.Point.Point;

public class Rectangulo extends Figura{

	
	
	public Rectangulo(Point p1) {
	
		this.setDA(p1);
		this.setCB(p1);
		
	}
	
	
	@Override
	public int area() {
		
		return this.base()*this.altura();
	}

	@Override
	public int perimetro() {
		return (this.base()+this.altura())*2;
	}

	@Override
	public Boolean vertical() {
		return this.base() < this.altura();
	}

	
	@Override
	public Boolean horizontal() {
		return !this.vertical();
	}
	
	
	

}
