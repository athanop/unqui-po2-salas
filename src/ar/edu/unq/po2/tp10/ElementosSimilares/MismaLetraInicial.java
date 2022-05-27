package ar.edu.unq.po2.tp10.ElementosSimilares;

import java.util.List;

public class MismaLetraInicial extends Filtro{

	@Override
	protected void agregarSiCumpleElFiltro(List<WikipediaPage> paginasFiltradas, WikipediaPage page, WikipediaPage wiki) {
		if(mismaLetraInicial(page, wiki)) {
			paginasFiltradas.add(wiki);
		};
	}

	
	private Boolean mismaLetraInicial(WikipediaPage page, WikipediaPage wikipediaPage) {
		return page.getTitle().charAt(0) == (wikipediaPage.getTitle().charAt(0));
	}


}
