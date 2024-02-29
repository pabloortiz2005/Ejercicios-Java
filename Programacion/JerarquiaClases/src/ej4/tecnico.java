package ej4;

public class tecnico extends operario {

	public tecnico() {

		super();

	}

	public tecnico(String nombre) {

		super(nombre);

	}

	@Override

	public String toString() {

		return super.toString() + " y es tecnico";

	}

}