package practica;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner leer = new Scanner (System.in);
			int[] matriz_aleatorio=new int[100];
			int a=0;
			int b=0;
			
			System.out.println("Introduce el numero a cambiar");
			a = leer.nextInt();
			
			System.out.println("Introduce el numero por el que se cambiara");
			b = leer.nextInt();

			for (int i=0; i<matriz_aleatorio.length;i++) {

				matriz_aleatorio[i]=(int)Math.round(Math.random()*20);
				
			}
			for(int i=0; i<matriz_aleatorio.length; i ++) {
				
				System.out.print(matriz_aleatorio[i] + " ");
			}
			System.out.println(" ");
			System.out.println("Cambios:");
			for(int i=0; i<matriz_aleatorio.length; i ++) {
				
				
				if (matriz_aleatorio[i]==a) {
					matriz_aleatorio[i]=b;
				System.out.print( "\"" + matriz_aleatorio[i] + "\" ");
			} else {
				
				System.out.print(matriz_aleatorio[i] + " ");
			}
	}

}
}
