package supermercado;

public class ProductoTradicional extends Producto{

	public ProductoTradicional(String nombreProducto, Double precioProducto) {
		super(nombreProducto, precioProducto);
	}
	
	public ProductoTradicional(String nombreProducto, Double precioProducto, Boolean esCuidado) {
		super(nombreProducto, precioProducto, esCuidado);
	}

	
	
}
