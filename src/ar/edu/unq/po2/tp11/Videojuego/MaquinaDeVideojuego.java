package ar.edu.unq.po2.tp11.Videojuego;

public class MaquinaDeVideojuego {

	private IEstadoMaquina estado;
	private Integer fichas;

	
	public MaquinaDeVideojuego() {
		this.ingresarFichas(0);
		this.setEstado(new EstadoInicio());
	}


	public void setEstado(IEstadoMaquina estado) {
		this.estado = estado;
	}
	
	public Integer getFichasIngresadas() {
		return fichas;
	}
	
	public void ingresarFichas(Integer fichasIngresadas) {
		this.fichas = fichasIngresadas;
		if(this.getFichasIngresadas()==1) {
			this.setEstado(new EstadoUnJugador());
		}
		else if(this.getFichasIngresadas()>=2){
			this.setEstado(new EstadoDosJugadores());
		}
		
	}

	public void descontarFicha() {
		this.fichas = this.getFichasIngresadas()-1;
	}

	public String botonDeInicio() {
		return this.estado.botonDeInicio(this);
	}


	
}
