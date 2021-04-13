package com.anthonyacosta.netflix;

public class Filme implements IFilme{

	String titulo, genero, creador;
	int duracion;
	boolean visto;
	public String getTitulo() {
		return titulo;
	}
	
	public Filme() {
		
	}
	
	public Filme(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}



	public Filme(String titulo, String genero, String creador, int duracion) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.duracion = duracion;
	}


	public String getTitulo(String titulo) {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public boolean isVisto() {
		return visto;
	}
	public void setVisto(boolean visto) {
		this.visto = visto;
	}

	@Override
	public void marcarVisto() {
		// TODO Auto-generated method stub
		this.visto=true;
	}

	@Override
	public String esVisto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int tiempoVisto() {
		// TODO Auto-generated method stub
		return 0;
	}

}
