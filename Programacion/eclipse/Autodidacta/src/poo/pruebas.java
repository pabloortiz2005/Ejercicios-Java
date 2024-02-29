package poo;

import javax.swing.JOptionPane;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Empleados trabajador1=new Empleados(JOptionPane.showInputDialog("Introduce el nombre del primer trabajador"));
	
		Empleados trabajador2=new Empleados(JOptionPane.showInputDialog("Introduce el nombre del segundo trabajador"));
		
		Empleados trabajador3=new Empleados(JOptionPane.showInputDialog("Introduce el nombre del segundo trabajador"));
		
		Empleados trabajador4=new Empleados(JOptionPane.showInputDialog("Introduce el nombre del segundo trabajador"));
		
		
		
		trabajador1.cambiaSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos()
		+ "\n" + trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos());
		
		
		System.out.println(Empleados.dameIdSiguiente());
	
	}

}


class Empleados {
	
	
	public Empleados(String nom) { //constructor
		
		nombre=nom;
		
		seccion="Administración";
		
		Id=IdSiguiente;
		
		IdSiguiente++;
		
	}
	
	
	public void cambiaSeccion(String seccion) { //setter
		
		this.seccion=seccion;
		
	}
	
	
	
	
	public String devuelveDatos() { //getter
		
		return "El nombre es: " + nombre + ", la seccion es " + seccion + " y la Id = " + Id;
	}
	
	
	public static String dameIdSiguiente() {
		
		return "El Id siguente es: " + IdSiguiente;
		
	}
	
	
	private final String nombre;
	
	private String seccion;
	
	private int Id;
	
	private static int IdSiguiente=1;
	
}