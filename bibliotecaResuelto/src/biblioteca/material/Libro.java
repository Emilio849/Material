package biblioteca.material;

public class Libro extends MaterialBibliografico implements Comparable<Libro> {
	
	private String genero;

	public Libro(String titulo, String autor, int anioPublicacion, String genero) {
		super(titulo, autor, anioPublicacion);
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Libro   [titulo=" + this.getTitulo() + ", autor=" + this.getAutor() + ", anioPublicacion=" + this.getAnioPublicacion()
				+", genero=" + this.genero + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Libro other = (Libro) obj;
		boolean result = false;
		
		if(super.equals(other) && this.genero.equals(other.genero)) {
			result = true;
		}
		
		return result;
	}

	@Override
	public int compareTo(Libro o) {
		return this.genero.compareTo(o.genero);
	}
	
	

}
