package practica05_pabloOrtiz;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DECLARAMOS LAS VARIABLES
		int filas=6;
		int columnas=10;

		int t [] []= new int [filas][columnas];


		int max=0;
		int min=1001;
		int rango=1000;

		//BUCLE PARA QUE NO SE REPITAN NUMEROS
		for (int i=0; i<t.length;i++) {

			for (int j=0; j<t[i].length ; j++) {

				int f=0;

				while (f<filas) {
					int c =0;

					while (c <columnas) {

						int nuevoValor=  (int) (Math.random()*rango);

						boolean repetido=false;
						int k=0;

						while(k < i && !repetido) {
							int l=0;
							int limiteSuperior= 0;
							if(k == i-1) {
								limiteSuperior=j;
							} else {
								limiteSuperior = t[k].length;
							}
							while (l<limiteSuperior && !repetido) {
								if (t[k][l]==nuevoValor) {
									repetido=true;
								}
								l++;
							}
							k++;
						}
						if (!repetido) {
							t[f][c]= nuevoValor;
							c++;
						}
					}
					f++;
				}



			} 
		}
		// BUCLE PARA GUARDAR EL MAXIMO Y EL MINIMO
		for (int i=0; i<t.length;i++) {

			for (int j=0; j<t[i].length ; j++) {

				if (t[i][j]>max) {
					max=t[i][j];
				}
				if (t[i][j]<min) {
					min=t[i][j];
				}

			}
		}





		//RECORREMOS EL ARRAY PARA RESALTAR EL MAXIMO Y EL MINIMO EN LA MATRIZ Y MOSTRARLA

		for (int i=0; i<t.length;i++) {



			for (int j=0; j<t[i].length ; j++) {


				if(t[i][j]==max) {
					System.out.print("\""+t[i][j] + "\"\t");
				} else if (t[i][j]==min) {
					System.out.print("\""+t[i][j] + "\"\t");
				} else {
					System.out.print(t[i][j] + "\t");
				}


			}

			System.out.println(" ");
		}

		// RECORREMOS EL ARRAY PARA MOSTRAR EN QUE POSICION ESTA EL MAXIMO Y EL MINIMO
		for (int i=0; i<t.length;i++) {



			for (int j=0; j<t[i].length ; j++) {
				if(t[i][j]==max) {
					System.out.println("El numero maximo esta en la posicion " + (1+i) + "-" + (1+j) + ": " + max);
				} 
				if (t[i][j]==min) {
					System.out.println("El numero min esta en la posicion " + (1+i) + "-" + (1+j) + ": " + min);
				}
			}

		}

	}

}