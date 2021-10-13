package it.prova.test;

import java.util.HashMap;
import java.util.Map;

import it.prova.model.Autore;
import it.prova.model.Libro;

public class TestMap {

	public static void main(String[] args) {

		Map<Libro, Autore> insiemeLibroAutore = new HashMap<Libro, Autore>();

		// Aggiungo elementi alla mappa

		insiemeLibroAutore.put(new Libro("Harry Potter", "Fantasy"), new Autore("JK", "Rowling"));
		insiemeLibroAutore.put(new Libro("IT", "Horror"), new Autore("Stephen", "King"));
		insiemeLibroAutore.put(new Libro("1984", "Distopico"), new Autore("George", "Orwell"));

		for (Map.Entry<Libro, Autore> mapLista : insiemeLibroAutore.entrySet()) {
			System.out.println(mapLista);
		}

		System.out.println("Nella mappa sono Presenti: " + insiemeLibroAutore.size() + " elementi"); // Verifico la
																										// grandezza
																										// della mappa
		insiemeLibroAutore.clear(); // Elimino il contenuto della mappa
		System.out.println(insiemeLibroAutore); // verifico se il contenuto è stato effettivamente eliminato

	}

}
