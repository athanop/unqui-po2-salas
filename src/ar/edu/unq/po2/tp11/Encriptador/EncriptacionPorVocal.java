package ar.edu.unq.po2.tp11.Encriptador;

public class EncriptacionPorVocal implements IMetodoDeEncriptacion{

	@Override
	public String encriptar(String texto) {
		return texto.replace("u", "a").replace("o", "u").replace("i", "o").replace("e", "i").replace("a", "e");
	}

	@Override
	public String desencriptar(String texto) {
		return texto.replace("e", "a").replace("i", "e").replace("o", "i").replace("u", "o").replace("u", "a");
	}

}
