package practica;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
	
		int [] matriz= new int [20];
		int [] pares= new int [20];
		int [] impares= new int [20];
		int cp=0;
		int ci=0;
		for (int i =0; i < 20; i++) {
			matriz[i]=(int)Math.round(Math.random()*100);
			
			if (matriz[i]%2==0) {
				
				pares[cp]=matriz[i];
				cp++;
			} else {
				
				impares[ci]=matriz[i];
				ci++;
			}
			
			
		}
		System.out.println("Array inicial");
		for (int i =0; i < 20; i++) {
			
			System.out.print(matriz[i] + " ");
			
		}
		
		
		System.out.println("\n Con numeros pares al principio");
		for (int i=0; i<cp;i++) {
			
			System.out.print(pares[i] + " ");
		}
		
		for (int i=0; i<ci;i++) {
			
			System.out.print(impares[i] + " ");
		}
		
			
			
	}

}
