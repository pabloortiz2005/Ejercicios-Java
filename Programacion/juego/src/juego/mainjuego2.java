package juego;

public class mainjuego2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		juego2 game1= new juego2 (5);
		juego2 game2= new juego2 (5);
	
		game1.RestarVida();
		game1.muestraVidasRestantes();
		
		System.out.println();
		
		game1.Reinicio();
		game1.muestraVidasRestantes();
		
		System.out.println();
		
		game1.ActualizarRecord();
		game2.ActualizarRecord();
}
	
	
}
