import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce los euros: ");
        double euros = scanner.nextInt();
        double pesetas = euros * 166.386;

        System.out.println(euros + " Euros son " + pesetas + " Pesetas.");
    }

	}

