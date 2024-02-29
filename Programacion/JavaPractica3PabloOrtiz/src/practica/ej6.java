package practica;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int n=0;
		int a=0;
		
		
		Scanner leer = new Scanner (System.in);
		
	
		
		for(int i=0; n!=24;i++) {
		n=(int) Math.round(Math.random()*100);
		
		if(n%2!=0){

			i-=1;
		
		a=i;
		
		
		}
		
	}
		System.out.println("Has usado " + a + " intentos");
}
}
