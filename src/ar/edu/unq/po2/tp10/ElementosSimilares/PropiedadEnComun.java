package ar.edu.unq.po2.tp10.ElementosSimilares;

import java.util.List;

public class PropiedadEnComun extends Filtro{

	@Override
	protected void agregarSiCumpleElFiltro(List<WikipediaPage> paginasFiltradas, WikipediaPage page, WikipediaPage wiki) {
		if(compartenPropiedad(page, wiki)) {
			paginasFiltradas.add(wiki);
		}
		
	}

	private Boolean compartenPropiedad(WikipediaPage page, WikipediaPage wiki) {
		Boolean esSimilar = false;
		for (String key : page.getInfobox().keySet()) {
			esSimilar |= wiki.getInfobox().containsKey(key);
		}
		return esSimilar;
	}

}
