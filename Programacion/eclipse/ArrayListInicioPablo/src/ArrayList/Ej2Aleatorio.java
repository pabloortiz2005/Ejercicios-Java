package ArrayList;

import java.util.ArrayList;

public class Ej2Aleatorio {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma = 0;
		int media=0;
		int maximo=0;
		int minimo=101;
		

		ArrayList<Integer> Numeros = new ArrayList<Integer>();
		
		int a= (int) Math.random()*11+10;
		
		for (int i=0;i<a;i++) {
			Numeros.add((int)(Math.random()*100));
		}
		
		for (int b:Numeros) {
			
			
			System.out.print(b + ", ");
			suma= suma+b;
			if(b>maximo) {
				maximo=b;
			}
			if (b<minimo) {
				minimo=b;
			}
		}
		media=suma/a;
		
		System.out.println("Suma= " + suma);
		System.out.println("Media= " + media);
		System.out.println("Maximo= " + maximo);
		System.out.println("Minimo= " + minimo);
	}
}
