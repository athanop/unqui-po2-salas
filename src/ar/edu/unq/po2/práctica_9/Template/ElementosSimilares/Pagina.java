package ar.edu.unq.po2.práctica_9.Template.ElementosSimilares;

import java.util.List;
import java.util.Map;

public class Pagina{

	private WikipediaPage wikipedia;
	
	public String getTitle() {
		return this.wikipedia.getTitle();
	}

	public List<WikipediaPage> getLinks() {
		return this.wikipedia.getLinks();
	}

	public Map<String, WikipediaPage> getInfobox() {
		return this.wikipedia.getInfobox();
	}


}