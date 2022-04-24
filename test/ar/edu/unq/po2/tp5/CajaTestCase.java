package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
		cliente1.agregarProducto(vino);
		cliente1.agregarProducto(cerveza);
		
		//cliente 2
		cliente2 = new Cliente();
		cliente2.agregarProducto(pan);
		cliente2.agregarProducto(vino);
		
		//cliente3
		cliente3 = new Cliente();
		cliente3.agregarProducto(vino);
		cliente3.agregarProducto(cerveza);
		cliente3.agregarProducto(leche);
		
		caja = new Caja();
		mercado = new MercadoCentral();
		caja.registrarProducto(cliente1, mercado);
		caja.registrarProducto(cliente2, mercado);
		caja.registrarProducto(cliente3, mercado);
	
		//facturas
		facturaImpuesto = new FacturaDeImpuesto(20);
		facturaServicio = new FacturaDeServicio(20, 10);
		
		//caja registrando factura
		caja2 = new Caja();
		caja.registrarPago(facturaImpuesto); //caja 1 registrando el pago de la factura de impuesto
		caja2.registrarPago(facturaServicio); //caja 2 registrando el pago de la factura de servicio
	}


	@Test
	void testMontoTotalCliente1() {
		assertEquals(205d, cliente1.getMontoAPagar());
	}
	
	
	@Test
	void testMontoTotalCliente2() {
		assertEquals(140d, cliente2.getMontoAPagar());
	}

	@Test
	void testMontoTotalCliente3ConProductoCooperativa() {
		assertEquals(295d, cliente3.getMontoAPagar());
	}

	@Test
	void testRegistrarFacturaDeImpuesto() {
		assertEquals(20, caja.getMontoTotal());
	}
	
	@Test
	void testRegistrarFacturaDeServicio() {
		assertEquals(200, caja2.getMontoTotal());
		
	}

}
