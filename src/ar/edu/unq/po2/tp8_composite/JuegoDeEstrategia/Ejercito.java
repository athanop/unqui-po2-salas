package ar.edu.unq.po2.tp8_composite.JuegoDeEstrategia;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp3.Point;

public class Ejercito implements Caracter{

	private List<Caracter> ejercito = new ArrayList<Caracter>();

	public void caminarHacia(Point punto) {
		
	}
	
	public void agregar(Caracter caracter) {
		this.ejercito.add(caracter);
	}
	
	public void quitar(Caracter caracter) {
		this.ejercito.remove(caracter);
	}
	
}
