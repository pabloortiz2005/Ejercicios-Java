package practica;

import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res="";
		Scanner leer = new Scanner (System.in);
		int t=100;
		int [] matriz= new int [100];
		int min=500;
		int max=0;
		
		for (int i =0; i < t; i++) {
		matriz[i]=(int)Math.round(Math.random()*500);
		if (matriz[i] > max) {
			max= matriz [i];
		}if(matriz[i]<min) {
			min = matriz[i];
		}
		}
		
		for (int i =0; i < t; i++) {
			System.out.print(matriz[i] + " ");
			}
		System.out.println("");
		System.out.println("Quieres resaltar el maximo o el minimo? (min/max)");
		res=leer.next();
		
		
		if (res.equalsIgnoreCase("min")) {
			
			for (int i =0;i<t;i++) {
				
			if(matriz[i]==min) {
					System.out.print(" ** " + min + " ** ");
				} else {
					
					System.out.print(matriz [i] + " ");
				}
				
			}
			
		} 
		if (res.equalsIgnoreCase("max")) {
			
			for (int i =0;i<t;i++) {
				
			if(matriz[i]==max) {
					System.out.print(" ** " + max + " ** ");
				} else {
					
					System.out.print(matriz [i] + " ");
				}
				
			}
			
		}
		
		
		
	}

}
