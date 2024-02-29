/**
 * 
 */

/**
 * @author Juan Carlos
 *
 */
public class NPar {

	/**
	 * @param args
	 * Indicar si un número es par, utilizando función.
	 */
    public static void main(String[] args) {
        int numero = 10;
//        boolean mipar = esPar(numero);
//       if (mipar) {
        if (esPar(numero)) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " no es un número par.");
        }
    }

    static boolean esPar(int PEPE) {
        return  PEPE % 2 == 0;
    }

}
