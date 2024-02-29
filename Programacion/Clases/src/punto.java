/**
 * 
 */

/**
 * @author Juan Carlos
 *
 * Clase PUNTO. 
 * Contiene las coordenadas X e Y de un punto en un plano. 
 */
public class punto {
	/* Definimos los Atributos de la clase punto ... */
	private int x; 		//Coordenada X
	private int y;		//Coordenada Y
	
	/* Constructor de la clase Punto */
	public punto(int posX, int posY) {
		x = posX;
		y = posY;
	}
	
	public punto() {  // Constructor sin argumentos.
		x=0;
		y=0;
	}
	
	/* Métodos de la clase Punto */
	public int LeerX() {	// Devuelve el valor de X
		return x;
	}
	
	public int LeerY() {	// Devuelve el valor de Y
		return y;
	}
	
	public void fijarX(int valorX) {	// Establece el valor de X
		this.x = valorX;
	}
	
	public void fijarY(int valorY) {	// Establece el valor de Y
		this.y = valorY;
	}
}
