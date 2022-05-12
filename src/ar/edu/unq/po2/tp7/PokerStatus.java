package ar.edu.unq.po2.tp7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokerStatus {

	
	
	public String verificar(Carta primeraCarta, Carta segundaCarta, Carta terceraCarta, Carta cuartaCarta,	Carta quintaCarta) {
		List<Carta> cartas = this.repartirMano(primeraCarta, segundaCarta, terceraCarta, cuartaCarta, quintaCarta);
		if(this.verificarPoker(cartas)) {
			return "Poker";
		}
		else if(this.verificarColor(cartas)) {
			return "Color";
		}
		else if(this.verificarTrio(cartas)) {
			return "Trio";
		}
		else {
			return "Nada";
		}
		
	}



	public boolean verificarPoker(List<Carta> cartas) {
		return cartas.stream().anyMatch(a-> this.tienePoker(a,cartas));
	}
	
	
	public boolean tienePoker(Carta carta, List<Carta> cartas) {
		return cartas.stream().filter(x->x.esMismoPalo(carta)).count() >= 4;
	}



	public boolean verificarColor(List<Carta> cartas) {
		return cartas.stream().anyMatch(x-> this.tieneColor(x,cartas));
	}

	public boolean tieneColor(Carta carta, List<Carta> cartas) {
		return cartas.stream().filter(x -> x.esMismoColor(carta)).count() == 5;
	}



	public boolean verificarTrio(List<Carta> cartas) {
		return cartas.stream().anyMatch(x-> this.tieneTrio(x,cartas));
	}

	
	public boolean tieneTrio(Carta carta, List<Carta> cartas) {
		return cartas.stream()
				.filter(x -> x.esMismoPalo(carta)).count() == 3;
	}



	//genera la mano de cartas
	List<Carta> repartirMano(Carta primeraCarta, Carta segundaCarta, Carta terceraCarta, Carta cuartaCarta,
			Carta quintaCarta) {
	
		List<Carta> mano = Arrays.asList(primeraCarta, segundaCarta, terceraCarta,cuartaCarta, quintaCarta);
		return mano;
	
	}



	public String ganadorDelDesempate(Jugada jugada1, Jugada jugada2) {
		if(jugada1.getValorJugada() > jugada2.getValorJugada()) {
			return "Gana la jugada 1";
		}
		else {
			return "Gana la jugada 2";
		}
	}

	public String ganadorEntre(String x, String y) {
		if (x.equals("Poker")) {
			return "Gana la jugada 1";
		} else if (y.equals("Poker")){
			return "Gana la jugada 2";
		} else if (x.equals("Color")){
			return "Gana la jugada 1";
		} else if (y.equals("Color")){
			return "Gana la jugada 2";
		} else if (x.equals("Trio")){
			return "Gana la jugada 1";
		} else {
			return "Gana la jugada 2";
		}
	}
	
	public String jugadaGanadora(Jugada jugada1, Jugada jugada2) {
		String resultadoJugada1 = this.verificar(jugada1.getManoDeCartas().get(0), jugada1.getManoDeCartas().get(1), 
				jugada1.getManoDeCartas().get(2), jugada1.getManoDeCartas().get(3), jugada1.getManoDeCartas().get(4));
		
		String resultadoJugada2 = this.verificar(jugada2.getManoDeCartas().get(0), jugada2.getManoDeCartas().get(1), 
				jugada2.getManoDeCartas().get(2), jugada2.getManoDeCartas().get(3), jugada2.getManoDeCartas().get(4));
		
		if (resultadoJugada1.equals(resultadoJugada2)) {
			return this.ganadorDelDesempate(jugada1, jugada2);
		} else {
			return this.ganadorEntre(resultadoJugada1, resultadoJugada2);
		}
	}
	
	
	
	
}
