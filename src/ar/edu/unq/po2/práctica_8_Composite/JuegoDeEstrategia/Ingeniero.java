package ar.edu.unq.po2.práctica_8_Composite.JuegoDeEstrategia;

import ar.edu.unq.po2.práctica_3.Point.Point;

public class Ingeniero extends Caracter{

	private int lajas;
	
	@Override
	public void caminar(Point point) {
		if(!hayLaja()) {
			colocarLaja();
			this.setPosicion(point);
		}
		else {
			this.setPosicion(point);
		}
	}

	private Boolean hayLaja() {
		return null; //verifica si hay lajas en el piso..
	}

	private void colocarLaja() {
		lajas = this.lajas-1;
	}

	
	
	
}
