package ar.edu.unq.po2.tp6.caso1;

public class Correo {

	private IServidor servidor;
	private ClienteEMail cliente;
	private String cuerpo;
	private String destinatario;
	private String asunto;
	
	public void recibirNuevos(){
		this.servidor.recibirNuevos(cliente.getNombreUsuario(), cliente.getPassusuario());
	}
	
	public Correo(String asunto, String destinatario, String cuerpo) {
		this.asunto = asunto;
		this.destinatario = destinatario;
		this.cuerpo = cuerpo;
	}

}
