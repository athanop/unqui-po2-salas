package ar.edu.unq.po2.tp11;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp11.Reproductor.Reproductor;
import ar.edu.unq.po2.tp11.Reproductor.Song;

class ReproductorTestCase {

	Reproductor mp3;
	Song song;
	
	@BeforeEach
	void setUp() throws Exception {
	mp3 = new Reproductor();
	song = mock(Song.class);
	
	}

	@Test
	void testElReproductorMP3ReproduceUnaCancion() throws Exception{
		mp3.agregarCancionAReproduccion(song);
		mp3.play();
		assertTrue(mp3.enReproduccion());
		verify(song).play();
	}

	
	@Test
	void testElReproductorMP3PausaUnaCancionDespuesDeReproducirla() throws Exception{
		mp3.agregarCancionAReproduccion(song);
		mp3.play();
		mp3.pause();
		assertFalse(mp3.enReproduccion());
		verify(song).pause();
	}
	
	@Test
	void testElReproductorMP3DetieneUnaCancionDespuesDeReproducirla() throws Exception{
		mp3.agregarCancionAReproduccion(song);
		mp3.play();
		mp3.stop();
		assertFalse(mp3.enReproduccion());
		verify(song).stop();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	void test_unReproductorEnSeleccionAlPresionarStopNoHaceNada() {
		mp3.agregarCancionAReproduccion(song);
		mp3.stop();
		verifyZeroInteractions(song);
	}
}
