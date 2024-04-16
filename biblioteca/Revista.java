public class Revista extends MaterialBibliografico {
	
	private int numeroEdicion;

	public Revista(String titulo, String autor, int anioPublicacion, int numeroEdicion) {
		super(titulo, autor, anioPublicacion);
		this.numeroEdicion = numeroEdicion;
	}

	public int getNumeroEdicion() {
		return numeroEdicion;
	}

	public void setNumeroEdicion(int numeroEdicion) {
		this.numeroEdicion = numeroEdicion;
	}
	
	@Override
	public String toString() {
		return "Revista [titulo=" + this.getTitulo() + ", autor=" + this.getAutor() + ", anioPublicacion=" + this.getAnioPublicacion()
				+", numeroEdicion=" + this.numeroEdicion + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Revista other = (Revista) obj;
		boolean result = false;
		
		if(super.equals(other) && this.numeroEdicion == other.numeroEdicion) {
			result = true;
		}
		
		return result;
	}

}
