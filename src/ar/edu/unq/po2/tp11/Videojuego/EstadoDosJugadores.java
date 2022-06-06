package ar.edu.unq.po2.tp11.Videojuego;

public class EstadoDosJugadores implements IEstadoMaquina{

	@Override
	public String botonDeInicio(MaquinaDeVideojuego maquina) {
		maquina.descontarFicha();
		maquina.descontarFicha();
		return "Comienza el juego para dos jugadores";
	}

}
