package biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import biblioteca.comparadores.ComparaAniosPublicacion;
import biblioteca.comparadores.ComparaAutores;
import biblioteca.comparadores.ComparaTitulos;
import biblioteca.material.Comic;
import biblioteca.material.Libro;
import biblioteca.material.MaterialBibliografico;
import biblioteca.material.Revista;

public class Biblioteca {
	
	private List<MaterialBibliografico> materiales;

	public Biblioteca() {
		this.materiales = new ArrayList<>();
	}
	
	public void aniadirMaterial(MaterialBibliografico material) {
		this.materiales.add(material);
	}
	
	public void eliminarMaterial(MaterialBibliografico material) {
		this.materiales.remove(material);
	}
	
	public void mostrar() {
		System.out.println("BIBLIOTECA: ");
		for(MaterialBibliografico mat : this.materiales) {
			System.out.println(mat);
		}
		System.out.println("-----------------------------------------------");
	}

	public void ordenarPorTitulo() {
		Collections.sort(this.materiales, new ComparaTitulos());
	}

	public void ordenarPorAutor() {
		Collections.sort(this.materiales, new ComparaAutores());
	}

	public void ordenarPorAnioPublicacion() {
		Collections.sort(this.materiales, new ComparaAniosPublicacion());
	}
	
	public void mostrarLibros() {
		List<Libro> libros = new ArrayList<>();
		
		for(MaterialBibliografico mat : this.materiales) {
			if(mat instanceof Libro) {
				libros.add((Libro) mat);
			}
		}
		
		Collections.sort(libros);

		System.out.println("LIBROS: ");
		for(Libro libro : libros) {
			System.out.println(libro);
		}
		System.out.println("-----------------------------------------------");
	}
	
	public void mostrarRevistas() {
		List<Revista> revistas = new ArrayList<>();
		
		for(MaterialBibliografico mat : this.materiales) {
			if(mat instanceof Revista) {
				revistas.add((Revista) mat);
			}
		}
		
		Collections.sort(revistas);

		System.out.println("REVISTAS: ");
		for(Revista revista : revistas) {
			System.out.println(revista);
		}
		System.out.println("-----------------------------------------------");
	}
	
	public void mostrarComics() {
		List<Comic> comics = new ArrayList<>();
		
		for(MaterialBibliografico mat : this.materiales) {
			if(mat instanceof Comic) {
				comics.add((Comic) mat);
			}
		}
		
		Collections.sort(comics);

		System.out.println("COMICS: ");
		for(Comic comic : comics) {
			System.out.println(comic);
		}
		System.out.println("-----------------------------------------------");
	}

}
