package ar.edu.unq.po2.pr�ctica_7.Poker;

public enum JugadaPoker {

	Poker(4), Color(3), Trio(2), Nada(0);
	
	JugadaPoker(int i) {
		this.poker=i;
	}

	public int getPokerValor() {
		return poker;
	}

	private int poker;
}
