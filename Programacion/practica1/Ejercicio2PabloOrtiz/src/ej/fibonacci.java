package ej;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner leer = new Scanner(System.in);
		
		do {
		System.out.println("Introduzca numero: ");
		n = leer.nextInt();
		
	} while(n<0);
		
		int num1=1;
		int suma;
		int num2=1;
		int c=2;
		System.out.print(" " + num1 + "," + " " + num2 + ",");

		//Fibonacci
		
		while (c<n) {

			suma = num1+num2;
			num1= num2;
			if (c==n-1) {
				System.out.print(" " + suma);
			} else {
				System.out.print(" " + suma + ",");
			}
			num2 = suma;
			c++;


		}

	}

}
