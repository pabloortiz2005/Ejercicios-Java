package arrays;

public class Ejemplo_array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Tabla de intereses con saldo inicial 10000 con 6 tipos de incrementos en 5 años
		 10%,11%,12%,13%,14%,15%
		 */
		
		
		
		
		double interes=0.10;
		double acumulado;
		
		double [][] saldo=new double [6][5];
		
		
		for(int i=0; i<6; i++) {
		saldo[i][0]=10000;
		acumulado=10000;
		
		for(int j=1;j<5;j++) {
			
			acumulado=acumulado+(acumulado*interes);
			
			saldo[i][j]=acumulado;
					
			
		}
		
		interes=interes+0.01;
		
		}
		
		for(int z=0;z<6;z++) {
			
			System.out.println();
			for(int h=0;h<5;h++) {
				System.out.printf("%1.2f", saldo[z][h]);
				System.out.print(" ");
			}
		}
		
		
	}

}
