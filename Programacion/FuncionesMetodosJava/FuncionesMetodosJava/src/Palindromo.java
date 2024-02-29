/**
 * 
 */

/**
 * @author Juan Carlos
 *
 */
public class Palindromo {

	/**
	 * @param args
	 * Indicar si una palabra dada es un Palíndromo usando funciones.
	 * (se lee igual de derecha a izquierda y viceversa)
	 */
	 public static void main(String[] args) {
	        String palabra = "reconocer";
	        if (esPalindromo(palabra)) {
	            System.out.println(palabra + " es un palíndromo.");
	        } else {
	            System.out.println(palabra + " no es un palíndromo.");
	        }
	    }

	    static boolean esPalindromo(String cadena) {
	        String cadenaInvertida = invertirCadena(cadena);
	        return cadena.equalsIgnoreCase(cadenaInvertida);
	    }

	    static String invertirCadena(String cadena) {
	        char[] caracteres = cadena.toCharArray();
	        StringBuilder invertida = new StringBuilder();
	        for (int i = caracteres.length - 1; i >= 0; i--) {
	            invertida.append(caracteres[i]);
	        }
	        return invertida.toString();
	    }

}
