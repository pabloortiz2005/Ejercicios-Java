import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);


		int n=0;
		int numero=0;
		String num="";
		String numn="";
		System.out.println("introduzca el numero: ");

		n =leer.nextInt();
		char b;
		String f="";
		String a="";

		String c = "" + n;
		for ( int i = 0; i <c.length();i++) {
			
			b= c.charAt(i);
			a=a+b;
			
			numero = Character.getNumericValue(b);
			
			
			
			
			
			if (numero%2==0) {
				
				num +=numero;
				
			} else {
				numn += numero;
				
			}
			
		}
		System.out.println("");
		System.out.println("El numero es " + a);
		System.out.println("Combinacion pares " + num);
		System.out.println("Combinacion impares " + numn);
			}

		
	}


