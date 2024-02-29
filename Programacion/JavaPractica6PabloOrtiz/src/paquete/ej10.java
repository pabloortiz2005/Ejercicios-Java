package paquete;

public class ej10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dados();
	}
	public static void dados() {
int n1, n2, c =0;
		
		
		do {
			c++;
			n1= (int) (Math.random()*6);
			n2=(int) (Math.random()*6);
			
		} while(n1!=n2);
		System.out.println("Has usado " + c + " intentos");
	}
}
