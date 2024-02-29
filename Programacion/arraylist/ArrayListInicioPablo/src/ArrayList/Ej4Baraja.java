package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ej4Baraja {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<carta> baraja = new ArrayList<carta>();
		
		String [] palos = {"Bastos", "Copas", "Espadas", "Oros"};
		String [] nume = {"As", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
		
		while (baraja.size() < 10) {
			String p = palos [(int) (Math.random() * palos.length)];
			String n = nume [(int) (Math.random() * nume.length)];
			
			carta nCarta = new carta(p,n);
			
			if(!baraja.contains(nCarta)) {
				baraja.add(nCarta);
			}
			
		}
		
		Collections.sort(baraja);
		System.out.println(baraja);
		
		
		
		
	}
}
