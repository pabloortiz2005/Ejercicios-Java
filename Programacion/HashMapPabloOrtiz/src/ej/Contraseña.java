package ej;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contraseña {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
		HashMap<String,String> contra =  new HashMap<String,String>();
		
		contra.put("hola", "adios");
		contra.put("1", "uno");
		contra.put("2", "dos");
		contra.put("3", "tres");
		
		String usuario="";
		boolean usu=false;
		int c=0;
		String con="";
		
		
		
		
		//Validacion del nombre de usuario
		while(usu!=true) {
		System.out.println("Introduzca el nombre de usuario");
		usuario=scan.nextLine();
		
		if(contra.containsKey(usuario) != false) {
			usu=true;
			break;
		}
		
		System.out.println("Usuario erroneo");
		
		}
		
		
		
		//Validacion de la contraseña del usuario
		do {
			if (c<3) {
				System.out.println("Introduce la contraseña");
				con=scan.nextLine();
				if(contra.get(usuario).equals(con)) {
					System.out.println("Contraseña Aceptada");
					break;
				} else {
					System.out.println("Error");
					c++;
				}
			}
			
			
			
		}while(c<3);
			
			
		
		
		
	}
	
}
