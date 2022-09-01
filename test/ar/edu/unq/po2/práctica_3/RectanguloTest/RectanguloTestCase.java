package ar.edu.unq.po2.práctica_3.RectanguloTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.práctica_3.Point.Point;
import ar.edu.unq.po2.práctica_3.Rectangulo.Rectangulo;

class RectanguloTestCase {

	
	Point p1;

	Rectangulo rectangulo;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		p1 = new Point(6,4);
		
		rectangulo = new Rectangulo(p1);
		
	}

	@Test
	void testRectanguloDeAltura4YBase6() {
		
		assertEquals(rectangulo.base(), 6);
		assertEquals(rectangulo.altura(), 4);
		
	}
	
	@Test
	void testAreaDelRectangulo() {
		
		assertEquals(24, rectangulo.area());
		
	}
	
	@Test
	void testPerimetroDelRectangulo() {
		
		assertEquals(20, rectangulo.perimetro());
		
	}

	@Test
	void testElRectanguloEsHorizontal() {
		
		assertTrue(rectangulo.horizontal());
		assertFalse(rectangulo.vertical());
		
	}
	
}
