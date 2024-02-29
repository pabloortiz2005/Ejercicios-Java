package practica;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix [] = new int [20];
		
		
		System.out.println("20 numeros random");
		
		for (int i=0; i<20; i++) {
			matrix[i]=(int)Math.round(Math.random()*9);
			
			
			
			
			
			System.out.print(matrix[i] + " ");
		}
	}

}
