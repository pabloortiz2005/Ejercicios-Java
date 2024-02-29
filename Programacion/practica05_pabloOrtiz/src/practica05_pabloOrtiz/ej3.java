package practica05_pabloOrtiz;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// DECLARAMOS LAS VARIABLES
		
		int t [] []= new int [6][10];

		int max=0;
		int min=1001;
		for (int i=0; i<6;i++) {

			
			// BUCLE PARA GUARDAR EL MAXIMO Y EL MINIMO
			for (int j=0; j<10 ; j++) {
				t[i][j]= (int) (Math.random()*1001);
				if (t[i][j]>max) {
					max=t[i][j];
				}
				if (t[i][j]<min) {
					min=t[i][j];
				}
				
				
				}
		}
		
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
