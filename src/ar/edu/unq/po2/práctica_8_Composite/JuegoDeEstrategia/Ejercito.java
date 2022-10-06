package ar.edu.unq.po2.práctica_8_Composite.JuegoDeEstrategia;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.práctica_3.Point.Point;

public class Ejercito extends Caracter{

	private List<Caracter> personajes;
	
	
	public Ejercito() {
		personajes = new ArrayList<Caracter>();
	}

	public void agregarCaracter(Caracter caracter) {
		this.personajes.add(caracter);
	}
	
	public void removerCaracter(Caracter caracter) {
		this.personajes.remove(caracter);
	}

	@Override
	public void caminar(Point point) {
		for(Caracter c:this.personajes) {
			c.caminar(point);
		}
	}

}
