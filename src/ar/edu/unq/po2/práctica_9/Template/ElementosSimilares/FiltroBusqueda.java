package ar.edu.unq.po2.práctica_9.Template.ElementosSimilares;

import java.util.ArrayList;
import java.util.List;

public abstract class FiltroBusqueda {

	
	public final List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia){
		List<WikipediaPage> filtradas = new ArrayList<WikipediaPage>();
		for(WikipediaPage p:wikipedia) {
			this.agregarSiCumpleFiltro(p, page, filtradas);
		}
		return filtradas;
	}

	public abstract void agregarSiCumpleFiltro(WikipediaPage p, WikipediaPage page, List<WikipediaPage> filtradas);

	
	
}
