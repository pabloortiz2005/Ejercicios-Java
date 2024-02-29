package ej4;

public class empleado {

	private String nombre;



	public empleado() {



	}



	public empleado(String nombre) {

		this.nombre = nombre;

	}



	public String getNombre() {

		return nombre;

	}



	public void setNombre(String nombre) {

		this.nombre = nombre;

	}



	@Override

	public String toString() {

		return "El empleado " + nombre;

	}

}