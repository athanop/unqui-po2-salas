package ar.edu.unq.po2.tp7;

import java.util.List;

public class Carta {

	private String valor;
	private String palo;
	private String color;
	
	public Carta(String valor, String palo, String color) {
		this.valor = valor;
		this.palo = palo;
		this.color = color;
	}

	public boolean esMismoPalo(Carta carta) {
		return this.getPalo() == carta.getPalo();
	}


	public String getPalo() {
		return palo;
	}

	public String getColor() {
		return color;
	}

	public boolean esMismoColor(Carta carta) {
		return this.getColor().equalsIgnoreCase(carta.getColor());
	}

	
	public boolean esMayorQue(Carta unaCarta) {
		return this.valorNumericoDeLaCarta() > unaCarta.valorNumericoDeLaCarta();
	}
	

	public int valorNumericoDeLaCarta() {
		if(valor.equals("J")) {return 11;}
		else if(valor.equals("Q")) {return 12;}
		else if(valor.equals("K")) {return 13;}
		else if(valor.equals("A")) {return 14;}
		else {return Integer.valueOf(valor);}
	}
}
