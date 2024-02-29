package practica;

import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1;
		int maxNumero=0;
		int minNumero=0;
		boolean res=false;
		String sol="";
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("introduzca el numero: ");

		n =leer.nextInt();
		maxNumero=100;
		minNumero=0;
	int a =0;
		
		int i=0;
		
		while (i<5){
			a = (int) (Math.random() * (maxNumero - minNumero + 1) + minNumero);
			i++;
			if (a==n){
				res=true;
                break;
			}
			System.out.println("¿Es el numero " + a + "?");
            System.out.println("Responde 'mayor' o 'menor': ");
            String respuesta = leer.next();
            
			 if (respuesta.equalsIgnoreCase("mayor")) {
                minNumero = a + 1;
            } else if (respuesta.equalsIgnoreCase("menor")) {
                maxNumero = a - 1;
            } else {
                System.out.println("Respuesta no válida. Por favor, responde 'mayor'o 'menor'.");
                i--; 
            }
            
            
		}
		if (res==true) {
			System.out.println("Correcto el numero es " + a);
		} else {
			System.out.println("Error, el numero era " + n + " no " + a);
		}
			
			
			
		
		}
		
		
		
		
	}



