package it.prova.model;

public class Autore {

	private String nome;
	private String cognome;

	public Autore() {

	}

	public Autore(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String toString() {
		return " Autore: Nome : " + nome + ", Cognome : " + cognome + "\n ";
	}

}
