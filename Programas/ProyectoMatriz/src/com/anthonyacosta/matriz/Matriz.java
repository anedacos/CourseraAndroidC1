package com.anthonyacosta.matriz;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont=0;
		for(int i=1; i<=16 ; i++) {
				cont++;
				if (cont<4) {
					System.out.print(i*2+"  ");
				}else {
					System.out.print(i*2+" ");
				}
				if (cont==4 || cont ==8 || cont==12) {
					System.out.println();
				}
		}
	}

}
