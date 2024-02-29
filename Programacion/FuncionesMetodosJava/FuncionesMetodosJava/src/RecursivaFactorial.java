/**
 * 
 */

/**
 * @author Juan Carlos
 *
 */
public class RecursivaFactorial {

	/**
	 * @param args
	 * Cálculo del FACTORIAL de un número utilizando una FUNCIÓN RECURSIVA
	 */
	 public static void main(String[] args) {
	        int numero = 5;
	        int factorial = calcularFactorial(numero);
	        System.out.println("El factorial de " + numero + " es: " + factorial);
	 }

	 public static int calcularFactorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        }
	        return n * calcularFactorial(n - 1);
	 }
}
