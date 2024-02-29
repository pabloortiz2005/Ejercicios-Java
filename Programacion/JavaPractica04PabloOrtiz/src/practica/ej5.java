package practica;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		int n=0;
		String [] matriz= new String [8];
		
		
		for (int i=0; i<8;i++) {
			System.out.println("Introduce el numero: " + (i+1));
			n= leer.nextInt();
		if (n%2==0)	{
			matriz[i]=n+" es par";
		} else {
			matriz [i]=n+" es impar";
			
		}
		
		}
		
		for (int i=0; i<8;i++) {
			
			System.out.println(matriz[i]);
		}
		
		
			
		
	}

}
