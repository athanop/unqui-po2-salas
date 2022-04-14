package supermercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTestCase {

	Trabajador trabajador;
	Ingreso ingreso;
	
	@BeforeEach
	void setUp() throws Exception {
		trabajador = new Trabajador();
		ingreso = new IngresoBasico("Junio", "Sos buenisimo", 40);
		trabajador.agregarIngreso(ingreso);
		
		
	}

	@Test
	void testTotalPercibido() {
		assertEquals(trabajador.getTotalPercibido(), 39.2);
	}

	@Test
	void testMontoImponible() {
		assertEquals(trabajador.getMontoImponible(), 40);
	}
	
	
	@Test
	void testImpuestoAPagar() {
		assertEquals(trabajador.getImpuestoAPagar(), 0.8);
	}
	
	
}
