package ar.edu.unq.po2.práctica_9.Template.ElementosSimilares;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkEnComunTestCase {
	
	
	LinkEnComun filtro;
	List<WikipediaPage> paginasAFiltrar;
	WikipediaPage pagina1;
	WikipediaPage pagina2;
	WikipediaPage pagina3;
	List<WikipediaPage> links1;
	List<WikipediaPage> links2;
	
	@BeforeEach
	void setUp() throws Exception {
		filtro = new LinkEnComun();
		pagina1 = mock(WikipediaPage.class);
		pagina2 = mock(WikipediaPage.class);
		pagina3 = mock(WikipediaPage.class);	
		paginasAFiltrar = new ArrayList<WikipediaPage>();

		links1 = new ArrayList<WikipediaPage>();
		links2 = new ArrayList<WikipediaPage>();
	}

	@Test
	void testFiltroLinkEnComun() {
		links1.add(pagina2);
		links2.add(pagina3);
		when(pagina1.getLinks()).thenReturn(links1);
		when(pagina2.getLinks()).thenReturn(links1);
		when(pagina3.getLinks()).thenReturn(links2);
		paginasAFiltrar.add(pagina2);
		paginasAFiltrar.add(pagina3);
		
		List<WikipediaPage> paginasFiltradas = filtro.getSimilarPages(pagina1, paginasAFiltrar);
		assertTrue(paginasFiltradas.size()==1);
		assertTrue(paginasFiltradas.contains(pagina2));
	}
	
}
