/**
 * 
 */

/**
 * @author Juan Carlos
 *
 */
public class BuscarEnArray {

	/**
	 * @param args
	 * Buscar un elemento dado dentro de un array, a través de funciones.
	 */
	public static void main(String[] args) {
        int[] array = {4, 7, 1, 9, 3};
        int elementoBuscado = 9;
        if (buscarElemento(array, elementoBuscado)) {
            System.out.println("El elemento " + elementoBuscado + " está presente en el array.");
        } else {
            System.out.println("El elemento " + elementoBuscado + " no está presente en el array.");
        }
    }

    static boolean buscarElemento(int[] array, int elemento) {
        for (int valor : array) {
            if (valor == elemento) {
                return true;
            }
        }
        return false;
    }
}
