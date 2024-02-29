package practica;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ej4 {

	
	/*
	Realizar un programa que pida la temperatura media que ha hecho cada mes de un 
	determinado año y que muestre a continuación un diagrama de barras horizontales con 
	esos datos.
	 */
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaro el array y la temperatura maxima
		
		Scanner leer = new Scanner (System.in);
		int [] matriz=new int[12];
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
		System.out.println("Grados :   ------10---20---30---40---50---60");
		
		
	
}
}
