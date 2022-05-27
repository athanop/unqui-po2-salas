package ar.edu.unq.po2.tp6.ClienteEMail;


import java.util.ArrayList;
import java.util.List;

public class ClienteEMail {
	
	private IServidor servidor;
	private String nombreUsuario;
	private String passusuario;
	private List<Correo> inbox;
	private List<Correo> borrados;
	
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public String getPassusuario() {
		return passusuario;
	}
	
	public ClienteEMail(IServidor servidor, String nombreUsuario, String pass){
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
		this.conectar();
	}
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.remove(correo);
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}

	public void enviarCorreo(Correo correo){
		this.servidor.enviar(correo);
	}

}
