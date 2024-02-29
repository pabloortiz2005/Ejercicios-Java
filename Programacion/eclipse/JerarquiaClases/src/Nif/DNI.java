package Nif;
import java.util.Scanner;
public class DNI {

	private String numero;
	private String letra;

	
	public DNI() {
		
	}
	
	public DNI(String numero2) {
		this.numero= numero2;
		this.letra = "";
		
		
	}
	
	public DNI(String numero, String letra) {
		
		
		
		this.numero = numero;
		this.letra = letra;
		//this.letra = persona1.letra(this.numero);
		
	}
	
	
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	
	
	public String leer(String comp) {
		
		
		//comprobamos que la longitud este bien
		
		
	
		if (comp.length()==8) {
			
			comp = comp;
		
			
		} else {
			comp = "1";
			
		}	
		
		return comp;
	
	}
	
	public 	String letra(String numero) {
		
		//Calculamos la letra
		
		 int num = Integer.parseInt(numero);
		 String[] letras=new String[23];
		 letras[0]="T";
		 letras[1]="R";
		 letras[2]="W";
		 letras[3]="A";
		 letras[4]="G";
		 letras[5]="M";
		 letras[6]="Y";
		 letras[7]="F";
		 letras[8]="P";
		 letras[9]="D";
		 letras[10]="X";
		 letras[11]="B";
		 letras[12]="N";
		 letras[13]="J";
		 letras[14]="Z";
		 letras[15]="S";
		 letras[16]="Q";
		 letras[17]="V";
		 letras[18]="H";
		 letras[19]="L";
		 letras[20]="C";
		 letras[21]="K";
		 letras[22]="E";
		 
		 num=num%23;
		 
		 letra=letras[num];
		 
		return letra;
		
	}

	@Override
	public String toString() {
		return "DNI [numero=" + this.numero + ", letra=" + this.letra + "]";
	}
	
	
	
	
	
}

