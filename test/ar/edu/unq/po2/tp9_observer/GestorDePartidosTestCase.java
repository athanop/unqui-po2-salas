package ar.edu.unq.po2.tp9_observer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GestorDePartidosTestCase {
	
	private GestorDePartido gestor;
	private Partido partido;
	private Partido otroPartido;
	private Servidor servidor;
	private AplicacionMovil aplicacion;

	@BeforeEach
	void setUp() throws Exception {
		gestor = new GestorDePartido();
		partido = new Partido("Gana boca", List.of("River","Racing"), "Futbol");
		otroPartido = new Partido("Gana Brasil", List.of("Argentina","Chile"), "Tenis");
		servidor = new Servidor();
		aplicacion = new AplicacionMovil();
	}

	@Test
	void testServidorConInformacionDeFutbol() {
		servidor.suscribirseAGestorDePartido(gestor, Set.of("Futbol"));
		gestor.recibirPartido(partido);
		assertTrue(servidor.getPartidos().contains(partido));
	}
	
	@Test
	void testServidorSeSuscribeConInteresArgentina() {
		servidor.suscribirseAGestorDePartido(gestor, Set.of("Tenis"));
		gestor.recibirPartido(partido);
		assertFalse(servidor.getPartidos().contains(partido));
	}
	
	@Test
	void testServidorSeSuscribeConInteresEnDeporteFutbolYNoRecibeNotificacion() {
		servidor.suscribirseAGestorDePartido(gestor, Set.of("Futbol", "Tenis"));
		gestor.recibirPartido(otroPartido);
		assertTrue(servidor.getPartidos().contains(otroPartido));
	}
	
	@Test
	void testAplicacionNoSeSuscribeANingunGestorYNoTieneResultados() {
		assertEquals(0, aplicacion.getResultadosDeInteres().size());
	}
	
	@Test
	void testAplicacionSeSuscribeAGestorConInteresEnArgentina() {
		aplicacion.suscribirseAGestorDePartidos(gestor, Set.of("Argentina"));
		gestor.recibirPartido(otroPartido);
		assertEquals(1, aplicacion.getResultadosDeInteres().size());
	}

}
