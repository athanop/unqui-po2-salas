package ar.edu.unq.po2.tp7.Poker;

import java.util.ArrayList;
import java.util.List;

public class Jugada {

	private List<Carta> manoDeCartas = new ArrayList<Carta>();

	public Jugada(List<Carta> manoDeCartas) {
		this.manoDeCartas = manoDeCartas;
	}
	
	public List<Carta> getManoDeCartas() {
		return manoDeCartas;
	}
	
	public int getValorJugada() {
		int valorTotal = 0;
		for (Carta carta : this.getManoDeCartas()) {
			valorTotal += carta.valorNumericoDeLaCarta();
		}
		return valorTotal;
	}

	
	
	
}
