package ar.edu.unq.po2.práctica_8_Composite.JuegoDeEstrategia;

import ar.edu.unq.po2.práctica_3.Point.Point;

public class Caballero extends Caracter{

	
	@Override
	public void caminar(Point point) {
		hacerZigZag(point);		
	}

	private void hacerZigZag(Point point) {
		this.setPosicion(point);
	}

}
