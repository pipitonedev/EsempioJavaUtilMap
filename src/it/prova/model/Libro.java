package it.prova.model;

public class Libro {

	private String titolo;
	private String genere;

	public Libro() {
		super();
	}

	public Libro(String titolo, String genere) {
		super();
		this.titolo = titolo;
		this.genere = genere;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String toString() {
		return "Libro: \nTitolo : " + titolo + ", Genere : " + genere + " ";
	}

}
