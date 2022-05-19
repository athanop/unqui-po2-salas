package ar.edu.unq.po2.tp9_observer;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaDeReferenciaTestCase {

	SistemaDeReferencia sistema;
	Articulo articulo;
	Investigador investigador;
	Investigador dobleInvestigador;
	
	@BeforeEach
	void setUp() throws Exception {
		sistema = new SistemaDeReferencia();
		articulo = new Articulo("Un mago de terramar" , "Novela", "EE.UU", "Ursula", "Literatura", "Magia");
		investigador = new Investigador(sistema);
		dobleInvestigador = new Investigador(sistema);
		investigador.suscribirseAlSistema(Set.of("Ursula","Mistico"));
		dobleInvestigador.suscribirseAlSistema(Set.of("Ursula"));
	}

	@Test
	void testNotificacionDelSistemaAlObserverTrasCargarArticulo() {
		sistema.cargarArticulo(articulo);
		assertEquals(investigador.getNotificaciones().size(), 1);
	}
	
	@Test
	void testNotificacionDelSistemaAlObserverQueNoLeImporta() {
		Articulo dobleArticulo = mock(Articulo.class);
		when(dobleArticulo.getCriterios()).thenReturn(List.of("Dragones"));
		sistema.cargarArticulo(dobleArticulo);
		assertEquals(investigador.getNotificaciones().size(), 0);
	}
	
	@Test
	void testNotificacionDelSistemaAlObserverLeImportaElTema() {
		Articulo dobleArticulo = mock(Articulo.class);
		when(dobleArticulo.getCriterios()).thenReturn(List.of("Ursula","Mistico"));
		dobleInvestigador.cargarArticulo(dobleArticulo);
		assertEquals(dobleInvestigador.getNotificaciones().size(), 1);
	}
	
	
}
