import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	int i;
		 	int suma=0;
		 	int n1;
		 	int n2;
	        Scanner leer = new Scanner(System.in);
	        System.out.print("Introduce el primer número: ");
	        n1 = leer.nextInt();
	        System.out.print("Introduce el segundo número: ");
	        n2 = leer.nextInt();
	  
	        for(i = 1;i < n1;i++){                                    
	             if(n1%i==0){
	                suma=suma+i;
	             }
	        }
	  
	        
	        if(suma==n2){
	           suma=0;
	           for(i = 1;i < n2;i++){                                                  
	                if(n2%i==0){
	                   suma=suma+i;
	                }
	            }
	           
	           if(suma==n1){
	              System.out.println("Son Amigos");
	           }else{
	              System.out.println("No son amigos");
	           }
	        }        
	        else{
	             System.out.println("No son amigos");
	        }
	}

}
