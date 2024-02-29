import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 	int numero =1;
	        System.out.print("Introduce la cantidad de números: ");
	        int n = scanner.nextInt();
	        
	        if (n < 2) {
	            System.out.println("Se requieren al menos dos números para calcular el MCD y el MCM.");
	            return;
	        }

	        System.out.print("Introduce el primer número: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Introduce el segundo número: ");
	        int numero2 = scanner.nextInt();

	       
	        int mcd = numero1;
	        int a = numero1;
	        int b = numero2;
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        mcd = a;
	       
	        double mcm = (numero1 * numero2) / mcd;

	        for (int i = 2; i < n; i++) {
	            System.out.print("Introduce el siguiente número: ");
	            numero = scanner.nextInt();
	            a = mcd;
	            b = numero;
	            while (b != 0) {
	                int temp = b;
	                b = a % b;
	                a = temp;
	            }
	            mcd = a;
	         
	            
	            if(numero1%2==0 && numero2%2==0) {
		        	if (numero%2==0) {
		        		mcm=((mcm*numero)/mcd);		        		
		        	} else {
		        		mcm=((mcm*numero)/mcd);	
		        		
		        	}
		        	
		        	 
		        }
	            else if (numero1%2==0 && numero2%2!=0){
		        	
		        		
		        		mcm=((mcm*numero)/mcd)/2;	
		        	 
		        	
		        }else {
		        	mcm=((mcm*numero)/mcd);	
		        }
		      
	        }
	       

	        System.out.println("El Máximo Común Divisor (MCD) de los números ingresados es: " + mcd);
	        System.out.println("El Mínimo Común Múltiplo (MCM) de los números ingresados es: " + mcm);
	}

}
