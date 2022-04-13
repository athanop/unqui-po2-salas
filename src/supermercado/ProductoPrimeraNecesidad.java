package supermercado;

public class ProductoPrimeraNecesidad extends Producto{
	

	public ProductoPrimeraNecesidad(String nombreProducto, Double precioProducto, Boolean esCuidado, Double conDescuento) {
		super(nombreProducto, precioProducto, esCuidado, conDescuento);
	
	}

	@Override
	public Double getPrecio() {
		return super.getPrecio()*super.getDescuento();
	}
	
	
}
