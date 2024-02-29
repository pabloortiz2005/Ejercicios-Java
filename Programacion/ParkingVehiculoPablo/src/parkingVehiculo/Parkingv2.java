package parkingVehiculo;

public class Parkingv2 {

	 private String nombre;
	    private int capacidadTotal;
	    private int plazaLibre;

	    public Parkingv2(String nombre, int capacidadTotal, int horas) {
	        this.setNombre(nombre);
	        this.setCapacidadTotal(capacidadTotal);
	        this.setPlazaLibre(capacidadTotal);
	    }
	    

	    public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public int getCapacidadTotal() {
			return capacidadTotal;
		}


		public void setCapacidadTotal(int capacidadTotal) {
			this.capacidadTotal = capacidadTotal;
		}


		public int getPlazaLibre() {
			return plazaLibre;
		}


		public void setPlazaLibre(int plazaLibre) {
			this.plazaLibre = plazaLibre;
		}


		public boolean libre() {
	        return plazaLibre > 0;
	    }

	    public void aparca() {
	        if (libre()) {
	            plazaLibre--;
	        }
	    }

		public int disponibles() {
	        return plazaLibre;
	    }
		
	    @Override
		public String toString() {
			return "Parking Nombre=" + nombre + ", Capacidad maxima=" + capacidadTotal + ", plazas libres=" + plazaLibre + "";
		}

	}