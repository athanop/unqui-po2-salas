package ar.edu.unq.po2.tp10.ElementosSimilares;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkEnComun extends Filtro{

	@Override
	protected void agregarSiCumpleElFiltro(List<WikipediaPage> paginasFiltradas, WikipediaPage page, WikipediaPage wiki) {
		if(tienenLinkEnComun(page, wiki)) {
			paginasFiltradas.add(wiki);
		}
	}

	private boolean tienenLinkEnComun(WikipediaPage page, WikipediaPage wiki) {
		
		return page.getLinks().stream().filter(wiki.getLinks()::contains).collect(Collectors.toList()).size() >= 1;

	}

	
}
