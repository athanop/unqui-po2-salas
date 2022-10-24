package ar.edu.unq.po2.práctica_9.Template.ElementosSimilares;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropiedadEnComunTestCase {

	PropiedadEnComun filtro;
	List<WikipediaPage> paginasAFiltrar;
	WikipediaPage pagina1;
	WikipediaPage pagina2;
	WikipediaPage pagina3;
	List<WikipediaPage> links1;
	List<WikipediaPage> links2;
	Map<String, WikipediaPage> info1;
	Map<String, WikipediaPage> info2;
	
	@BeforeEach
	void setUp() throws Exception {
		filtro = new PropiedadEnComun();
		pagina1 = mock(WikipediaPage.class);
		pagina2 = mock(WikipediaPage.class);
		pagina3 = mock(WikipediaPage.class);	
		paginasAFiltrar = new ArrayList<WikipediaPage>();

		links1 = new ArrayList<WikipediaPage>();
		links2 = new ArrayList<WikipediaPage>();
		
		info1 = new HashMap<String, WikipediaPage>();
		info2 = new HashMap<String, WikipediaPage>();
	}

	@Test
	void testFiltroPropiedadEnComun() {
		info1.put("tecnologia", pagina1);
		info1.put("informatica", pagina1);
		info2.put("sociales", pagina2);

		when(pagina1.getInfobox()).thenReturn(info1);
		when(pagina2.getInfobox()).thenReturn(info1);
		when(pagina3.getInfobox()).thenReturn(info2);
		paginasAFiltrar.add(pagina2);
		paginasAFiltrar.add(pagina3);
		
		List<WikipediaPage> paginasFiltradas = filtro.getSimilarPages(pagina1, paginasAFiltrar);
		assertTrue(paginasFiltradas.size()==1);
		assertTrue(paginasFiltradas.contains(pagina2));
		
	}

}
