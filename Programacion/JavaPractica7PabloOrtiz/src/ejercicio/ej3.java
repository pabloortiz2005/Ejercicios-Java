package ejercicio;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bucleCapi();
		
		
		
		
		
		
	}
	public static boolean capicua(int n) {
		boolean capicua=false;
		String num=n+"";
		String numreves=voltea(n);
		boolean cap=false;
		if (num.equalsIgnoreCase(numreves)) {
			
			cap=true;
		}
		return cap;




	}






public static void bucleCapi() {
	int n=0;
	for (int i=1;i<100000;i++) {
		if (capicua(n)==true) {
			System.out.print(n+", ");
		}


	n++;
	}
}

//DAR LA VUELTA AL NUMERO
	public static String voltea(int n) {
		Scanner leer = new Scanner (System.in);
		char b;
		String a="";
		
		String c = "" + n;
		for ( int i = 0; i <c.length();i++) {

			b= c.charAt(c.length()-i-1);
			a+=""+b;

		}
		
		String num = a + "";
		return num;
	}

}