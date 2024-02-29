import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce las pesetas: ");
        double pesetas = scanner.nextInt();
        double euros = pesetas / 166.386;

        System.out.println(pesetas + " Pesetas son " + euros + " Euros.");
	}

}
