package practica;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] matriz_aleatorio=new int[20];
		int[] cuadrado=new int[20];
		int[] cubo=new int[20];

		for (int i=0; i<matriz_aleatorio.length;i++) {

			matriz_aleatorio[i]=(int)Math.round(Math.random()*100);
			cuadrado[i]=(int) Math.pow(matriz_aleatorio[i], 2);
			cubo[i]=(int) Math.pow(matriz_aleatorio[i], 3);
		}
		
		

		for(int i=0; i<matriz_aleatorio.length; i ++) {
			System.out.println(matriz_aleatorio[i] + "       " + cuadrado[i] + "       " + cubo[i]);
		}
	}

}
