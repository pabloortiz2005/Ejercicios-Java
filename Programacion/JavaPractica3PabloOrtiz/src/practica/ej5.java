package practica;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado=0;
		int c=3;
		
		for (int i=1;i<=15;i++) {
			System.out.printf("%2d. |", i);
			
			for(int j=1;j<=c; j++) {
				resultado = (int)(Math.random()*3)+1;
				switch(resultado) {
				
				case 1:
					System.out.print("1   |");
				break;
				
				case 2:
					System.out.print("   2|");
					break;
				case 3:
					System.out.print(" X  |");
					default:
				}
			}
			System.out.println();
		}
		
	}

}
