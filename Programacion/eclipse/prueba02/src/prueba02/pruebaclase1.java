package prueba02;

import java.util.Scanner;

public class pruebaclase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		String nombre;
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Introduce un numero");
		
		num = leer.nextInt();
		
		System.out.println("Introduce tu nombre");
		
		nombre = leer.next();
		
		System.out.println("El numero introducido es: " + num + " y tu nombre: " + nombre);
		
	}

}
