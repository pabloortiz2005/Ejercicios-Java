package parking;

import java.util.Scanner;

public class AppParking {
	static Scanner numeros = new Scanner (System.in);
	static Scanner letras = new Scanner (System.in);
	
	
	
	public static void main(String[] args)  throws Exception{
		boolean prog=false;
		Parking P = new Parking("Parking Centro", 10);
        int num=0;
        int plaza=0;
        
        String matricula="";
        
        
        
        
		while(prog==false) {
			System.out.println("\n \n 1) Entrada de coche \n 2) Salida de coche \n 3) Mostrar parking \n 4) Salir del programa");
			try {
			num=numeros.nextInt();
			}catch(Exception e) {
				System.out.println("Error ingrese un numero entero valido");
				
			}
			switch(num) {
			
			case 1:
				
				try {
				
				System.out.println("Matricula:");
				matricula=letras.nextLine();
				System.out.println("En que plaza aparcara"); 
				plaza=numeros.nextInt();
				if (plaza<0) {
					throw new ParkingException("La plaza tiene que ser 0 o mayor que 0",matricula);
				}
				P.entrada(matricula,plaza);
				}catch (ParkingException parking) {
					System.out.println("Usa bien la entrada " + parking.getMensaje() + " Matricula: " + parking.getMatricula());
				} catch (NumberFormatException e) {
					System.out.println("Pon una plaza valida");
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;
				
				
			case 2:
				try {
				System.out.println("Introduzca la matricula:");
				matricula=letras.nextLine();
				P.salida(matricula);
				}catch (ParkingException parking) {
					System.out.println("Usa bien la salida: " + parking.getMensaje() + " Matrícula: " + parking.getMatricula());
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;
				
				
			case 3:
				System.out.println(P.toString());
				break;
			case 4:
				prog=true;
				break;
			}
			 
		}
	}
}
