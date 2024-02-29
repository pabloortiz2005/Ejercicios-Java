import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la altura de la U: ");
        int h = scanner.nextInt();
        

        for (int i = 0; i < h; i++) {
        	for (int j=0;j < h; j++) {
        		if (i !=h - 1 && (j == 0 || j==h-1)) {
        			System.out.print("* ");
        		} else if (i == h -1 && j !=0 && j != h-1) {
        			System.out.print("* ");
        		} else {
        			System.out.print("  ");
        		}
        		
        	}
        	System.out.println();
        }
	}

}
