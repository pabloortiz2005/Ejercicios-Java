package multi;

public class Disc extends multi{
	
	private Genero genero;
	
	public Disc(Genero genero) {
		super();
		this.genero=genero;
	}
	
	public Disc() {
		super();
	}
	
	
	public Disc(String titulo,String autor,Formato formato, int duracion, Genero genero) {
		super( titulo, autor, formato,  duracion);
		this.genero=genero;
	}

	@Override
	public String toString() {
		return "Disco: genero=" + genero + ", Titulo=" + getTitulo() + ", Autor=" + getAutor()
				+ ", Formato=" + getFormato() + ", Duracion=" + getDuracion();
	}

	
	
}
