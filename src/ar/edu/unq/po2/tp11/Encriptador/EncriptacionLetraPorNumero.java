package ar.edu.unq.po2.tp11.Encriptador;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class EncriptacionLetraPorNumero implements IMetodoDeEncriptacion{

	private Map<String, String> abecedario;
	
	
	public EncriptacionLetraPorNumero() {
		
		this.abecedario = new HashMap<String, String>();
		
		abecedario.put(" ", "0");
		abecedario.put("a", "1");
		abecedario.put("b", "2");
		abecedario.put("c", "3");
		abecedario.put("d", "4");
		abecedario.put("e", "5");
		abecedario.put("f", "6");
		abecedario.put("g", "7");
		abecedario.put("h", "8");
		abecedario.put("i", "9");
		abecedario.put("j", "10");
		abecedario.put("k", "11");
		abecedario.put("l", "12");
		abecedario.put("m", "13");
		abecedario.put("n", "14");
		abecedario.put("o", "15");
		abecedario.put("p", "16");
		abecedario.put("q", "17");
		abecedario.put("r", "18");
		abecedario.put("s", "19");
		abecedario.put("t", "20");
		abecedario.put("u", "21");
		abecedario.put("v", "22");
		abecedario.put("w", "23");
		abecedario.put("x", "24");
		abecedario.put("y", "25");
		abecedario.put("z", "26");
		
		Map<String, String> abecedarioInvertido = abecedario.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
		this.abecedario.putAll(abecedarioInvertido);
	}

	@Override
	public String encriptar(String texto) {
		char[] array = texto.toCharArray();
		String textoEncriptado = "";
		for (char c : array) {
			textoEncriptado += this.abecedario.get(Character.toString(c).toLowerCase()) + ",";
		}
		return textoEncriptado.substring(0, textoEncriptado.length() -1);
	}

	@Override
	public String desencriptar(String texto) {
		String[] claves = texto.split(",");
		String palabraDesencriptada = "";
		for (String string : claves) {
			palabraDesencriptada += this.abecedario.get(string);
		}
		palabraDesencriptada = palabraDesencriptada.substring(0, 1).toUpperCase() + palabraDesencriptada.substring(1);
		return palabraDesencriptada;
	}

}
