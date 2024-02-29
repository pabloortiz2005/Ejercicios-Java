import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		
		int n;
        double factorial = 1;
        Scanner leer = new Scanner(System.in);
		
        System.out.println("Introduce el número");
		
		n = leer.nextInt();
            
        
        
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
		
        
        System.out.println(factorial);
	}

}
