package ar.edu.unq.po2.práctica_8_Observer.Publicaciones;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaConcreteTestCase {

	SistemaConcrete sistema;
	Articulo articulo, articulo2;
	InvestigadorConcrete investigador;
	
	@BeforeEach
	void setUp() throws Exception {
		sistema = new SistemaConcrete();
		articulo = mock(Articulo.class);
		articulo2 = mock(Articulo.class);
		investigador = mock(InvestigadorConcrete.class);
	}

	@Test
	void testUnSistemaCargaUnArticulo() {
		sistema.agregarArticulo(articulo);
		assertEquals(sistema.getArticulos().size(), 1);
	}

	@Test
	void testUnSistemaEliminaUnArticulo() {
		sistema.agregarArticulo(articulo);
		sistema.eliminarArticulo(articulo);
		assertEquals(sistema.getArticulos().size(), 0);
	}
	
	@Test
	void testUnSistemaSuscribeAUnInvestigadorConInteresEnSmalltalk() {
		sistema.agregarSuscriptor(investigador, "Smalltalk");
		assertEquals(sistema.getObservers().size(), 1);	
	}
	
	@Test
	void testUnSistemaDesuscribeAUnInvestigadorConInteresEnSmalltalk() {
		sistema.agregarSuscriptor(investigador, "Smalltalk");
		sistema.eliminarSuscriptor(investigador, "Smalltalk");
		assertEquals(sistema.getObservers().size(), 0);	
	}
	
	
	@Test
	void testUnSistemaNotificaASuObservadorQueHayUnArticuloDeSuInteres() {
		sistema.agregarSuscriptor(investigador, "Smalltalk");
		sistema.notificar("Smalltalk");
		verify(investigador, times(1)).update("Smalltalk");
	}
	
	@Test
	void testUnSistemaNotificaASuObservadorQueHayUnArticuloQueNoEsDeSuInteres() {
		sistema.agregarSuscriptor(investigador, "Java");
		sistema.notificar("Smalltalk");
		verify(investigador, never()).update("Smalltalk");
	}
	
	
}
