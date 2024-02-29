package ej4;

public class directivo extends empleado {

	public directivo() {

		super();

	}

	public directivo(String nombre) {

		super(nombre);

	}

	@Override

	public String toString() {

		return super.toString() + " es directivo";

	}

}
