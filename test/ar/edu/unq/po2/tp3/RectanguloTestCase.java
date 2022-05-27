package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point.Point;
import ar.edu.unq.po2.tp3.Rectangulo.Cuadrado;
import ar.edu.unq.po2.tp3.Rectangulo.Rectangulo;

class RectanguloTestCase {

	Point point;
	Rectangulo rectangulo;
	Cuadrado cuadrado;
	
	@BeforeEach
	public void setUp() {
		point = new Point(0,0);
		rectangulo = new Rectangulo(point, 6, 4);
		cuadrado = new Cuadrado(point, 4);
	}
	
	
	@Test
	void calcularArea() {
		assertEquals(24, rectangulo.calcularArea());
	}
	
	@Test
	void calcularPerimetro() {
		assertEquals(20, rectangulo.calcularPerimetro());
	}
	
	@Test
	void esVertical() {
		assertFalse(rectangulo.esVertical());
	}

	@Test
	void esHorizontal() {
		assertTrue(rectangulo.esHorizontal());
	}
	
	
	@Test
	void alturaYBaseCuadrado() {
		assertEquals(4, cuadrado.getAltura());
		assertEquals(4, cuadrado.getBase());
	}
	
	@Test
	void areaCuadrado() {
		assertEquals(16, cuadrado.calcularArea());
	}
	
	@Test
	void perimetroCuadrado() {
		assertEquals(16, cuadrado.calcularPerimetro());
	}
	
}
