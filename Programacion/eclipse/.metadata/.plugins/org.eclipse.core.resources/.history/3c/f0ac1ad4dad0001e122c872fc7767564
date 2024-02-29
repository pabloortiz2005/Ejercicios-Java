package parking;

import java.util.ArrayList;

public class Parking {

	private int plazas;

	private ArrayList<String> matriculas;

	private String nombre;

	private int libres=plazas;
	private int ocupadas=0;






	public int getLibres() {
		return libres;
	}

	public void setLibres(int libres) {
		this.libres = libres;
	}

	public int getOcupadas() {
		return ocupadas;
	}

	public void setOcupadas(int ocupadas) {
		this.ocupadas = ocupadas;
	}

	public Parking(String nombre, int plazas) {

		this.setNombre(nombre);
		this.setPlazas(plazas);
		this.setMatriculas(new ArrayList<String>(plazas));;

		for(int i=0;i<plazas;i++) {
			this.matriculas.add(null);
		}

	}

	public ArrayList<String> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(ArrayList<String> matriculas) {
		this.matriculas = matriculas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public int getPlazas() {
		return plazas;
	}

	public void entrada(String matricula, int plaza) {
		this.matriculas.add(plaza,matricula);
		ocupadas++;
		libres--;
	}

	public int salida(String matricula) {
		int plaza=0;

		this.matriculas.add(plaza,null);
		plaza=matriculas.indexOf(matricula);

		ocupadas--;
		libres++;
		return plaza;
	}

	public int getPlazasTotales() {
		return plazas;
	}

	public int getPlazasOcupadas(int libres) {

		return libres;
	}

	public int getPlazasLibres(int ocupadas) {

		return ocupadas;

	}

	@Override
	public String toString() {
		return "Parking avenida\n------------------\n"+this.matriculas.toArray();
	}





}
