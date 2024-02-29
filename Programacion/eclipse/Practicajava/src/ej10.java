import java.util.Scanner;

public class ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce la hora (solo la hora): ");
	        int hora = scanner.nextInt();
	        
	        
	        if (hora<0 || hora>24) {
	        System.out.println("Hora no valida");
	        } else {
	        	
	      
	    	if (hora >= 6 && hora <= 12) {
	    	System.out.println("Buenos días");
	    	}else if (hora >= 13 && hora <= 20) {
	       System.out.println("Buenas tardes");
	    	} else if ((hora >= 21 && hora <= 24) || (hora >= 0 && hora <= 5)) {
	    	System.out.println("Buenas noches");
	    	        }	    	        	    	        
	        }
	        	
	        
	  }

}
