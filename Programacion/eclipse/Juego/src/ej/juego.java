package ej;



public class juego {
	public static int vidas;
	
public juego(int vidas) {
	this.vidas=vidas;
}
	
public static void MuestraVidasRestantes(int vidas) {
	System.out.println("Vidas restantes: "+vidas);
}
	
	
	

public static void main(String[] args) {
	// TODO Auto-generated method stub
	 juego mijuego = new juego(5);
	vidas=5;
	MuestraVidasRestantes(vidas);
	vidas--;
	MuestraVidasRestantes(vidas);
	vidas=5;
	MuestraVidasRestantes(vidas);
}
	
	
	
	
	
	
	
}

