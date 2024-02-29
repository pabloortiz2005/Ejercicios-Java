package ej;

import java.util.Scanner;

public class notasMedias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		int alumnos=20;
		//Declaro los arrays y las variables necesitadas
		
		String [] nombre= new String [alumnos];
		double [] pt= new double [alumnos];
		double [] st= new double [alumnos];
		double [] tt= new double [alumnos];
		double [] media= new double [alumnos];
		double mp=0;
		double ms=0;
		double mt=0;
		double mtotal=0;
		
		
		//creo un bucle para asignar el nombre, la nota de cada trimestre y su nota media
		
		for (int i =0; i < alumnos; i++) {
			System.out.println("Introduce el nombre y apellido del alumno");
			nombre[i]=leer.next();
			System.out.println(nombre[i]+":");
			pt[i]=(double)Math.round(Math.random()*10);
		
			System.out.println("Primer trimestre: " + pt[i]);
			st[i]=(double)Math.round(Math.random()*10);
			System.out.println("Segundo trimestre: " +st[i]);
			tt[i]=(double)Math.round(Math.random()*10);
			System.out.println("Tercer trimestre: " +tt[i]);
			
			media[i]=(pt[i]+st[i]+tt[i])/3;
			System.out.println("Su nota media es " + media[i]);
		}
		
		//Creo un bucle para la media total de cada trimestre y la media total de la asignatura
		
		for (int i=0; i<alumnos;i++) {
			mp=pt[i]+mp;
			ms=st[i]+ms;
			mt=tt[i]+mt;
			mtotal=media[i]+mtotal;
		}
		
		mp=mp/alumnos;
		ms=ms/alumnos;
		mt=mt/alumnos;
		mtotal=mtotal/alumnos;
		
		//Imprimo las notas
		
		
		System.out.println("La nota media del primer trimestre es " + mp);
		System.out.println("La nota media del segundo trimestre es " + ms);
		System.out.println("La nota media del tercer trimestre es " + mt);
		System.out.println("La nota media del curso es " + mtotal);
		
		

	}
}
