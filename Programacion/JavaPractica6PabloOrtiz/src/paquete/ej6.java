package paquete;

public class ej6 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[] matriz_aleatorio=new int[20];
		int[] cuadrado=new int[20];
		int[] cubo=new int[20];

		for (int i=0; i<matriz_aleatorio.length;i++) {

			matriz_aleatorio[i]=numerorandom();
			cuadrado[i]=cuadrado(matriz_aleatorio,i);
			cubo[i]=cubo(matriz_aleatorio,i);
		}



		for(int i=0; i<matriz_aleatorio.length; i ++) {
			System.out.println(matriz_aleatorio[i] + "       " + cuadrado[i] + "       " + cubo[i]);
		}
	}

	
	
	
	
	public static int numerorandom(){
		int num=0;
		num=(int)Math.round(Math.random()*100);
		return num;
		
	}
	
	public static int cuadrado(int[]matriz_aleatorio,int i){
		int cua=0;
		cua=(int)Math.pow(matriz_aleatorio[i], 2);
		return cua;
		
	}
	
	public static int cubo(int[]matriz_aleatorio,int i){
		int cub=0;
		cub=(int)Math.pow(matriz_aleatorio[i], 3);
		return cub;
		
	}
	

}


