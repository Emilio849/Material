import java.time.LocalDate;

public class MaterialBibliografico {
	
	private String titulo;
	private String autor;
	private int anioPublicacion;
	
	public MaterialBibliografico(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = LocalDate.now().getYear();
	}
	
	public MaterialBibliografico(String titulo, String autor, int anioPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		setAnioPublicacion(anioPublicacion);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		if(anioPublicacion < 1800) {
			throw new IllegalArgumentException("El año no puede ser inferior a 1800. ");
		}
		this.anioPublicacion = anioPublicacion;
	}

	@Override
	public boolean equals(Object obj) {
		MaterialBibliografico otro = (MaterialBibliografico) obj;
		boolean result = false;
		
		if(this.titulo.equals(otro.titulo) && this.autor.equals(otro.autor) && this.anioPublicacion == otro.anioPublicacion) {
			result = true;
		}
		
		return result;
	}

}
