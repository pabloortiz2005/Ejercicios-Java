import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner leer = new Scanner (System.in);


int n=0;
int numero=0;
int num=0;
System.out.println("introduzca el numero: ");

n =leer.nextInt();
char b;
String f;
String a="";

String c = "" + n;
System.out.print("Pares: ");
for ( int i = 0; i <c.length();i++) {
	
	b= c.charAt(i);
	a+=b;
	
	numero = Character.getNumericValue(b);
	
	if (numero%2==0) {
		System.out.print(numero + " ");
		num += numero;
		
	}
	
}
System.out.println("");
System.out.println("El numero es " + a);
System.out.println("La suma de los pares es " + num);
	}

}
