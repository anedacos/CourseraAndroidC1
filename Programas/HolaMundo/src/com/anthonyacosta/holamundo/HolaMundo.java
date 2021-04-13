package com.anthonyacosta.holamundo;

public class HolaMundo {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Hola mundo xD");
//		short i = 0; //2 bytes
//		byte j = 0; //1 byte
//		int k = 0; //4 bytes
//		long l = 0; //8 bytes
//		
//		byte edad = 27;
//		short anio = 2021;
//		int id = 145625484;
//		long hora = 777777777;
//		
//		float estatura = 1.80F;
//		double resultado = 932.181636041;
//		
//		char genero = 'F';
//		boolean status = true;
//		
//		int arreglo[] = new int [5];
//		arreglo[2] = 5;
//		System.out.println(arreglo[2]);
//		
//		double nuevoArreglo[][] = new double[3][3];
//		nuevoArreglo[1][1] = 4.56;
//		System.out.println(nuevoArreglo[1][1]);
//		
//		//Sumas y restas
//		int a = 1;
//		int b = 2;
//		int c = 0;
//		
//		c=a+b;
//		
//		System.out.println("La suma es: " + c + " a/b");
		
		int matriz[][] = {{2,4,6,8},{10,12,14,16},{18,20,22,24},{26,28,30,32}};

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]);
            }
                System.out.println(" ");
        }
		
	}

}
