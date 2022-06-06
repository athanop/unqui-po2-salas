package ar.edu.unq.po2.tp11.Videojuego;

public class EstadoUnJugador implements IEstadoMaquina{

	@Override
	public String botonDeInicio(MaquinaDeVideojuego maquina) {
		maquina.descontarFicha();
		return "Comienza el juego para un jugador";
	}

}
