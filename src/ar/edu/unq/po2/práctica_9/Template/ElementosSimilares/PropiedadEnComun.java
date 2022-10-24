package ar.edu.unq.po2.práctica_9.Template.ElementosSimilares;

import java.util.List;

public class PropiedadEnComun extends FiltroBusqueda{

	@Override
	public void agregarSiCumpleFiltro(WikipediaPage p, WikipediaPage page, List<WikipediaPage> filtradas) {
		if(compartenPropiedad(p, page)) {
			filtradas.add(p);
		}	
	}

	public Boolean compartenPropiedad(WikipediaPage p, WikipediaPage page) {
		Boolean esSimilar = false;
		for (String key : page.getInfobox().keySet()) {
			esSimilar |= p.getInfobox().containsKey(key);
		}
		return esSimilar;
		
	}






	

}
