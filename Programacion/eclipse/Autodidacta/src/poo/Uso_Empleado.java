package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Empleado empleado1=new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		Empleado empleado2=new Empleado("Julia López", 95000, 1995, 6, 02);
		Empleado empleado3=new Empleado("Pablo Ortiz", 105000, 2002, 3, 22);

		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);

		System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo()
		+ " Fecha de alta: " + empleado1.dameFechaContrato());

		System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo()
		+ " Fecha de alta: " + empleado2.dameFechaContrato());

		System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo()
		+ " Fecha de alta: " + empleado3.dameFechaContrato());
	}*/
		
		Jefatura jefe_RRHH= new Jefatura("Roberto Ortega", 140000, 2006, 9, 25);
		
		jefe_RRHH.estableceIncentivo(2570);

		Empleado[] misEmpleados=new Empleado[6];

		misEmpleados[0]=new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		misEmpleados[1]=new Empleado("Julia López", 95000, 1995, 06, 02);
		misEmpleados[2]=new Empleado("Pablo Ortiz", 105000, 2002, 03, 22);
		misEmpleados[3]=new Empleado("juan Garcia");
		misEmpleados[4]=jefe_RRHH; //Polimorfismo en acción. Principio de sustitución
		misEmpleados[5]=new Jefatura ("María", 95000, 1999, 5, 26);
		//Bucle for normal

		/*for (int i=0;i>misEmpleados.length;i++) {

			misEmpleados[i].subeSueldo(5);
		}

		for (int i=0;i<misEmpleados.length;i++) {
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo: "
			+ misEmpleados[i].dameSueldo() + " Fecha de alta: " + misEmpleados[i].dameFechaContrato());
		}*/




		//Bucle for mejorado = bucle for each

		for (Empleado e: misEmpleados) {

			e.subeSueldo(5);

		}
		
		for (Empleado e: misEmpleados) {

			System.out.println("Nombre: " + e.dameNombre() + " Sueldo: "
					+ e.dameSueldo() + " Fecha de alta: " + e.dameFechaContrato());

		}
	}
}

class Empleado{ //constructor
	

	public Empleado(String nom, double sue, int agno, int mes, int dia) {

		nombre=nom;

		sueldo=sue;

		GregorianCalendar calendario=new GregorianCalendar(agno, mes -1,dia);

		altaContrato=calendario.getTime();

		++IdSiguiente;
		Id=IdSiguiente;

	}

	public Empleado(String nom) {

		this(nom, 30000, 2000, 01, 01);


	}



	public String dameNombre(){ //getter

		return nombre + " Id: " + Id;
	}
	public double dameSueldo(){ //getter

		return sueldo;
	}

	public Date dameFechaContrato() { //getter

		return altaContrato;
	}

	public void subeSueldo(double porcentaje) { //setter

		double aumento=sueldo*(porcentaje/100);

		sueldo+=aumento;
	}

	private int Id;
	private static int IdSiguiente=0;
	private String nombre;
	private double sueldo;
	private Date altaContrato;



}


class Jefatura extends Empleado{

	public Jefatura(String nom, double sue, int agno, int mes, int dia) {

		super(nom, sue, agno, mes, dia);

	}

	public void estableceIncentivo(double b) {

		incentivo=b;

	}

	public double dameSueldo() {

		double sueldoJefe=super.dameSueldo(); //llama al metodo de la clase padre en vez de a la del hijo



		return sueldoJefe + incentivo;

	}


	private double incentivo;

}
