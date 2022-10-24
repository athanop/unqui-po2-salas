package ar.edu.unq.po2.práctica_9.Template.ElementosSimilares;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MismaLetraInicialTestCase {

	MismaLetraInicial filtro;
	List<WikipediaPage> paginasAFiltrar;
	WikipediaPage pagina1;
	WikipediaPage pagina2;
	WikipediaPage pagina3;
	
	@BeforeEach
	void setUp() throws Exception {
	
		filtro = new MismaLetraInicial();
		paginasAFiltrar = new ArrayList<WikipediaPage>();
		pagina1 = mock(WikipediaPage.class);
		pagina2 = mock(WikipediaPage.class);
		pagina3 = mock(WikipediaPage.class);
		
	}

	@Test
	void testFiltroMismaLetra() {
		when(pagina1.getTitle()).thenReturn("Inglés");
		when(pagina2.getTitle()).thenReturn("InPr");
		when(pagina3.getTitle()).thenReturn("Objetos 2");
		paginasAFiltrar.add(pagina2);
		paginasAFiltrar.add(pagina3);
		
		List<WikipediaPage> paginasFiltradas = filtro.getSimilarPages(pagina1, paginasAFiltrar);
		assertTrue(paginasFiltradas.size()==1);
		assertTrue(paginasFiltradas.contains(pagina2));
		assertFalse(paginasFiltradas.contains(pagina3));
	
	}

}
