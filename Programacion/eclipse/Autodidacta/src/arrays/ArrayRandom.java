package arrays;

public class ArrayRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] matriz_aleatorio=new int[100];

		for (int i=0; i<matriz_aleatorio.length;i++) {

			matriz_aleatorio[i]=(int)Math.round(Math.random()*100);
		}

		for(int numeros:matriz_aleatorio) {
			System.out.print(numeros + " ");
		}
	}

}
