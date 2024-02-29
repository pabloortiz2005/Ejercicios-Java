package paquete;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARAMOS LAS VARIABLES
		int t [] []= new int [9][9];
		int a1=random();
		int a2=random();
	
		alfil(t, a1, a2);
		
		
		System.out.println("\n");
		

		
	}
		
		
		public static void alfil(int [][] t, int a1, int a2) {
			int n []= {8,7,6,5,4,3,2,1};
			String b []= {"A","B","C","D","E","F","G","H"};
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
	
	
	//Generamos el numero random para la posicion del alfil
	public static int random() {	
		int random=0;
		random=(int) (Math.random()*7+1);
		return random;
	}
	
	
	
	
	
	


}
