package ar.edu.unq.po2.tp10.ElementosSimilares;

import java.util.List;
import java.util.Map;



public class Pagina implements WikipediaPage{

	private String titulo;
	private List<WikipediaPage> links;
	private Map<String, WikipediaPage> infobox;
	
	@Override
	public String getTitle() {
		return this.titulo;
	}

	@Override
	public List<WikipediaPage> getLinks() {
		return this.links;
	}

	@Override
	public Map<String, WikipediaPage> getInfobox() {
		return this.infobox;
	}

	@Override
	public void getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		// TODO Auto-generated method stub
		
	}

}
