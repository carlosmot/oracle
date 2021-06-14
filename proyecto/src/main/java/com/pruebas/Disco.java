package com.pruebas;

public class Disco {

	String titulo;
	String grupo;

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Disco [titulo=" + titulo + ", grupo=" + grupo + "]";
	}

}
