package ar.edu.unq.po2.práctica_5.MercadoCentral;

public class ProductoCooperativa extends Producto{

	public ProductoCooperativa(String nombre, Double precio) {
		super(nombre, aplicarDescuento(precio));
	}

	private static Double aplicarDescuento(Double precio) {
		return precio-(precio*10/100);
	}

	
	
	
}
