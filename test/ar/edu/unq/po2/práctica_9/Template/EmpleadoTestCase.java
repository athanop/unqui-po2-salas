package ar.edu.unq.po2.práctica_9.Template;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.práctica_9.Template.SueldosRecargados.Empleado;
import ar.edu.unq.po2.práctica_9.Template.SueldosRecargados.EmpleadoPasante;
import ar.edu.unq.po2.práctica_9.Template.SueldosRecargados.EmpleadoPlanta;
import ar.edu.unq.po2.práctica_9.Template.SueldosRecargados.EmpleadoTemporario;

class EmpleadoTestCase {

		EmpleadoPlanta planta;
		EmpleadoTemporario temporario;
		EmpleadoPasante pasante;
		
		@BeforeEach
		void setUp() throws Exception {
			temporario = new EmpleadoTemporario(2, 1000d, true, false);
			pasante = new EmpleadoPasante(5);
			planta = new EmpleadoPlanta(3000d, 2);
		}

		@Test
		void testSueldoBrutoEmpleadoDePlanta() {
			assertEquals(planta.sueldoBruto(), 3300);
		}

		@Test
		void testSueldoEmpleadoDePlanta() {
			assertEquals(planta.sueldo(), 2871);
		}

		@Test
		void testSueldoBrutoEmpleadoTemporario() {
			assertEquals(temporario.sueldoBruto(), 1110);
		}

		@Test
		void testSueldoEmpleadoTemporario() {
			assertEquals(temporario.sueldo(), 965.7);
		}
		
		@Test
		void testSueldoBrutoEmpleadoPasante() {
			assertEquals(pasante.sueldoBruto(), 200);
		}
		
		@Test
		void testSueldoEmpleadoPasante() {
			assertEquals(pasante.sueldo(), 174);
		}
		
}

