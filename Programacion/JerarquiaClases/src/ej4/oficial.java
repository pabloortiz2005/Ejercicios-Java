package ej4;

public class oficial extends operario {

	public oficial() {

		super();

	}

	public oficial(String nombre) {

		super(nombre);

	}

	@Override

	public String toString() {

		return super.toString() + " y es oficial";

	}

}