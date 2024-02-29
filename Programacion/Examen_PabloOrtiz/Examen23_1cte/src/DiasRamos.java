/**
 * 
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * @author NOMBRE Y APELLIDOS DEL ALUMN@
 *
 */
public class DiasRamos {

	/**
	 * @param args
	 * Programa: A partir de una fecha introducida por teclado (día, mes y año)
	 * debe calcular e indicarnos los días que quedan para el Domingo de Ramos 2024.
	 */
	public static void main(String[] args) {
		/*
		 * PROGRAMA PRINCIPAL
		 * Sólo la llamada a la función y mostrar información final por consola.
		 */
		Scanner scanner = new Scanner(System.in);
		long DiasRamos = calcularDias(scanner);
		System.out.println("Quedan " + DiasRamos + " para el Domingo de Ramos 2024. ");
		System.out.println(" \n \t ------- Gracias y adios !!!!!! ---------");
		

	}

	private static long calcularDias(Scanner scanner) {
		/*
		 * Función inicial para el cálculo de los días para el Domingo de Ramos
		 */
		
		
		//Recibo la fecha por teclado
		String NDia = leerDia(scanner);
		String NMes = leerMes(scanner);
		String NAnyo = leerAnyo(scanner);
		
		//Localdate es una utilidad para el formato de la fecha que utilizaremos mas adelante con otra utilidad
		
		LocalDate teclado = LocalDate.parse(NAnyo+"-"+NMes+"-"+NDia);
		LocalDate ramos  = LocalDate.parse("2024-03-24");
		
		
		
		//Utilidad de java para conseguir la diferencia entre dos fehcas

		long dias = ChronoUnit.DAYS.between(teclado, ramos);
		
		
		
		return dias;
	}

	
	
	//Todas las fechas son devueltas por string debido a que las menores de 10 necesitan que se les incerte un 0 detras para que funcione la utilidad.
	
	
	private static String leerAnyo(Scanner scanner) {
		//Lectura del año por teclado
		System.out.println("¿Que anyo es?");
		String anyo = scanner.nextLine();
		
		return anyo;
	}

	private static String leerMes(Scanner scanner) {
		// Lectura del mes por teclado
		System.out.println("¿Que numero de mes es? (Si es menor a 10 añade un 0 delante)");
		String mes = scanner.nextLine();
	
		return mes;
	}

	private static String leerDia(Scanner scanner) {
		// Lectura del día por teclado
		System.out.println("¿Que dia es? (Si es menor a 10 añade un 0 delante)");
		String dia = scanner.nextLine();
		return dia;
	}
	
	

}
