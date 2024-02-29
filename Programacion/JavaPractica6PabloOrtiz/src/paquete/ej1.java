package paquete;

import java.util.Scanner;

public class ej1 {
	
	
	
	
	//Metodo MAIN

	public static void main(String[] args) {
		int t [] []= new int [5][6];
		rellenarTabla(t);
		cuenta(t);
		
	}
	
	//Hago la cuenta de las columnas y filas finales y imprimo las soluciones
	public static void cuenta(int[][]t) {
		int sumaf=0;
		int sumac=0;
		for (int i=0; i<5;i++) {



			for (int j=0; j<6 ; j++) {

				//contar dentro de la fila
				if (j!=5) {
					sumaf+=t[i][j];

				} else {
					t[i][j]=sumaf;
				}


				//Contar dentro de la columna
				for (int z=0; z<5;z++) {
					if (z!=4) {
						sumac+=t[z][j];

					} else {
						t[z][j]=sumac;
					}
				}
				//reseteamos la suma de las columnas
				sumac=0;


				//Mostrar la tabla
				System.out.print(t[i][j] + "\t");

			}
			//reseteamos la suma de las filas

			sumaf=0;
			System.out.println(" ");
		}
		
		
	}
	//Relleno la tabla por teclado
	public static void rellenarTabla(int[][] t ) {
		
		Scanner leer=new Scanner(System.in);
		
		for (int i=0; i<5;i++) {
			
			for (int j=0; j<6 ; j++) {
				System.out.println("Escribe el numero");
				t[i][j]=leer.nextInt();
			}
		}
		
		
	}

}
