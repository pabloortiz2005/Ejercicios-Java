package persona;

import java.util.Scanner;

import fecha.fecha;

public class personaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);


		int npers=1;
		persona [] personas= new persona[npers];

		for (int i=0;i<npers;i++) {
			System.out.println("Persona " + (i+1) + ":");
			System.out.println("Introduce el nombre: ");
			String nombre=scan.nextLine();

			System.out.println("Introduce la direccion: ");
			String direc=scan.nextLine();

			System.out.println("Introduce el codigo postal: ");
			String cod=scan.nextLine();

			System.out.println("Introduce la ciudad: ");
			String ciudad=scan.nextLine();

			System.out.println("Fecha nacimiento(dia/mes/anyo): ");
			String fecha=scan.nextLine(); 

			String[] mifecha=fecha.split("/");
			fecha fechaNacimiento= new fecha(Integer.parseInt(mifecha[0]), Integer.parseInt(mifecha[1]), Integer.parseInt(mifecha[2]));

			personas[i]=new persona(nombre,direc,cod,ciudad,fechaNacimiento);

		}
		
		System.out.println("Informacion");
		for(persona personas1 : personas) {
			
			System.out.println(personas1.toString());
			System.out.println("Es mayor de edad " + personas1.comprobar());
			System.out.println("");
		}

	}

}
