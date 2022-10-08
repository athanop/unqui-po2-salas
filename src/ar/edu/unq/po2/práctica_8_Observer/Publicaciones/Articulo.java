package ar.edu.unq.po2.práctica_8_Observer.Publicaciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Articulo {

	private String titulo;
	private String tipoDeArticulo;
	private String lugarDePublicacion;
	private String keywords;
	private String autores;
	private String filiaciones;
	
	public String getTitulo() {
		return titulo;
	}

	public String getTipoDeArticulo() {
		return tipoDeArticulo;
	}

	public String getLugarDePublicacion() {
		return lugarDePublicacion;
	}

	public String getKeywords() {
		return keywords;
	}
	
	public String getAutores() {
		return autores;
	}

	public String getFiliaciones() {
		return filiaciones;
	}

	
	public Articulo(String titulo, String tipoDeArticulo, String lugarDePublicacion, String keywords, String autores, String filiaciones) {
		this.titulo = titulo;
		this.tipoDeArticulo = tipoDeArticulo;
		this.lugarDePublicacion = lugarDePublicacion;
		this.keywords = keywords;
		this.autores = autores;
		this.filiaciones = filiaciones; 
	}
	
	

	public List<String> criterioDeInteres(){
		List<String> criterio = Arrays.asList(this.getTitulo(), this.getTipoDeArticulo(), 
								this.getLugarDePublicacion(), this.getKeywords(), this.getFiliaciones(), this.getAutores());
		return criterio;
	}
	
	
	
	
	
	
}
