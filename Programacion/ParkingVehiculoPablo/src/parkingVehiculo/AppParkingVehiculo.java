package parkingVehiculo;

public class AppParkingVehiculo {
	
	public static void main(String[] args) {
		
		Parkingv2 parking = new Parkingv2("Parking Avenida", 8, 24);

		VehiculoCliente vehiculo1 = new VehiculoCliente("7777");
		vehiculo1.setTiempo(8);

		VehiculoCliente vehiculo2 = new VehiculoCliente("8888");
		vehiculo2.setTiempo(1);

		vehiculo1.aparca(parking);
		System.out.println(vehiculo1.toString());
		System.out.println("Tiene que pagar: " + String.format("%.2f", vehiculo1.factura()) + " €");
		System.out.println("Plazas disponibles: " + parking.disponibles());

		
		System.out.println("\n Esta entrando en: " + parking.toString() + "\n");
	

		vehiculo2.aparca(parking);
		System.out.println(vehiculo2.toString());
		System.out.println("Tiene que pagar: " + String.format("%.2f", vehiculo2.factura()) + " €");
		System.out.println("Plazas disponibles: " + parking.disponibles());
	}
}
