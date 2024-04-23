package biblioteca;

import biblioteca.material.Comic;
import biblioteca.material.Libro;
import biblioteca.material.Revista;

public class Main {
	
	public static void main(String[] args) {
		
		// Creando tres objetos de la clase Libro
        Libro libro1 = new Libro("El señor de los anillos", "J.R.R. Tolkien", 1954, "Fantasía");
        Libro libro2 = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 1997, "Fantasía");
        Libro libro3 = new Libro("El código Da Vinci", "Dan Brown", 2003, "Misterio");

        // Creando tres objetos de la clase Revista
        Revista revista1 = new Revista("National Geographic", "Society", 1888, 1);
        Revista revista2 = new Revista("Time", "Time Inc.", 1923, 2);
        Revista revista3 = new Revista("Scientific American", "Springer Nature", 1845, 3);

        // Creando tres objetos de la clase Comic
        Comic comic1 = new Comic("Spider-Man", "Stan Lee", 1962, "Marvel Comics");
        Comic comic2 = new Comic("Batman", "Bob Kane", 1939, "DC Comics");
        Comic comic3 = new Comic("One Piece", "Eiichiro Oda", 1997, "Shueisha");
        
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.aniadirMaterial(libro1);
        biblioteca.aniadirMaterial(libro2);
        biblioteca.aniadirMaterial(libro3);
        biblioteca.aniadirMaterial(revista1);
        biblioteca.aniadirMaterial(revista2);
        biblioteca.aniadirMaterial(revista3);
        biblioteca.aniadirMaterial(comic1);
        biblioteca.aniadirMaterial(comic2);
        biblioteca.aniadirMaterial(comic3);
        
        biblioteca.mostrar();
        
        biblioteca.ordenarPorTitulo();
        
        biblioteca.mostrar();
        
        biblioteca.ordenarPorAutor();
        
        biblioteca.mostrar();
        
        biblioteca.ordenarPorAnioPublicacion();
        
        biblioteca.mostrar();

        biblioteca.mostrarLibros();
        biblioteca.mostrarRevistas();
        biblioteca.mostrarComics();
		
	}

}
