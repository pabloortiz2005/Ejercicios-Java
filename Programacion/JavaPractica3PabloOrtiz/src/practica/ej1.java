package practica;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix [] = new int [3];
		int puntos=0;
		
		System.out.println("Se tiran 3 dados");
		
		for (int i=0; i<3; i++) {
			matrix[i]=(int)Math.round(Math.random()*6);
			
			
			
			int n = i+1;
			
			System.out.println("Dado: " + n + "= " + matrix[i]);
		}
		
		
		puntos = matrix[0] + matrix[1] + matrix[2];
		
		System.out.println("Los puntos totales son: " + puntos);
		
	}

}
