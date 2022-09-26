package ar.edu.unq.po2.práctica_6.BancoYPrestamos;

public class Propiedad {

	private String descripcion;
	private String direccion;
	private Double valorFiscal;
	
	public Double getValorFiscal() {
		return valorFiscal;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Propiedad(String descripcion, String direccion, Double valorFiscal) {
		super();
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}
	
}
