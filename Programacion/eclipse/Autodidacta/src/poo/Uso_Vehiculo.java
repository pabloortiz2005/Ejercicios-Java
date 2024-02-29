package poo;

// import javax.swing.JOptionPane;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche micoche1=new Coche();
		
		micoche1.establece_color("Rojo");
		micoche1.establece_asientos("5");
		
		Furgoneta mifurgoneta1=new Furgoneta(7, 580);
		
		mifurgoneta1.establece_color("Negro");
		
		mifurgoneta1.configura_asientos("Si");
		
		mifurgoneta1.configura_climatizador("Si");
		
		mifurgoneta1.establece_asientos("2");
		
		System.out.println(micoche1.dime_datos_generales() + " " + micoche1.dime_datos_especificos());
		
		System.out.println(mifurgoneta1.dime_datos_generales() + mifurgoneta1.dimeDatosFurgoneta());
		
		
		
		/*
		//Instanciar una clase. Ejemplar de clase
		
		
		Coche micoche=new Coche();
		
		micoche.establece_color(JOptionPane.showInputDialog("Introduce el color del coche"));
		micoche.establece_asientos(JOptionPane.showInputDialog("Introduce el numero de asientos del coche"));
		micoche.configura_asientos(JOptionPane.showInputDialog("¿Los asientos son de cuero?  si/no"));
		micoche.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?  si/no"));
		
	
		
		
		System.out.println(micoche.dime_datos_generales());
		System.out.println(micoche.dime_datos_especificos());
		System.out.println(micoche.dime_asientos());
		System.out.println(micoche.dime_climatizador());
		System.out.println(micoche.dime_peso_coche());
		System.out.println("El precio del coche es: " + micoche.dime_precio() + "€");
		
		
		*/
		
		
		
		
	}

}
