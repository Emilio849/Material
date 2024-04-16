public class Comic extends MaterialBibliografico {
	
	private String editorial;

	public Comic(String titulo, String autor, int anioPublicacion, String editorial) {
		super(titulo, autor, anioPublicacion);
		this.editorial = editorial;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	@Override
	public String toString() {
		return "Comic   [titulo=" + this.getTitulo() + ", autor=" + this.getAutor() + ", anioPublicacion=" + this.getAnioPublicacion()
				+", editorial=" + this.editorial + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Comic other = (Comic) obj;
		boolean result = false;
		
		if(super.equals(other) && this.editorial.equals(other.editorial)) {
			result = true;
		}
		
		return result;
	}

}
