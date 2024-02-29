package paquete;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// DECLARAMOS LAS VARIABLES

		int t [] []= new int [6][10];
		numeroRandom(t);
		int max=maximo(t);
		int min=minimo(t);
		imprimirTabla(t,max,min);
		mostrarMaximoMinimo(t,max,min);


	}

	
	// BUCLE PARA Generar un numero random
	public static void numeroRandom(int [][] t) {
		
		for (int i=0; i<6;i++) {
			for (int j=0; j<10 ; j++) {
				t[i][j]= (int) (Math.random()*1001);
			}
		}
		
	}
	
	
	//Guardo el numero mayor
	public static int maximo(int [][] t) {
		int maximo=0;
		for (int i=0; i<6;i++) {
			for (int j=0; j<10 ; j++) {
				if (t[i][j]>maximo) {
					maximo=t[i][j];
				}

			}
		}
		return maximo;
	}
	
	//Guardo el numero menor
	public static int minimo(int [][] t) {
		int minimo=1001;
		for (int i=0; i<6;i++) {
			for (int j=0; j<10 ; j++) {
				if (t[i][j]<minimo) {
					minimo=t[i][j];
				}

			}
		}
		return minimo;
	}



	public static void imprimirTabla(int [][] t, int max, int min) {
		//RECORREMOS EL ARRAY PARA RESALTAR EL MAXIMO Y EL MINIMO EN LA MATRIZ Y MOSTRARLA

		for (int i=0; i<6;i++) {
			for (int j=0; j<10 ; j++) {

				//Mostrar la tabla
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

	}
	
	
	

	public static void mostrarMaximoMinimo(int [][] t, int max, int min) {
		// RECORREMOS EL ARRAY PARA MOSTRAR EN QUE POSICION ESTA EL MAXIMO Y EL MINIMO

		for (int i=0; i<6;i++) {
			for (int j=0; j<10 ; j++) {
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
