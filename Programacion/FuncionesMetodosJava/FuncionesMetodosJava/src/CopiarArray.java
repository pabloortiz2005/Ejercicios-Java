/**
 * 
 */

/**
 * @author Juan Carlos
 *
 */
public class CopiarArray {

	/**
	 * @param args
	 * Realizar copia de un array utilizando funciones.
	 */
	public static void main(String[] args) {
        int[] arrayOriginal = {3, 6, 9, 12, 15};
        int[] arrayCopia = copiarArray(arrayOriginal);

        System.out.print("Array Original: ");
        imprimirArray(arrayOriginal);

        System.out.print("Array Copia: ");
        imprimirArray(arrayCopia);
    }

    static int[] copiarArray(int[] array) {
        int[] copia = new int[array.length];
        System.arraycopy(array, 0, copia, 0, array.length);
        return copia;
    }

    static void imprimirArray(int[] array) {
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

}
