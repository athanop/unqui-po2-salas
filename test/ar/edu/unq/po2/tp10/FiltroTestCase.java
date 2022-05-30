package ar.edu.unq.po2.tp10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp10.ElementosSimilares.LinkEnComun;
import ar.edu.unq.po2.tp10.ElementosSimilares.MismaLetraInicial;
import ar.edu.unq.po2.tp10.ElementosSimilares.Pagina;
import ar.edu.unq.po2.tp10.ElementosSimilares.PropiedadEnComun;
import ar.edu.unq.po2.tp10.ElementosSimilares.WikipediaPage;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class FiltroTestCase {

	//filtros
	LinkEnComun linkEnComun;
	MismaLetraInicial mismaLetra;
	PropiedadEnComun propiedadEnComun;
	
	//paginas
	Pagina pagina1;
	Pagina pagina2;
	Pagina pagina3;
	
	List<WikipediaPage> paginasAFiltrar;
	Map<String, WikipediaPage> info1;
	Map<String, WikipediaPage> info2;
	
	List<WikipediaPage> links1;
	List<WikipediaPage> links2;

	@BeforeEach
	void setUp() throws Exception {
		linkEnComun = new LinkEnComun();
		mismaLetra = new MismaLetraInicial();
		propiedadEnComun= new PropiedadEnComun();
		pagina1 = mock(Pagina.class);
		pagina2 = mock(Pagina.class);
		pagina3 = mock(Pagina.class);
		
		paginasAFiltrar = new ArrayList<WikipediaPage>();
		info1 = new HashMap<String, WikipediaPage>();
		info2 = new HashMap<String, WikipediaPage>();
		
		links1 = new ArrayList<WikipediaPage>();
		links2 = new ArrayList<WikipediaPage>();
		
	}

	@Test
	void testFiltroLinkEnComun() {
		links1.add(pagina1);
		links1.add(pagina2);
		links2.add(pagina3);
		when(pagina1.getLinks()).thenReturn(links1);
		when(pagina2.getLinks()).thenReturn(links1);
		when(pagina3.getLinks()).thenReturn(links2);
		paginasAFiltrar.add(pagina2);
		paginasAFiltrar.add(pagina3);
		
		List<WikipediaPage> paginasFiltradas = this.linkEnComun.getSimilarPages(pagina1, paginasAFiltrar);
		assertTrue(paginasFiltradas.size()==1);
		assertTrue(paginasFiltradas.contains(pagina2));
	}
	
	
	@Test
	void testFiltroMismaLetra() {
		when(pagina1.getTitle()).thenReturn("Inglés");
		when(pagina2.getTitle()).thenReturn("InPr");
		when(pagina3.getTitle()).thenReturn("Objetos 2");
		paginasAFiltrar.add(pagina2);
		paginasAFiltrar.add(pagina3);
		
		List<WikipediaPage> paginasFiltradas = this.mismaLetra.getSimilarPages(pagina1, paginasAFiltrar);
		assertTrue(paginasFiltradas.size()==1);
		assertTrue(paginasFiltradas.contains(pagina2));
		assertFalse(paginasFiltradas.contains(pagina3));
	
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
		
		List<WikipediaPage> paginasFiltradas = this.propiedadEnComun.getSimilarPages(pagina1, paginasAFiltrar);
		assertTrue(paginasFiltradas.size()==1);
		assertTrue(paginasFiltradas.contains(pagina2));
		
	}

	
	
}
