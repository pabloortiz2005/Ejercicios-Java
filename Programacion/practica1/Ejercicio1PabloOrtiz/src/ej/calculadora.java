package ej;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner leer = new Scanner(System.in);
		int sol=0;
		int primero=0, segundo=0;
		int controlador=0;
		boolean c=false;
	

		//While grande para usar la caculadora hasta que queramos

		do{


			//comprobamos que la opcion introducida es correcta


			do{
				System.out.println("******MENU*****");
				System.out.println("*SUMA***********=***1**");
				System.out.println("*RESTA**********=***2**");
				System.out.println("*MULTIPLICACION*=***3**");
				System.out.println("*DIVISION*******=***4**");
				System.out.println("*RESTO**********=***5**");
				System.out.println("*POTENCIA*******=***6**");
				System.out.println("*SALIR**********=***0**");
				controlador=leer.nextInt();

				if (controlador==1 || controlador==2 || controlador==3 || controlador==4 || controlador==5 || controlador==6 || controlador==0) {
				
					
					c=true;
				} else {
					System.out.println("Opcion erronea");
				}





			} while(c=false);

			//Pedimos los dos numeros
			
		


			// Distintas operaciones




			switch(controlador) {

			case 1:
				System.out.println("Introduzca el primer numero: ");
				primero = leer.nextInt();
				System.out.println("Introduzca el segundo numero: ");
				segundo = leer.nextInt();
				sol=primero+segundo;
				System.out.println("La suma es: " + sol);
				break;

			case 2:
				
				System.out.println("Introduzca el primer numero: ");
				primero = leer.nextInt();
				System.out.println("Introduzca el segundo numero: ");
				segundo = leer.nextInt();
				sol=primero-segundo;
				System.out.println("La resta es: " + sol);
				break;
			case 3:
				System.out.println("Introduzca el primer numero: ");
				primero = leer.nextInt();
				System.out.println("Introduzca el segundo numero: ");
				segundo = leer.nextInt();
				sol=primero*segundo;
				System.out.println("La multiplicacion es: " + sol);
				break;
			case 4:
				System.out.println("Introduzca el primer numero: ");
				primero = leer.nextInt();
				System.out.println("Introduzca el segundo numero: ");
				segundo = leer.nextInt();
				sol=primero/segundo;
				System.out.println("La division es: " + sol);
				break;
			case 5:
				System.out.println("Introduzca el primer numero: ");
				primero = leer.nextInt();
				System.out.println("Introduzca el segundo numero: ");
				segundo = leer.nextInt();
				sol=primero%segundo;
				System.out.println("El modulo es: " + sol);
				break;
			case 6:
				System.out.println("Introduzca el numero: ");
				primero = leer.nextInt();
				sol=(int) Math.pow(primero, 2);
				System.out.println(primero + " elevado a 2 es: " + sol);
				break;
			case 0:
				break;
			}
			
		} while (controlador!=0);
	}
}

