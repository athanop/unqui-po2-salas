package ar.edu.unq.po2.práctica_3.RectanguloTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.práctica_3.Point.Point;
import ar.edu.unq.po2.práctica_3.Rectangulo.Cuadrado;
import ar.edu.unq.po2.práctica_3.Rectangulo.Rectangulo;

class CuadradoTestCase {

	Point p1;

	Cuadrado cuadrado;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		p1 = new Point(4,4);
		
		cuadrado = new Cuadrado(p1);
		
	}

	@Test
	void testCuadradoDeAltura4YBase4() {
		
		assertEquals(cuadrado.base(), 4);
		assertEquals(cuadrado.altura(), 4);
		
	}
	
	@Test
	void testAreaDelCuadrado() {
		
		assertEquals(16, cuadrado.area());
		
	}
	
	@Test
	void testPerimetroDelCuadrado() {
		
		assertEquals(16, cuadrado.perimetro());
		
	}

	@Test
	void testElCuadradoEsHorizontal() {
		
		assertTrue(cuadrado.horizontal());
		assertFalse(cuadrado.vertical());
		
	}
	
}
