package entornos;

import java.util.Scanner;

public class MainEntornos {


	public static void main(String [] args) {

//1

		Scanner escaner= new Scanner(System.in);


		System.out.println("Filas matriz 1");
		int f1=escaner.nextInt();

		System.out.println("Columnas matriz 1");
		int c1=escaner.nextInt();

		System.out.println("Filas matriz 2");
		int f2=escaner.nextInt();

		System.out.println("Columnas matriz 2");
		int c2=escaner.nextInt();

		Entornos matrix= new Entornos(f1, c2, f2, c2);


		matrix.rm1(escaner);//2
		matrix.rm2(escaner);//11

		if (matrix.comp()) { ///19
			System.out.println("Tienen el mismo tamanyo");//23
			if (matrix.igual()) {//24B
				System.out.println("Son iguales");//36
			} else {
				System.out.println("Son diferentes");//37
			}
		}else {
			System.out.println("Tienen distinto tamanyo");//38

		}
		
		matrix.im1(escaner); //39
		System.out.println();//48
		matrix.im2(escaner);//49
	}




}
