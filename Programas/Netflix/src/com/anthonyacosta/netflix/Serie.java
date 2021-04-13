package com.anthonyacosta.netflix;

public class Serie extends Filme {
	int noTemporadas=1;

	public Serie() {
		
	}
	
	public Serie(String titulo, String creador) {
		super(titulo, creador);
	}
	public Serie(String titulo, String genero, String creador, int noTemporadas, int duracion) {
		super(titulo, genero, creador, duracion);
		this.noTemporadas = noTemporadas;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", genero=" + genero + ", creador=" + creador + ", noTemporadas="
				+ noTemporadas + ", duracion=" + duracion + ", visto=" + visto + "]";
	}
	
}