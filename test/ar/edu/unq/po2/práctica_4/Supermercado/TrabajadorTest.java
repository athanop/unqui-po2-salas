package ar.edu.unq.po2.práctica_4.Supermercado;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.práctica_4.Supermercado.Trabajador.Ingreso;
import ar.edu.unq.po2.práctica_4.Supermercado.Trabajador.IngresoPorHorasExtras;
import ar.edu.unq.po2.práctica_4.Supermercado.Trabajador.Trabajador;

class TrabajadorTest {

	
	Trabajador trabajador;
	Ingreso ingreso;
	IngresoPorHorasExtras ingresoExtra;
	LocalDate fecha;
	
	@BeforeEach
	void setUp() throws Exception {
	
		fecha = LocalDate.of(2020, 4, 4);
		ingreso = new Ingreso(fecha, "Concepto 1", 20d);
		ingresoExtra = new IngresoPorHorasExtras(fecha, "Concepto2", 35d, 5);
		trabajador = new Trabajador();
		
	}

	@Test
	void testUnTrabajadorConoceSuMontoImponible() {
		trabajador.agregarIngreso(ingreso);
		
		assertEquals(trabajador.getMontoImponible(), 20d);
		
	}
	
	@Test
	void testUnTrabajadorConoceSuTotalPercibido() {
		trabajador.agregarIngreso(ingreso);
		trabajador.agregarIngreso(ingresoExtra);
		
		assertEquals(trabajador.getTotalPercibido(), 55d);
		
	}
	

	@Test
	void testUnTrabajadorConoceSuImpuestoAPagar() {
		trabajador.agregarIngreso(ingreso);
		trabajador.agregarIngreso(ingresoExtra);
		
		assertEquals(trabajador.getImpuestoAPagar(), 0.4);
		
	}

}
