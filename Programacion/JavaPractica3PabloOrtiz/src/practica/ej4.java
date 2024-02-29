package practica;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int a=0;
		
		
		Scanner leer = new Scanner (System.in);
		
		n=(int) Math.round(Math.random()*100);
		
		for(int i=0; i<5;i++) {
			
		System.out.println("introduzca el numero: ");

		a =leer.nextInt();
		
		if(a==n){
			
			System.out.println("Correcto");
			i=5;
		} else if(a>n){
			System.out.println("El numero es mas pequeño");
			   
		   }else {
			   System.out.println("El numero es mas grande");
		   }
		}
		System.out.println("El numero era " + n);
	}
}
