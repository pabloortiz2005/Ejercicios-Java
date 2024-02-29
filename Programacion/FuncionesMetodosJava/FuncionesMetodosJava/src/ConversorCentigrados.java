/**
 * 
 */

/**
 * @author Juan Carlos
 *
 */
public class ConversorCentigrados {

	/**
	 * @param args
	 * Conversor de Grados Celsius a grados Fahrenheit, utilizando una función.
	 */
    public static void main(String[] args) {
        double temperaturaCelsius = 25.5;
        double temperaturaFahrenheit = celsiusAFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " grados Celsius son " + temperaturaFahrenheit + " grados Fahrenheit.");
    }

    static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

}
