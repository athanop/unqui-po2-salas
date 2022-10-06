package ar.edu.unq.po2.práctica_8_Composite.FileSystem;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio implements FyleSystem{

	private List<FyleSystem> contenido;
	private String nombre;
	private LocalDate fechaCreacion;
	
	@Override
	public LocalDate getFecha() {
		return this.fechaCreacion;
	}
	
	public void agregarElemento(FyleSystem elemento) {
		this.contenido.add(elemento);
	}
	
	public void removerElemento(FyleSystem elemento) {
		this.contenido.remove(elemento);
	}

	public Directorio(String nombre, LocalDate fechaCreacion) {
		super();
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.contenido = new ArrayList<FyleSystem>();
	}

	@Override
	public int totalSize() {
		int total=this.contenido.stream().mapToInt(FyleSystem::totalSize).sum();
		return total;
	}

	@Override
	public void printStructure() {		
		for(FyleSystem fs:this.contenido) {
			fs.printStructure();
			printEspacios();
		}
		System.out.println(this.nombre);
	}

	private void printEspacios() {
		for(FyleSystem f:this.contenido) {
			System.out.println(" ");
		}
	}

	@Override
	public FyleSystem lastModified() {
		FyleSystem ultimo = this;
		for(FyleSystem fs:this.contenido) {
			ultimo = ultimo.ultimoModificadoEntre(fs);
		}
		return ultimo;
	}

	@Override
	public FyleSystem oldestElement() {
		FyleSystem ultimo = this;
		for(FyleSystem fs:this.contenido) {
			ultimo = ultimo.elementoMasAntiguoEntre(fs);
		}
		return ultimo;
	}

	@Override
	public FyleSystem ultimoModificadoEntre(FyleSystem archivo) {
		if(this.getFecha().isAfter(archivo.getFecha())) {
			return this;
		}
		else {
			return archivo;
		}
	}

	@Override
	public FyleSystem elementoMasAntiguoEntre(FyleSystem archivo) {
		if(this.getFecha().isBefore(archivo.getFecha())) {
			return this;
		}
		else {
			return archivo;
		}
	}


}
