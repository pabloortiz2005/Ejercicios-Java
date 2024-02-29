import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;

        for (int i = num; i >= 1; i--) {
            for (int b = num; b > i; b--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }    	    	    	    
    
	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la base de la pirámide: ");
        int n = scanner.nextInt();

        
        for (int i = 1; i <= n * 2 - 1; i++) {
            if (i % 2 != 0) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

        for (int i = n - 1; i >= 1; i--) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}