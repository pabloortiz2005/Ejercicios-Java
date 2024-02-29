package practica05_pabloOrtiz;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARAMOS LAS VARIABLES

		int a1=0;
		int a2=0;

		//GENERAMOS LA POSICION DEL ALFIL
		a1= (int) (Math.random()*7+1);
		a2= (int) (Math.random()*7+1);
		//RELLENAMOS LOS ARRAYS GRAFICOS
		int n []= {8,7,6,5,4,3,2,1};
		String b []= {"A","B","C","D","E","F","G","H"};
		int t [] []= new int [9][9];

		System.out.println("\n");

		//BUCLE PARA RECORRER EL ARRAY
		for (int i=0; i<t.length;i++) {

			for (int j=0; j<t[i].length ; j++) {

				if (i!=8 && j==0) { 
					System.out.print(" " + n[i] + "  "); //COLUMNA DE NUMEROS
				} else if(i==8 && j!=0) {
					System.out.print(" " + b[j-1] + "  "); //FILA DE LETRAS
				} else if(i==8 && j== 0) {
					System.out.print("    "); //ESPACIO EN BLANCO
				}else if(i==a1 && j== a2) {
					System.out.print(" X  "); //ALFIL
				}else if(i-j ==a1-a2 || i+j== a1+a2) { 
					System.out.print(" -  "); //MOVIMIENTOS POSIBLES
				} else {
					System.out.print("    "); //ESPACIOS EN BLANCO
				}

			}

			System.out.println("\n");
		}

	}
}
