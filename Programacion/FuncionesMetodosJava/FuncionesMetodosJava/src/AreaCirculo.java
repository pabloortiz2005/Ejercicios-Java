/**
 * 
 */

/**
 * @author Juan Carlos
 *
 */
public class AreaCirculo {

	/**
	 * @param args
	 * Cálculo del Área de un círculo utilizando función.
	 */
    public static void main(String[] args) {
        double radio = 3.5;
        double area = calcularAreaCirculo(radio);
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
    }

    static double calcularAreaCirculo(double pepe) {
        return Math.PI * Math.pow(pepe, 2);
    }
}
