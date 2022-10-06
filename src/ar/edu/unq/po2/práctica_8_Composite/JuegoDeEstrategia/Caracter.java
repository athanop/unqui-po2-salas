package ar.edu.unq.po2.pr�ctica_8_Composite.JuegoDeEstrategia;

import ar.edu.unq.po2.pr�ctica_3.Point.Point;

public abstract class Caracter {

	private Point posicion;

	public Point getPosicion() {
		return posicion;
	}

	public void setPosicion(Point posicion) {
		this.posicion = posicion;
	}
	
	public abstract void caminar(Point point);
	
}
