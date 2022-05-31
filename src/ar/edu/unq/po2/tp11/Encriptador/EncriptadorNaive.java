package ar.edu.unq.po2.tp11.Encriptador;

public class EncriptadorNaive {

	private IMetodoDeEncriptacion metodoDeEncriptacion;
		
	
	
	public void setMetodoDeEncriptacion(IMetodoDeEncriptacion metodoDeEncriptacion) {
		this.metodoDeEncriptacion = metodoDeEncriptacion;
	}

	

	public EncriptadorNaive(IMetodoDeEncriptacion metodoDeEncriptacion) {
		this.metodoDeEncriptacion = metodoDeEncriptacion;
	}

	public String encriptar(String texto) {
		return this.metodoDeEncriptacion.encriptar(texto);
		
	}
	
	
	public String desencriptar(String texto) {
		return this.metodoDeEncriptacion.desencriptar(texto);
		
	}


	
}
