package com.islasfilipinas;

import java.util.Scanner;

public class Ejercicio2 {
	private static Scanner teclado;

	public static void main(String[] ar) {
		teclado = new Scanner(System.in);
		//los dos primeros números se sumarán y los dos últimos se multiplicaran
		int resul1, resul2, n1 , n2, n3, n4;
		System.out.println( "Introduzca cuatro números : " );
	        n1 = teclado.nextInt();
	        n2 = teclado.nextInt();
	        n3 = teclado.nextInt();
	        n4 = teclado.nextInt();
	        
	        resul1=n1+n2;
	        resul2=n3*n4;
	        
	        System.out.println( "La suma de " + n1 + " más " + n2 + " es " + resul1 + "." );
	        System.out.println( "El producto de " + n3 + " por " + n4 + " es " + resul2 + "." );
		
		}
}
	

