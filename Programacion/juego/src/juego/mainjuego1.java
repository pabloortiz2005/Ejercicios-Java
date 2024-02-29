package juego;

public class mainjuego1 {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//Instancia 1
			juego vidas ;
			vidas= new juego (5);
			
			vidas.muestraVidasRestantes();
			vidas.RestarVida();
			vidas.muestraVidasRestantes();
			
			
			//Instancia 2
			juego vidas2 ;
			vidas2= new juego (5);
			vidas2.muestraVidasRestantes();
		
	}

}
