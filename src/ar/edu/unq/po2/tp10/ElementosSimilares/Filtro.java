package ar.edu.unq.po2.tp10.ElementosSimilares;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {

	//template
	public final List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia){
			List<WikipediaPage> paginas = new ArrayList<WikipediaPage>();
			for(WikipediaPage wiki:wikipedia) {
				this.agregarSiCumpleElFiltro(paginas, page, wiki);
			}
			return paginas;
	}

	protected abstract void agregarSiCumpleElFiltro(List<WikipediaPage> paginas, WikipediaPage page, WikipediaPage wiki);


}
