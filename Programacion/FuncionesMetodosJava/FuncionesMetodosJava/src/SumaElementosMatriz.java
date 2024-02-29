/**
 * 
 */

/**
 * @author Juan Carlos
 *
 */
public class SumaElementosMatriz {

	/**
	 * @param args
	 * Suma de los elementos de una matriz a través de una función.
	 */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int suma = calcularSumaArray(array);
        System.out.println("La suma de los elementos del array es: " + suma);
    }

    static int calcularSumaArray(int[] pepep) {
        int suma = 0;
        for (int elemento : pepep ) {
            suma += elemento;
        }
        return suma;
    }

}
