package supermercado;

public class ProductoPrimeraNecesidad extends Producto{
	

	public ProductoPrimeraNecesidad(String nombreProducto, Double precioProducto, Boolean esCuidado) {
		super(nombreProducto, precioProducto, esCuidado);
	
	}

	@Override
	public Double getPrecio() {
		return super.getPrecio()*0.9;
	}
	
	
}
