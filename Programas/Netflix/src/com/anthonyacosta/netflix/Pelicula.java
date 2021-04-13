package com.anthonyacosta.netflix;

public class Pelicula extends Filme{
	
	int anio;
	
	public Pelicula() {
		
	}

	public Pelicula(String titulo, String creador) {
		super(titulo, creador);
		this.visto = false;
	}

	public Pelicula(String titulo, String genero, String creador, int anio, int duracion) {
		super(titulo, genero, creador, duracion);
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", genero=" + genero + ", creador=" + creador + ", anio=" + anio
				+ ", duracion=" + duracion + ", visto=" + visto + "]";
	}

	
	
}
