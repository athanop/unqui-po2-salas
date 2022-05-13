package ar.edu.unq.po2.tp8_composite;

import ar.edu.unq.po2.tp3.Point;

public class Ingeniero implements Caracter{

	private int lajas;
	
	public int getLajas() {
		return lajas;
	}

	public void setLajas(int lajas) {
		this.lajas = lajas;
	}

	
	@Override
	public void caminarHacia(Point punto) {
		if (!hayLaja()) {
			this.colocarLaja();
		}
		else {
			/*Al caminar de un punto a otro lo hace de la forma más corta posible.
		Mientras lo hace va construyendo un camino. Para construirlo va
		dejando en el piso lajas que contiene en una bolsa. Las lajas son finitas,
		por lo cual las coloca solamente si en el camino no han colocado alguna
		laja antes. Cuando se terminan sus lajas, camina normalmente.*/
		}
	}

	private void colocarLaja() {
		this.setLajas(getLajas()-1);
	}

	
	private boolean hayLaja() {
		return this.getLajas() > 0;
	}
	
	
}
