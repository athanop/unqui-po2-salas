package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point.Point;

public class PointTestCase {

	Point point;
	
	@BeforeEach
	public void setUp() {
		point = new Point();
	}

	@Test
	public void moverPunto() {
		point.moverA(5, 15);
		assertEquals(5, point.getX());
		assertEquals(15, point.getY());
	}
	
	@Test
	public void sumarPuntos() {
		point.setX(5);
		point.setY(5);
		Point otroPunto = new Point(5,5);
		otroPunto.sumarPuntos(point);
		assertEquals(10, otroPunto.getX());
		assertEquals(10, otroPunto.getY());
	}
	
}
