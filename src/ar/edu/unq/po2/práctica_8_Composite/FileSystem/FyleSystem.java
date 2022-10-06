package ar.edu.unq.po2.pr�ctica_8_Composite.FileSystem;

import java.time.LocalDate;

public interface FyleSystem{
/**
* Retorna el total ocupado en disco del receptor. Expresado en
	*cantidad de bytes.
*/
public int totalSize();


/**
* Imprime en consola el contenido indicando el nombre del elemento e indentandolo con tantos espacios como profundidad en la
	estructura.
*/
public void printStructure();


/**
* Elemento mas nuevo
*/
public FyleSystem lastModified();


/** Elemento mas antiguo
*/
public FyleSystem oldestElement();

public LocalDate getFecha();

public FyleSystem ultimoModificadoEntre(FyleSystem archivo);


public FyleSystem elementoMasAntiguoEntre(FyleSystem archivo);

}
