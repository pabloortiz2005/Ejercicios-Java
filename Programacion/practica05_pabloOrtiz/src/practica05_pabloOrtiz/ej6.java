package practica05_pabloOrtiz;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);


		// DECLARAMOS LAS VARIABLES
		boolean ganador=false;
		char n [][]= new char[3][3];
		char signo='X';
		char signo1='O';
		int pos=0;
		int turno=0;
		int cont=1;


		//RELLENAMOS EL ARRAY PARA LA PRIMERA IMPRESIÓN

		n [0][0]='1';
		n [0][1]='2';
		n [0][2]='3';
		n [1][0]='4';
		n [1][1]='5';
		n [1][2]='6';
		n [2][0]='7';
		n [2][1]='8';
		n [2][2]='9';


		System.out.println("---------------3 EN RAYA---------------");

		//Se muestra el primer array
		for (int i=0; i<n.length;i++) {

			for (int j=0; j<n[i].length ; j++) {
				System.out.print("|"+n[i][j]+"|");

			}
			System.out.println("");
		}

		//BUCLE PARA REPETIR LA INSERCION DE DATOS HASTA QUE GANE UN JUGADOR O SEA EMPATE
		while (ganador==false) {

			//CONTADOR PARA EL EMPATE
			if (cont==10) {
				System.out.println("Empate");
				ganador=true;
				break;
			}


			//CAMBIO DE TURNOS
			if (turno==0) {
				signo='X';
				turno++;

			}else {
				signo='O';
				turno--;
			}

			//SWITCH PARA LEER LA POSICION DE INSERCION.
			System.out.println("En que posicion quieres colocar tu ficha jugador " + signo);
			pos=leer.nextInt();

			switch (pos) {

			case 1:
				n [0][0]=signo;
				break;
			case 2:
				n [0][1]=signo;
				break;

			case 3 :
				n [0][2]=signo;
				break;

			case 4 :
				n [1][0]=signo;
				break;

			case 5 :
				n [1][1]=signo;
				break;

			case 6 :
				n [1][2]=signo;
				break;

			case 7 :
				n [2][0]=signo;
				break;

			case 8 :
				n [2][1]=signo;
				break;

			case 9 :
				n [2][2]=signo;
				break;

			}
			//MOSTRAR EL JUEGO EN TIEMPO REAL
			for (int i=0; i<n.length;i++) {

				for (int j=0; j<n[i].length ; j++) {
					System.out.print("|"+n[i][j]+"|");

				}
				System.out.println("");
			}
			//COMPARACIONES PARA EL GANADOR
			// COMPARAMOS QUE EL TURNO SEA IGUAL QUE LAS POSICIONES NECESARIAS PARA GANAR
			if ( turno==1 && ((n[0][0] == signo && n[0][1]== signo && n[0][2] == signo) || (n[0][0] == signo && n[1][0]== signo && n[2][0] == signo)
					|| (n[0][0] == signo && n[1][1]== signo && n[2][2] == signo) || (n[0][2] == signo && n[1][1]== signo && n[2][0] == signo)
					|| (n[0][1] == signo && n[1][1]== signo && n[2][1] == signo) || (n[0][2] == signo && n[1][2]== signo && n[2][2] == signo)
					|| (n[1][0] == signo && n[1][1]== signo && n[1][2] == signo) || (n[2][0] == signo && n[2][1]== signo && n[2][2] == signo))) {
				System.out.println("GANA EL JUGADOR X");
				ganador=true;
				break;

			}else if (turno==0 && ((n[0][0] == signo1 && n[0][1]== signo1 && n[0][2] == signo1) || (n[0][0] == signo1 && n[1][0]== signo1 && n[2][0] == signo1)
					|| (n[0][0] == signo1 && n[1][1]== signo1 && n[2][2] == signo1) || (n[0][2] == signo1 && n[1][1]== signo1 && n[2][0] == signo1)
					|| (n[0][1] == signo1 && n[1][1]== signo1 && n[2][1] == signo1) || (n[0][2] == signo1 && n[1][2]== signo1 && n[2][2] == signo1)
					|| (n[1][0] == signo1 && n[1][1]== signo1 && n[1][2] == signo1) || (n[2][0] == signo1 && n[2][1]== signo1 && n[2][2] == signo1))){
				System.out.println("GANA EL JUGADOR O");
				ganador=true;
				break;
			}
			//AUMENTAMOS EL CONTADOR PARA EL EMPATE
			cont++;
		}
	}
}
