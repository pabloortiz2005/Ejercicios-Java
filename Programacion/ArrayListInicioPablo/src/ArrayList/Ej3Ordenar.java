package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ej3Ordenar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner escaner= new Scanner(System.in);
		
		ArrayList<Integer> Num = new ArrayList<Integer>();
		
		
		System.out.println("Introduce 10 numeros");
		for(int i=0;i>10;i++) {
			Num.add(escaner.nextInt());
		Collections.sort(Num);
		}
		
		for (int b:Num) {
			System.out.println(b);
		}
	}
}
