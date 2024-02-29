/**
 * 
 */

/**
 * @author Juan Carlos
 *
 */
public class Triangulo {

	/**
	 * @param args
	 * Imprimir triángulo realizando llamada a función.
	 */
	public static void main(String[] args) {
        imprimirTriangulo(20);
    }

    static void imprimirTriangulo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
