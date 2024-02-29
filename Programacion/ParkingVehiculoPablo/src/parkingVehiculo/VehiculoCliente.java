package parkingVehiculo;

public class VehiculoCliente implements VehiculoInterfaz {
	private final String matricula;
	private int tiempo;

	public VehiculoCliente(String matricula) {
		this.matricula = matricula;
		this.setTiempo(tiempo);
	}

	public String getMatricula() {
		return matricula;
	}

	public int getTiempo() {
		return tiempo;
	}

	@Override
	public String toString() {
		return "Vehiculo: Matricula= " + matricula + ", tiempo= " + tiempo + " horas]";
	}


	@Override
	public double factura() {
		double precio = 0;
		int d = tiempo / 24;

		if (tiempo <= 1) {
			precio = 1.2;
		} else if (tiempo == 24) {
			precio = 25;
		} else if (tiempo > 24) {
			precio = d * 25 + (tiempo % 24) * 1.2;
		} else {
			precio = 1.2 * tiempo;
		}
		return precio;
	}

	@Override
	public boolean hayPlaza(Parkingv2 parking) {
		return parking.libre();
	}

	@Override
	public void aparca(Parkingv2 parking) {
		if (hayPlaza(parking)) {
			parking.aparca();
			System.out.println("Puede aparcar su coche");
		} else {
			System.out.println("No puede aparcar, el parking esta lleno");
		}
	}
	@Override
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
}
