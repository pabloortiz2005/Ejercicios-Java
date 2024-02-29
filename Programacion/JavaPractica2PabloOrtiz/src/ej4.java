import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		int h1=-1;
		int d1=0;
		int h2=-1;
		int d2=0;
		int a=0;
		int b=0;
		int difh=0;
		int difd=0;
		int dd1=0;
		int dd2=0;
		boolean d=true;
		
		do {
			System.out.println("Introduce el dia 1");
			d1=leer.nextInt();
			System.out.println("Introduce el dia 2");
			d2=leer.nextInt();
			System.out.println("Introduce la hora del dia 1");
			h1=leer.nextInt();
			System.out.println("Introduce la hora del dia 2");
			h2=leer.nextInt();

		
		if (d1 < 1 || d1>7 || d2 < 1 || d2>7 || h1 < 0 || h1>23 || h2 < 0 || h2>23 ) {
			
			System.out.println("Datos erroneos");
			d=false;
		} else {
			
			d=true;
		}
		
		
		}while(d==false);
		
		
			
		a=Math.max(h2, h1);
		b=Math.min(h2, h1);
		
		if(d1==d2) {
			difh=a-b;
			
		} else if (d1>d2){
			difh=(((7-d1)*24)+(24-h1)+((d2*24)-(24-h2)));
		} else {
			difh=((d2*24)+h2)-((d1*24)+h1);
		
		
			
		}
		System.out.println("La diferencia en horas es de " + difh);
	}
}


