package com.anthonyacosta.netflix;

import java.util.ArrayList;

public class Netflix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp=0;
		int p=0;
		int s=0;
		
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		ArrayList<Serie> series = new ArrayList<Serie>();
		
		peliculas.add(new Pelicula("El matata","Ciencia ficcion","Robert Denilo",2018,210));
		peliculas.add(new Pelicula("Rescate en Nueva York","accion","Robert Denilo",2020,142));
		peliculas.add(new Pelicula("Golpe en la pequeña China","drama","John Carpenter",1995,125));
		peliculas.add(new Pelicula("Arma Letal'","Suspenso","Richard Donner",2019,205));
		peliculas.add(new Pelicula("Jungla de Cristal","comedia","John McTiernan",1990,192));

		series.add(new Serie("A dos metros bajo tierra","drama","Alan Ball",4,500));
		series.add(new Serie("El ala oeste de la Casa Blanca","idealista","Aaron Sorkin ",5,550));
		series.add(new Serie("Alfred Hitchcock presenta","suspenso","Alfred Hitchcock",12,220));
		series.add(new Serie("Battlestar Galactica","ciencia ficcion","Ronald D. Moore",11,453));
		series.add(new Serie("Bojack Horseman","animada","Raphael Bob-Waksberg",10,700));
		try {
			peliculas.get(0).marcarVisto();
			peliculas.get(3).marcarVisto();
			series.get(1).marcarVisto();
			series.get(4).marcarVisto();
			
			temp=peliculas.get(0).anio;
			
			for (int i = 0; i<peliculas.size();i++) {
				if(peliculas.get(i).visto) {
					System.out.println(peliculas.get(i).toString());
				}
				if(peliculas.get(i).anio>temp) {
					temp=peliculas.get(i).anio;
					p=i;
				}
			}
			
			temp=series.get(0).noTemporadas;
			
			for(int i=0; i<series.size();i++) {
				if(series.get(i).visto) {
					System.out.println(series.get(i).toString());
				}
				if(series.get(i).noTemporadas>temp) {
					temp=series.get(i).noTemporadas;
					s=i;
				}
			}
			
			System.out.println("\nPelicula mas reciente:\n"+peliculas.get(p).toString());	
			System.out.println("\nSerie con mas temporadas:\n"+series.get(s).toString());
		} catch (Exception e) {
			System.out.println("Ocurrio un error");
		}
		
	}

}
