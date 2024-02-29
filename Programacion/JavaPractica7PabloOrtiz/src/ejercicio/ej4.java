package ejercicio;
import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        String input = scanner.nextLine();

        System.out.println("Seleccione la base de origen:");
        System.out.println("1. Decimal");
        System.out.println("2. Hexadecimal");
        System.out.println("3. Binario");
        System.out.println("4. Octal");

        int baseOrigen = scanner.nextInt();
        long decimal = 0;

        try {
            switch (baseOrigen) {
                case 1:
                    decimal = Long.parseLong(input, 10);
                    break;
                case 2:
                    decimal = Long.parseLong(input, 16);
                    break;
                case 3:
                    decimal = Long.parseLong(input, 2);
                    break;
                case 4:
                    decimal = Long.parseLong(input, 8);
                    break;
                default:
                    System.out.println("Selección no válida.");
                    return;
            }

            System.out.println("Seleccione la base de destino:");
            System.out.println("1. Decimal");
            System.out.println("2. Hexadecimal");
            System.out.println("3. Binario");
            System.out.println("4. Octal");

            int baseDestino = scanner.nextInt();

            switch (baseDestino) {
                case 1:
                    System.out.println("Decimal: " + decimal);
                    break;
                case 2:
                    System.out.println("Hexadecimal: " + Long.toHexString(decimal));
                    break;
                case 3:
                    System.out.println("Binario: " + Long.toBinaryString(decimal));
                    break;
                case 4:
                    System.out.println("Octal: " + Long.toOctalString(decimal));
                    break;
                default:
                    System.out.println("Selección no válida.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida. Por favor, ingrese un número válido.");
        }
    }
}

