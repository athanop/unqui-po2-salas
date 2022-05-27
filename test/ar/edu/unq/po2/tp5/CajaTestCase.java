package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.MercadoCentral.Caja;
import ar.edu.unq.po2.tp5.MercadoCentral.Cliente;
import ar.edu.unq.po2.tp5.MercadoCentral.FacturaDeImpuesto;
import ar.edu.unq.po2.tp5.MercadoCentral.FacturaDeServicio;
import ar.edu.unq.po2.tp5.MercadoCentral.MercadoCentral;
import ar.edu.unq.po2.tp5.MercadoCentral.Producto;
import ar.edu.unq.po2.tp5.MercadoCentral.ProductoCooperativa;

class CajaTestCase {
	
	private Caja caja;
	private Caja caja2;
	private Cliente cliente1;
	private Cliente cliente2;
	private Cliente cliente3;
	private Producto vino;
	private Producto pan;
	private Producto cerveza;
	private ProductoCooperativa leche;
	private MercadoCentral mercado;
	private FacturaDeImpuesto facturaImpuesto;
	private FacturaDeServicio facturaServicio;
	
	@BeforeEach
	void setUp() throws Exception {
		
		//productos de los clientes
		vino = new Producto("vino", 85d);
		pan = new Producto("pan", 55d);
		cerveza = new Producto("cerveza", 120d);
		leche = new ProductoCooperativa("leche", 100d);
		
		//cliente1
		cliente1 = new Cliente();
		cliente1.agregar(vino);
		cliente1.agregar(cerveza);
	
		
		//cliente 2
		cliente2 = new Cliente();
		cliente2.agregar(pan);
		cliente2.agregar(vino);
		
		//cliente3
		cliente3 = new Cliente();
		cliente3.agregar(vino);
		cliente3.agregar(cerveza);
		cliente3.agregar(leche);
		
		caja = new Caja();
		mercado = new MercadoCentral();
		
		//facturas
		facturaImpuesto = new FacturaDeImpuesto(20);
		facturaServicio = new FacturaDeServicio(20, 10);
		
		
	}


	@Test
	void testMontoTotalCliente1() {
		caja.registrarPago(cliente1, mercado);
		assertEquals(205d, caja.getMontoTotal());
	}
	
	
	@Test
	void testMontoTotalCliente2() {
		caja.registrarPago(cliente2, mercado);
		assertEquals(140d, cliente2.getMontoAPagar());
	}

	@Test
	void testMontoTotalCliente3ConProductoCooperativa() {
		caja.registrarPago(cliente3, mercado);
		assertEquals(295d, cliente3.getMontoAPagar());
	}

	
	


}
