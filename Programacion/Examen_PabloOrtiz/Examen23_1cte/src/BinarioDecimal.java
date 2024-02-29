/**
 * 
 */

import java.util.Scanner;

/**
 * @author NOMBRE Y APELLIDOS DEL ALUMN@
 *
 */
public class BinarioDecimal {


	/**
	 * @param args
	 * Programa que realiza la conversión de números:
	 * Opción 1. De DECIMAL a BINARIO
	 * Opción 2. De BINARIO a DECIMAL
	 * Para salir deberá pulsar 0.
	 */


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int controlador=0;

		boolean c=false;



		/* 
		 * Principal del programa. Sólo mostrar el menú. 
		 */

		//GENERAR MENÚ y llamar a métodos; 
		// ConvierteBinarioADecimal() y ConvierteDecimalABinario()
		// Comprobar SIEMPRE datos insertados por el usuario en consola
		//ConvierteBinarioADecimal();
		//ConvierteDecimalABinario();
	
		do {


			do{
				long decimal = 0;
				System.out.println("Ingrese un número:");
				String input = scanner.nextLine();

				System.out.println("******MENU*****");
				System.out.println("*BINARIO-DECIMAL=1");
				System.out.println("*DECIMAL-BINARIO=2");
				System.out.println("******SALIR*****=0");

				controlador=scanner.nextInt();
				switch(controlador) {

				
				
				case 1:
					//Utilidad de java para convertir de binario a decimal
					
					decimal = Long.parseLong(input, 2); //Estoy usando el radix para los digitos
					ConvierteBinarioADecimal(decimal);
					
					break;

				case 2:
					//Utilidad de java para convertir de binario a decimal
					decimal = Long.parseLong(input, 10); //Estoy usando el radix para los digitos
					ConvierteDecimalABinario(decimal);
					
					break;
				case 0:

					break;
				}

				if (controlador==1 || controlador==2 || controlador==0) {


					c=true;
				} else {
					System.out.println("Opcion erronea");
				}





			} while(c=false);



		} while(controlador!=0);


		System.out.println(" \n \n \t GRACIAS POR UTILIZAR NUESTRA APLICACIÓN.... Goodbye!!! .... ");

	}
		

	private static void ConvierteDecimalABinario(long dec) {
		/*
		 * Método para convertir de DECIMAL a BINARIO
		 * Pedir datos al usuario, comprobar datos, realizar conversión
		 *  e informar al usuario por pantalla (Generar método IMPRIMIR)
		 */

		
		
		System.out.println("Binario: " + Long.toBinaryString(dec));

	

	}

	private static void ConvierteBinarioADecimal(long dec) {
		/*
		 * Método para convertir de BINARIO a DECIMAL
		 * Pedir datos al usuario, comprobar datos, realizar conversión
		 *  e informar al usuario por pantalla (Generar método IMPRIMIR)
		 */

		
		System.out.println("Decimal: " + dec);
		

	}




}
