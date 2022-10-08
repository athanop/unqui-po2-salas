package ar.edu.unq.po2.práctica_8_Observer.Publicaciones;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InvestigadorTestCase {

	InvestigadorConcrete investigador;
	SistemaConcrete sistema;
	Articulo articulo;
	
	@BeforeEach
	void setUp() throws Exception {
	
		investigador = new InvestigadorConcrete();
		sistema = mock(SistemaConcrete.class);
		articulo = mock(Articulo.class);
		
	}

	@Test
	void testUnInvestigadorCargaUnArticuloEnUnSistema() {
		//setup
		investigador.agregarArticulo(sistema, articulo);
		//verify
		verify(sistema, times(1)).agregarArticulo(articulo);
	}

	@Test
	void testUnInvestigadorEliminaUnArticuloEnUnSistema() {
		//setup
		investigador.eliminarArticulo(sistema, articulo);
		//verify
		verify(sistema, times(1)).eliminarArticulo(articulo);
	}
	
	
	
	
	
}
