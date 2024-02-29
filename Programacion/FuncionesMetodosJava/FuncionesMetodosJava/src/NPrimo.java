/**
 * 
 */

/**
 * @author Juan Carlos
 *
 */
public class NPrimo {

	/**
	 * @param args
	 * Indicar si el número indicado es Primo, utilizando una función.
	 */
    public static void main(String[] args) {
        int numero = 13;
        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}
