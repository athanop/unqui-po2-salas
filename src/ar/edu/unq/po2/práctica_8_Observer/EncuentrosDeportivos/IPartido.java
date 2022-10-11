package ar.edu.unq.po2.práctica_8_Observer.EncuentrosDeportivos;

public interface IPartido {

	public void suscribir(IObserver observer, String temaDeInteres);
	public void desuscribir(IObserver observer, String temaDeInteres);
	public void notificar(String temaDeInteres);
}
