import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingresa el día en que naciste: ");
	        int d = scanner.nextInt();
	        System.out.print("Ingresa el numero del mes en el que naciste: ");
	        int m = scanner.nextInt();

	        String horoscopo = "";

	        if ((m == 3 && d >= 21) || (m == 4 && d <= 19)) {
	            horoscopo = "Aries";
	        } else if ((m == 4 && d >= 20) || (m == 5 && d <= 20)) {
	            horoscopo = "Tauro";
	        } else if ((m == 5 && d >= 21) || (m == 6 && d <= 20)) {
	            horoscopo = "Géminis";
	        } else if ((m == 6 && d >= 21) || (m == 7 && d <= 22)) {
	            horoscopo = "Cáncer";
	        } else if ((m == 7 && d >= 23) || (m == 8 && d <= 22)) {
	            horoscopo = "Leo";
	        } else if ((m == 8 && d >= 23) || (m == 9 && d <= 22)) {
	            horoscopo = "Virgo";
	        } else if ((m == 9 && d >= 23) || (m == 10 && d <= 22)) {
	            horoscopo = "Libra";
	        } else if ((m == 10 && d >= 23) || (m == 11 && d <= 21)) {
	            horoscopo = "Escorpio";
	        } else if ((m == 11 && d >= 22) || (m == 12 && d <= 21)) {
	            horoscopo = "Sagitario";
	        } else if ((m == 12 && d >= 22) || (m == 1 && d <= 19)) {
	            horoscopo = "Capricornio";
	        } else if ((m == 1 && d >= 20) || (m == 2 && d <= 18)) {
	            horoscopo = "Acuario";
	        } else if ((m == 2 && d >= 19) || (m == 3 && d <= 20)) {
	            horoscopo = "Piscis";
	        } else {
	            System.out.println("Fecha no válida");
	            return;
	        }

	        System.out.println(horoscopo);
	}

}
