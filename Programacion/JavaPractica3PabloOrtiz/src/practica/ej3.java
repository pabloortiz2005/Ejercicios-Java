package practica;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix [] = new int [50];
		boolean s=false;
		int min=0;
		int max=0;
		
		System.out.println("50 numeros random entre 100 y 199");
		
		for (int i=0; i<20; i++) {
			
			matrix[i]=(int)Math.round(Math.random()*(100-200)+200);
			
				if (i==0) {
					min =matrix[i];
					min =matrix[i];
				}
				if(matrix[i] < min)
				   {
				    min=matrix[i];
				   }
				   if(matrix[i] > max)
				   {
				    max=matrix[i];
				   }
		
			
		System.out.print(matrix[i] + " ");
		
		}
		System.out.println("");
		System.out.println("El mayor es " + max);
		System.out.println("El menor es " + min);
	}
}

