package parking;

import java.util.Scanner;

public class AppParking {
	static Scanner numeros = new Scanner (System.in);
	static Scanner letras = new Scanner (System.in);
	
	
	
	public static void main(String[] args) {
		boolean prog=false;
		Parking P = new Parking("Parking Centro", 10);
        int num=0;
        int plaza=0;
        
        String matricula="";
		while(prog==false) {
			
			
			System.out.println("\n \n 1) Entrada de coche \n 2) Salida de coche \n 3) Mostrar parking \n 4) Salir del programa");
			num=numeros.nextInt();
			switch(num) {

			case 1:
				System.out.println("Matricula:");
				matricula=letras.nextLine();
				System.out.println("En que plaza aparcara"); 
				plaza=numeros.nextInt();
				P.entrada(matricula,plaza);
				
				
				
				
			case 2:
				System.out.println("Matricula:");
				matricula=letras.nextLine();
				P.salida(matricula);
				
				
				
			case 3:
				P.toString();
				
			case 4:
				prog=true;
				break;
			}

		}
	}
}
