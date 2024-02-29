package paquete;

import java.util.Scanner;

public class ej9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		notas();
}
	
	public static void notas() {
		int n=0;
		String nota="";
		int sus=0,sufi=0,b=0,notable=0,sobre=0;
		
		Scanner leer = new Scanner (System.in);
		
	
		
		for(int i=0; i<20;i++) {
		n=(int) Math.round(Math.random()*10);
		
		switch(n) {
		
		case 1:
		case 2:
		case 3:
		case 4:
			nota="suspenso";
			sus+=1;
		break;
		
		case 5:
			nota="suficiente";
			sufi+=1;
			break;
		case 6:
			nota="bien";
			b+=1;
			break;
		case 7:
		case 8:
			nota="notable";
			notable+=1;
			break;
		case 9:
		case 10:
			nota="sobresaliente";
			sobre+=1;
			break;
			
		}
		
	}
		System.out.println("Suspensos: " + sus);
		System.out.println("Suficientes: " + sufi);
		System.out.println("Bienes: " + b);
		System.out.println("Notables: " + notable);
		System.out.println("Sobresalientes: " + sobre);
		
	}
}
