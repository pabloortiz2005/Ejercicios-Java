package Nif;
import java.util.Scanner;
public class DNIMAIN {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Introduce el numero");
	String input = scanner.nextLine();
		
		
		
		
		
	DNI nif1 = new DNI(input);
	String numero = nif1.leer(input);
	String letra = nif1.letra(numero);
	
	
	DNI nif2 = new DNI(numero, letra);
	
	System.out.println(nif2.getNumero()+"-"+ nif2.getLetra());
	
	
	}


}
