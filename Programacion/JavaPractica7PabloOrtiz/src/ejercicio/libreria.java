package ejercicio;

import java.util.Scanner;

public class libreria {

	public static void main(String[] args) {
		
		//Pruebas
		
		/* 
		int n=168;
		int potencia=0;
		char num;
		int posicion;
		potencia=potencia(n);
		System.out.println("Potencia: "+potencia);
		capicua(n);
		juntaNumero();
		digitos(n);
		if (esPrimo(n)) {
			System.out.println("Es primo");
		} else  {
			System.out.println("No es primo");
		}
		System.out.println("El siguiente primo es: "+siguientePrimo(n));
		num=digitoN(n);
		System.out.println("El numero en la posicion especificada es: "+num);

		posicion=posicionDeDigito(n);

		if (posicion>-1) {
			System.out.println("El numero seleccionado esta en la posicion: "+posicion);
		} else {
			System.out.println("No se a encontrado el numero");
		}
*/
		
		
	}

	//Devuelve si e capicua
	public static void capicua(int n) {
		boolean capicua=false;
		String num=n+"";
		String numreves=voltea(n);

		if (num.equalsIgnoreCase(numreves)) {
			System.out.println("Es capicua");
		} else {
			System.out.println("No es capicua");
		}




	}
	//Devuelve si n es primo
	public static boolean esPrimo(int n) {
		boolean primo=false;


		int c=0;

		for(int i=1;i<=n;i++) {
			if (n%i==0) {
				c++;
			}
		}
		if (c==2) {
			primo=true;
		}




		return primo;

	}
	//dEVUELVE EL SIGUIENTE PRIMO A N
	public static int siguientePrimo(int n) {
		boolean primo=false;

		do{
			n++;
			if (esPrimo(n)) {
				primo=true;
				break;
			}

		}while(primo==false);


		return n;


	}

	//HACE LA POTENCIA DE N
	public static int potencia(int n) {
		int potencia=0;
		int elevar=2;

		potencia=(int) Math.pow(n, elevar);

		return potencia;
	}

	//DICE EL NUMERO DE DIGITOS
	public static void digitos(int n) {
		int ndigitos=0;
		String num=n+"";
		ndigitos=num.length();
		System.out.println("El numero de digitos es: "+ndigitos);
	}


	//DAR LA VUELTA AL NUMERO
	public static String voltea(int n) {
		Scanner leer = new Scanner (System.in);
		char b;
		String a="";
		System.out.println("Numero sin voltear: "+n);
		String c = "" + n;
		for ( int i = 0; i <c.length();i++) {

			b= c.charAt(c.length()-i-1);
			a+=""+b;

		}
		System.out.println("Al reves: "+a);
		String num = a + "";
		return num;
	}

	//Dice el numero en la posicion "pos"
	public static char digitoN(int n) {
		int pos=2;
		pos=pos-1;//Restamos 1 porque las posiciones empiezan en 0
		String num="";
		char nume='0';
		num=n+"";
		nume=num.charAt(pos);
		return nume;



	}




	public static int posicionDeDigito(int n) {
		String num= Integer.toString(n);
	
	
		char compara = '6';
		int encontrado = -1;
		char caracter;
		
		for ( int i = 0; i <num.length();i++) {
			
			
			caracter = num.charAt(i);
			
			if (caracter==compara) {
				encontrado=i;
				
				break;
			
			}

		}
		return encontrado;
	}



	public static int quitaPorDetras() {
		Scanner leer = new Scanner (System.in);
		System.out.println("\n" + "Introduce el primer numero" + "\n");
		String num=leer.next();
		System.out.println("\n" + "Cuantos numeros quieres quitar por detras?" + "\n");
		int c = leer.nextInt();
		String res="";
		for (int i=0;i<num.length()-c;i++) {
			res+=num.charAt(i);
		}
		
		int resf=Integer.parseInt(res);
		return resf;
	}




	public static int quitaPorDelante() {
		Scanner leer = new Scanner (System.in);
		System.out.println("\n" + "Introduce el primer numero" + "\n");
		String num=leer.next();
		System.out.println("\n" + "Cuantos numeros quieres quitar por delante?" + "\n");
		int c = leer.nextInt();
		String res="";
		for (int i=c;i<num.length()-c;i++) {
			res+=num.charAt(i);
		}
		
		int resf=Integer.parseInt(res);
		return resf;
	}





	public static int pegaPorDetras() {
		Scanner leer = new Scanner (System.in);
		System.out.println("\n" + "Introduce el primer numero" + "\n");
		String num=leer.next();
		System.out.println("\n" + "Introduce el segundo numero" + "\n");
		String num1=leer.next();
		String res=num+num1;
		
		
		int resf=Integer.parseInt(res);
		return resf;
	}





	public static int pegaPorDelante() {
		Scanner leer = new Scanner (System.in);
		System.out.println("\n" + "Introduce el primer numero" + "\n");
		String num=leer.next();
		System.out.println("\n" + "Introduce el segundo numero" + "\n");
		String num1=leer.next();
		String res=num1+num;
		
		
		int resf=Integer.parseInt(res);
		return resf;
	}




	public static int trozodeNumero() {
		Scanner leer = new Scanner (System.in);
		System.out.println("\n" + "Introduce el primer numero" + "\n");
		String num=leer.next();
		System.out.println("\n" + "Introduce la posicion inicial" + "\n");
		int num1=leer.nextInt();
		System.out.println("\n" + "Introduce la posicion final" + "\n");
		int num2=leer.nextInt();
		String res="";
		for (int i=num1;i<=num2;i++) {
			res+=num.charAt(i);
		}
		
		int resf=Integer.parseInt(res);
		return resf;
	}




	//Junta dos numeros
	public static void juntaNumero() {
		int n1=2;
		int n2=5;
		String num1=n1+"";
		String num2=n2+"";
		String numero=num1+num2;
		System.out.println("Numeros juntados: "+numero);
	}
}