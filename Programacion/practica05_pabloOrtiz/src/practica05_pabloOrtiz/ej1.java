package practica05_pabloOrtiz;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer=new Scanner(System.in);

		//Declaramos los arrays y las variables necesarias

		int t [] []= new int [5][6];
		int sumaf=0;
		int sumac=0;


		//Pedimos los datos al usuario

		for (int i=0; i<5;i++) {

			for (int j=0; j<6 ; j++) {
				System.out.println("Escribe el numero");
				t[i][j]=leer.nextInt();
			}
		}

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

}
