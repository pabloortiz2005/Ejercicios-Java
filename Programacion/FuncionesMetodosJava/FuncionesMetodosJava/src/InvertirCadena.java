/**
 * 
 */

/**
 * @author Juan Carlos
 *
 */
public class InvertirCadena {

	/**
	 * @param args
	 * Invertir cadena de caracteres utilizando función.
	 */
	 public static void main(String[] args) {
	        String original = "Hola, mundo!";
	        String invertida = invertirCadena(original);
	        System.out.println("Original: " + original);
	        System.out.println("Invertida: " + invertida);
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
