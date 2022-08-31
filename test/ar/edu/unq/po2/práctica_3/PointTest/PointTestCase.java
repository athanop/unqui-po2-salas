package ar.edu.unq.po2.práctica_3.PointTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.práctica_3.Point.Point;

class PointTestCase {

	Point point;
	Point point2;
	
	
	@BeforeEach
	void setUp() throws Exception {
		point = new Point();
		point2 = new Point(2,2);
	}

	@Test
	void testMovimientoDelPunto() {
		point2.moverPunto(4,8);
		assertEquals(point2.getX(), 4);
		assertEquals(point2.getY(), 8);
	}

	
	@Test
	void testSumaDePuntos() {
		point.moverPunto(2, 2);
		point2.moverPunto(4,8);
		point.sumarPoint(point2);
		
		
		assertEquals(point.getX(), 6);
		assertEquals(point.getY(), 10);
	}
	
	
	
}
