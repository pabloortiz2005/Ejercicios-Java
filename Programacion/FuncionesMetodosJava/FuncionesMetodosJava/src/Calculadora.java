import java.util.Scanner;

/**
 * 
 */

/**
 * @author Juan Carlos
 *
 */
public class Calculadora {

	/**
	 * @param args
	 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Simple");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");

        int opcion;
        do {
            System.out.print("Seleccione una opción (1-5): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    suma();
                    break;
                case 2:
                    resta();
                    break;
                case 3:
                    multiplicacion();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    System.out.println("Saliendo de la calculadora. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    static void suma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 + num2;
        System.out.println("Resultado: " + resultado);
    }

    static void suma2() {
    	double n1 = 0;
    	double n2 = 0;
    	pedirDatos(n1,n2);
    	double resultado = n1 + n2;
        System.out.println("Resultado: " + resultado);
    	
    }
    
    static void pedirDatos(double num1, double num2) {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();
    }
    
    
    static void resta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 - num2;
        System.out.println("Resultado: " + resultado);
    }

    static void multiplicacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 * num2;
        System.out.println("Resultado: " + resultado);
    }

    static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numerador: ");
        double numerador = scanner.nextDouble();
        System.out.print("Ingrese el denominador: ");
        double denominador = scanner.nextDouble();

        if (denominador != 0) {
            double resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }

}
