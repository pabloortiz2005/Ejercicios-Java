package paquete;

import java.util.Scanner;

public class ej12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combinacion();
		
	}
	public static void combinacion() {
		Scanner leer = new Scanner (System.in);
		 
		 
		 int n1=0, n2=0, n3=0, n4=0;
		 
		 
		
		 for (int i=1;i<5;i++ ) {
			 
			 
			 do {
				 
				 System.out.println("Introduce número 1: ");
				 n1=leer.nextInt();
			 } while(n1<0 || n1>9);
			 do {
				 System.out.println("Introduce número 2: ");
				 
				 n2=leer.nextInt();
			 } while(n2<0 || n2>9);
			 do {
				 System.out.println("Introduce número 3: ");
				 
				 n3=leer.nextInt();
			 } while(n3<0 || n3>9);
			 do {
				 
				 System.out.println("Introduce número 4: ");
				 n4=leer.nextInt();
			 } while(n4<0 || n4>9);
			
			 
			 if (n1 < 0 || n1 >9 || n2 < 0 || n2 >9 || n3 < 0 || n3 >9 || n4 < 0 || n4 >9) {
				 System.out.println("Codigo erroneo");
				 i++;
				 System.out.println("Has usado " + i + "de 4 intentos");
				 i--;
				 
			 } else if (n1== 7 && n2==8 && n3==9 && n4==1){
				 
				 System.out.println("Caja abierta");
				 i=4;
			 } else if (i<5){
				 
				 System.out.println("Codigo erroneo");
				 System.out.println("Has usado " + i + " de 4 intentos");
				  if (i == 4) {
						 
						 System.out.println("Caja cerrada");
					 }
			 } 

			 
		 }
	}
}
