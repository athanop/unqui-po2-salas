package ar.edu.unq.po2.pr�ctica_9.Template.ElementosSimilares;

import java.util.List;

public class MismaLetraInicial extends FiltroBusqueda{

	@Override
	public void agregarSiCumpleFiltro(WikipediaPage p, WikipediaPage page, List<WikipediaPage> filtradas) {
		if(mismaLetraInicial(p, page)) {
			filtradas.add(p);
		}
		
	}

	public Boolean mismaLetraInicial(WikipediaPage p, WikipediaPage page) {
		return p.getTitle().charAt(0) == page.getTitle().charAt(0);
	}

	



}
