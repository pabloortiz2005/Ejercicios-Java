import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		int n;
		System.out.println("Introduce un número entero");
		
		n = leer.nextInt();
		
		int b = 0;
		int suma;
		
		
		
		for (int i =1 ; n!=0 ; i++) {
			n= n/10;
			
			b = i;
		}
		
		System.out.println("El numero tiene " + b + " cifras");
		
	}

}
