package ArrayList;

import java.util.*;
import java.util.Collections;
import java.util.Scanner;

public class Ej3Ordenar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		Scanner scan2= new Scanner(System.in);
		ArrayList<Integer> Num = new ArrayList<Integer>();
		ArrayList<String> Palabras = new ArrayList<String>();
		
		System.out.println("Introduce 10 numeros");
		for(int i=0;i<10;i++) {
			System.out.println("Introduce el numero " + (i+1));
			int n= scan.nextInt();
		Num.add(n);
		
		}
		Collections.sort(Num);
		for (int b:Num) {
			System.out.print(b+", ");
		}
		
		System.out.println("");
		
		System.out.println("Introduce 10 Palabras");
		for(int i=0;i<10;i++) {
			System.out.println("Introduce la palabra numero " + (i+1));
			String p= scan2.nextLine();
		Palabras.add(p);
		
		}
		Collections.sort(Palabras);
		for (String a:Palabras) {
			System.out.print(a+", ");
		}
	}
}
