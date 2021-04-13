package com.anthonyacosta.netflix;

//import java.util.ArrayList;

public class Netflix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp=0;
		int p=0;
		int s=0;
		
		//ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		Pelicula peliculas[]= new Pelicula[5];
		Serie series[]=new Serie[5];
		
		peliculas[0]=new Pelicula("El matata","Ciencia ficcion","Robert Denilo",2018,210);
		peliculas[1]=new Pelicula("Rescate en Nueva York","accion","Robert Denilo",2020,142);
		peliculas[2]=new Pelicula("Golpe en la pequeña China","drama","John Carpenter",1995,125);
		peliculas[3]=new Pelicula("Arma Letal'","Suspenso","Richard Donner",2019,205);
		peliculas[4]=new Pelicula("Jungla de Cristal","comedia","John McTiernan",1990,192);
		
		series[0]= new Serie("A dos metros bajo tierra","drama","Alan Ball",4,500);
		series[1]= new Serie("El ala oeste de la Casa Blanca","idealista","Aaron Sorkin ",5,550);
		series[2]= new Serie("Alfred Hitchcock presenta","suspenso","Alfred Hitchcock",12,220);
		series[3]= new Serie("Battlestar Galactica","ciencia ficcion","Ronald D. Moore",11,453);
		series[4]= new Serie("Bojack Horseman","animada","Raphael Bob-Waksberg",10,700);
		
		peliculas[0].marcarVisto();
		peliculas[3].marcarVisto();
		series[1].marcarVisto();
		series[4].marcarVisto();
		
		temp=peliculas[0].anio;

		for (int i = 0; i<peliculas.length;i++) {
			if(peliculas[i].visto) {
				System.out.println(peliculas[i].toString());
			}
			if(peliculas[i].anio>temp) {
				temp=peliculas[i].anio;
				p=i;
			}
		}
		
		temp=series[0].noTemporadas;
		
		for(int i=0; i<series.length;i++) {
			if(series[i].visto) {
				System.out.println(series[i].toString());
			}
			if(series[i].noTemporadas>temp) {
				temp=series[i].noTemporadas;
				s=i;
			}
		}
		
		
		System.out.println("\nPelicula mas reciente:\n"+peliculas[p].toString());	
		System.out.println("\nSerie con mas temporadas:\n"+series[s].toString());
		
	}

}
