package ar.edu.unq.po2.práctica_8_Observer.EncuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AdmDePartidoTestCase {

	AdmDePartido adm;
	Partido partido1, partido2;
	Servidor servidor;
	AplicacionMovil app;
	
	@BeforeEach
	void setUp() throws Exception {
	
		adm = new AdmDePartido();
		partido1 = mock(Partido.class);
		partido2 = mock(Partido.class);
		servidor = mock(Servidor.class);
		app = mock(AplicacionMovil.class);
		
	}

	@Test
	void testUnAdministradorDePartidosNoTienePartidos() {
		assertEquals(adm.getPartidos().size(), 0);
	}
	
	@Test
	void testUnAdministradorDePartidosTieneDosPartidos() {
		adm.agregarPartido(partido1);
		adm.agregarPartido(partido2);
		assertEquals(adm.getPartidos().size(), 2);
	}
	
	@Test
	void testUnAdministradorDePartidosTieneUnServidorDeSuscriptorDeFutbol() {
		adm.suscribir(servidor, "Futbol");
		assertTrue(adm.getObservers().containsKey(servidor));
		assertTrue(adm.getObservers().containsValue("Futbol"));
	}
	
	@Test
	void testUnAdministradorDePartidosNoTieneSuscriptores() {
		adm.suscribir(servidor, "Futbol");
		adm.desuscribir(servidor, "Futbol");
		assertEquals(adm.getObservers().size(),0);
	}
	
	@Test
	void testUnAdministradorDePartidosTieneDiferentesSuscriptoresYNotificaAAmbos() {
		adm.suscribir(servidor, "Futbol");
		adm.suscribir(app, "Basquet");
		adm.agregarPartido(partido1);
		adm.agregarPartido(partido2);
		
		
		adm.notificar("Futbol");
		adm.notificar("Basquet");
		
		
		verify(servidor, times(1)).update("Futbol");
		verify(servidor, never()).update("Basquet");
		verify(app, times(1)).update("Basquet");
		
	}
	
	

}
