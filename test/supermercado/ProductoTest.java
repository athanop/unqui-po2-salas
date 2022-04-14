package supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {
	
	private Producto arroz;
	private Producto vino;
	
	@BeforeEach
	public void setUp() {
		arroz = new ProductoTradicional("Arroz", 18.9d, false);   
		vino = new ProductoTradicional("Vino", 50d);                
		
	}
	
	
	@Test
	public void testConstructor() {
		
		
		assertEquals("Arroz", arroz.getNombre());
		assertEquals(new Double(18.9), arroz.getPrecio());
		assertFalse(arroz.getEsPrecioCuidado());
		
		assertEquals("Vino", vino.getNombre());
		assertEquals(new Double(50), vino.getPrecio());
		assertFalse(vino.getEsPrecioCuidado());
	}
	
	@Test
	public void testAumentarPrecio() {
		arroz.aumentarPrecio(1.5);
		assertEquals(new Double(20.4), arroz.getPrecio());
	}
}
