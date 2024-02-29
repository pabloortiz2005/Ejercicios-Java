/**
 * 
 */

/**
 * @author Juan Carlos
 *
 */
public class MaximoArray {

	/**
	 * @param args
	 * Indicar el elemento máximo de un array dado, utilizando para ello una función.
	 */
	 public static void main(String[] args) {
	        int[] array = {15, 8, 22, 13, 17};
	        int maximo = encontrarMaximoArray(array);
	        System.out.println("El valor máximo en el array es: " + maximo);
	    }

	    static int encontrarMaximoArray(int[] array) {
	        int maximo = array[0];
	        for (int elemento : array) {
	            if (elemento > maximo) {
	                maximo = elemento;
	            }
	        }
	        return maximo;
	    }

}
