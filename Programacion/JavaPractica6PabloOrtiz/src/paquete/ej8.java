package paquete;

import java.util.Scanner;

public class ej8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		grafico();
		
	
}
	
	public static void grafico() {
		int [] matriz=new int[12];
		Scanner leer = new Scanner (System.in);
		String meses[]= {
				"Enero     ",
				"Febrero   ",
				"Marzo     ",
				"Abril     ",
				"Mayo      ",
				"Junio     ",
				"Julio     ",
				"Agosto    ",
				"Septiembre",
				"Octubre   ",
				"Noviembre ",
				"Diciembre "};
		// inserto la media de los meses
		
				for (int i=0;i<12;i++) {
					System.out.println("Introduce la media del mes: " + (i+1));
					
					matriz[i]=leer.nextInt();
				}
				
			
				System.out.println("Grafico");
				
				for (int i=0 ; i <12; i++) {
					System.out.print(meses[i] + " : ");
					for (int j=0 ;j < matriz[i]; j = j +2) {
						System.out.print("-");
						
					}
					System.out.println("");
					
				}
				System.out.println("");
				System.out.println("Grados :   ----10---20---30---40---50---60");
	}
	
	
}
