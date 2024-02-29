package parkingVehiculo;

public interface VehiculoInterfaz {
	double factura();
    boolean hayPlaza(Parkingv2 parking);
    void aparca(Parkingv2 parking);
    void setTiempo(int tiempo);
}
