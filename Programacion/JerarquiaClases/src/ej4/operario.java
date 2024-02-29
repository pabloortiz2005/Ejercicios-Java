package ej4;

public class operario extends empleado {

	public operario() {

		super();

	}

	public operario(String nombre) {

		super(nombre);

	}

	@Override

	public String toString() {

		return super.toString() + " es operario";

	}

}
