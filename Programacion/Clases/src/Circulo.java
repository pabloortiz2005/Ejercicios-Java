/**
 * 
 */

/**
 * @author Juan Carlos
 * Clase CIRCULO
 * Contiene los atributos y métodos para trabajar con objetos de tipo círculo. 
 */
public class Circulo {
	// Atributos
    private double ejeX;
    private double ejeY;
    private double radio;

    // Constructor
    public Circulo(double ejeX, double ejeY, double radio) {
        this.ejeX = ejeX;
        this.ejeY = ejeY;
        this.radio = radio;
    }

    // Métodos para acceder a los atributos (getters)
    public double getEjeX() {
        return ejeX;
    }

    public double getEjeY() {
        return ejeY;
    }

    public double getRadio() {
        return radio;
    }

    // Métodos para establecer los atributos (setters)
    public void setEjeX(double ejeX) {
        this.ejeX = ejeX;
    }

    public void setEjeY(double ejeY) {
        this.ejeY = ejeY;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área del círculo
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular la circunferencia del círculo
    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }

    // Método para imprimir información sobre el círculo
    public void imprimirInformacion() {
        System.out.println("Círculo en (" + ejeX + ", " + ejeY + ") con radio " + radio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Circunferencia: " + calcularCircunferencia());
    }

}
