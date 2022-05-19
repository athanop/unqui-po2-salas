package ar.edu.unq.po2.tp9_observer;


import java.util.Arrays;
import java.util.List;

public class Articulo {

	private String titulo;
	private String tipoArticulo;
	private String lugarPublicacion;
	private String autores;
	private String filiaciones;
	private String palabrasClave;
	
	

	public Articulo(String titulo, String tipoArticulo, String lugarPublicacion, String autores, String filiaciones, String palabrasClave) {
		this.titulo = titulo;
		this.tipoArticulo = tipoArticulo;
		this.lugarPublicacion = lugarPublicacion;
		this.autores = autores;
		this.filiaciones = filiaciones;
		this.palabrasClave = palabrasClave;
	}

	public List<String> getCriterios() {
		List<String> criterios = Arrays.asList(this.titulo, this.tipoArticulo, this.lugarPublicacion, this.autores,
				this.filiaciones, this.palabrasClave);
		return criterios;

	}

	
}
