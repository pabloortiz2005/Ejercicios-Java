package ejercicio;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bucle();
		
		
		
		
		
		
	}


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
	} else {
		c=0;
	}




	return primo;

}




public static void bucle() {
	int n=0;
	for (int i=0;i<1000;i++) {
		if (esPrimo(n)==true) {
			System.out.print(n+", ");
		}


	n++;
	}
}



}