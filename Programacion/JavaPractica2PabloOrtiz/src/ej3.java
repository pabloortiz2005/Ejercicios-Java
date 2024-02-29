import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		
		
		int n=0;
		
		System.out.println("introduzca el numero: ");
		
		n =leer.nextInt();
		char b;
		String a="";
		
		String c = "" + n;
		for ( int i = 0; i <c.length();i++) {
			
			b= c.charAt(c.length()-i-1);
			a+=""+b;
			
		}
		System.out.println(a);
	}

}
