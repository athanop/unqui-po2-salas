package ar.edu.unq.po2.práctica_8_Observer.Publicaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArticuloTestCase {

	Articulo articulo;
	
	@BeforeEach
	void setUp() throws Exception {
		articulo = new Articulo("Patrones", "Programacion", "EE.UU", "Java", "Gamma", "Universidad");
	}

	@Test
	void testConstructorArticulo() {
		assertEquals(articulo.getTitulo(), "Patrones");
		assertEquals(articulo.getTipoDeArticulo(), "Programacion");
		assertEquals(articulo.getLugarDePublicacion(), "EE.UU");
		assertEquals(articulo.getKeywords(), "Java");
		assertEquals(articulo.getAutores(), "Gamma");
		assertEquals(articulo.getFiliaciones(),"Universidad");
	}

}
