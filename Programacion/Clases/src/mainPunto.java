/**
 * 
 */

/**
 * @author Juan Carlos
 *
 * Clase Principal para probar clase PUNTO
 */
public class mainPunto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Probamos métodos de la clase PUNTO
		
		// 1. Crear variables/atributos de tipo PUNTO para su uso.
		punto PrimerPunto;
		punto SegundoPunto;
		
		// 2. Creamos el objeto utilizando algún constructor de la clase
		PrimerPunto = new punto();
		SegundoPunto = new punto(123,234);
		
		// 3. Trabajamos con los métodos de la clase Punto
		PrimerPunto.fijarX(123456789);
		PrimerPunto.fijarY(987654321);
		
		System.out.println("Coordenadas del PRIMER PUNTO ");
		System.out.println("X, Y: " + PrimerPunto.LeerX() + " , " + PrimerPunto.LeerY());
		
		System.out.println("Coordenadas del SEGUNDO PUNTO ");
		System.out.println("X, Y: " + SegundoPunto.LeerX() + " , " + SegundoPunto.LeerY());

	}

}
