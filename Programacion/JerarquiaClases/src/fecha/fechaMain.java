package fecha;

import java.util.Scanner;

public class fechaMain {
	
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d, m, a;
		//Se pide por teclado el dia, mes y año
		System.out.println("Introduce fecha: ");
		System.out.print("dia: ");
		d = sc.nextInt();
		System.out.print("mes: ");
		m = sc.nextInt();
		System.out.print("año: ");
		a = sc.nextInt();
		
		
		fecha Fecha = new fecha(d,m,a);
		if (Fecha.fechaC()) { //si la fecha es correcta
		//Se muestra utilizando el método toString()
		System.out.println("Fecha introducida: " + Fecha);
		//Se muestran los 10 días siguientes utilizando el método
		
		System.out.println("Los 10 días siguientes son:");
		for (int i = 1; i <= 10; i++) {
		Fecha.diaSiguiente();
		System.out.println(Fecha);
		}
		} else { //Si la fecha no es correcta
		System.out.println("Fecha no valida");
		}
		}
		
}
