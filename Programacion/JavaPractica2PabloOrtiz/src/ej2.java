
import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce la altura de la pirámide: ");
	        int n = scanner.nextInt();
	        

	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n -i; j++) {
	                System.out.print("   ");
	            }
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                if (j == 1 || j == 2 * i - 1 || i == n && j%2!=0) {
	                	if (i >9){
	                		
	                		System.out.print(i);
	                	} else{
	                		  System.out.print("" + i + " ");
	                	}
	                	System.out.print(" ");
	                } else {
	                	 System.out.print("   ");
	                	
	                }
	            }
	            System.out.println(" ");
	        }
	}
}
