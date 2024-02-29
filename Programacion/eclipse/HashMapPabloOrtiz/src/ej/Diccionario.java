package ej;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
		
		HashMap<String,String> dic =  new HashMap<String,String>();
		
		dic.put("hola", "hello");
		dic.put("luna", "moon");
		dic.put("arroz", "rice");
		dic.put("mesa", "table");
		dic.put("silla", "chair");
		dic.put("sol", "sun");
		dic.put("montaña", "mountain");
		dic.put("pelota", "ball");
		dic.put("gorra", "cup");
		dic.put("ordenador", "computer");
		dic.put("botella", "bottle");
		dic.put("cuchillo", "knife");
		dic.put("tia", "aunt");
		dic.put("padre", "dad");
		dic.put("madre", "mother");
		dic.put("hijo", "son");
		dic.put("españa", "spain");
		dic.put("estrella", "star");
		dic.put("mochila", "backpack");
		dic.put("movil", "phone");
		
		
		boolean usu=false;
		int c=0;
		String traduccion="";
		
		
		String [] diccio = dic.keySet().toArray(new String[5]);
		
	
		Random random= new Random();
		
		int v=0;
		int f=0;
		
		
		for(int i=0;i<5;i++) {
			
			String alea=diccio[random.nextInt(diccio.length)];
			System.out.println("Traduce " + alea);
			traduccion=scan.nextLine();
			
			if(traduccion.equalsIgnoreCase(dic.get(alea))) {
				System.out.println("Correcto");
				v++;
			}else {
				f++;
			}
	}
		System.out.println("Acertaste " + v + " palabras  y fallaste " + f );
	
}
	}


