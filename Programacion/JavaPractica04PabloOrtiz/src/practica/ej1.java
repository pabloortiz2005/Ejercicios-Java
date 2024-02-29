package practica;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		int [] matriz=new int[10];
		
		for (int i=0;i<matriz.length;i++) {
			System.out.println("Introduce el número ");
			
			matriz[i]=leer.nextInt();
		}
		
		for (int i = 0; i < matriz.length/2; i++) {
            int j = matriz.length-i-1;
            int a = matriz[i];
            int b = matriz[j];
            matriz[i] = b;
            matriz[j] = a;

}
		for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i] + " ");
}
	}

}