package parking;

import java.util.ArrayList;

public class Parking {

	private int plazas;

	private ArrayList<String> matriculas;

	private String nombre;


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






	//Metodo para dar la entrada a un coche

	public void entrada(String matricula, int plaza)  throws Exception{
		if (matricula.length()!=4) {
			throw new Exception  ("Matricula erronea");
		}
		if (plaza <0 || plaza >= matriculas.size()) {
			throw new Exception  ("Plaza erronea");
		} else if (matriculas.get(plaza)!= null) {
			throw new Exception("Plaza ocupada");
		}
		else if (matriculas.contains(matricula)){
			throw new Exception("Matricula repetida");
		}


		//Comprobamos si la plaza esta ocupada
		if(matriculas.get(plaza)==null) {
			this.matriculas.set(plaza, matricula);
		} else {
			System.out.println("Esa plaza esta ocupada");
		}
		System.out.println("Plazas ocupadas: " + getPlazasOcupadas() + "\n Plazas libres: " + getPlazasLibres());
	}



	public int salida(String matricula) throws Exception {
		
		if (!matriculas.contains(matricula)) {
			
			throw new Exception("Matricula erronea");
		}
		int plaza=matriculas.indexOf(matricula);
		this.matriculas.set(plaza,null);
		return getPlazasLibres();
	}

	public int getPlazasTotales() {
		return this.plazas;
	}

	public int getPlazasOcupadas() {
		int ocupadas=0;
		for (int i=0;i<matriculas.size();i++) {
			if(matriculas.get(i)!=null) {
				ocupadas++;
			}
		}
		return ocupadas;
	}

	public int getPlazasLibres() {
		int libres=0;
		for (int i=0;i<matriculas.size();i++) {
			if(matriculas.get(i)!=null) {
				System.out.println(matriculas.get(i));
			} else {
				libres++;
			}
		}
		return libres;
	}

	@Override
	public String toString() {
		String cadena="";
		for (int i=0;i<this.matriculas.size();i++) {

			if(this.matriculas.get(i) == null) {
				cadena+="\n Plaza: " + i + " Matricula: vacio";
			} else {
				cadena+="\n Plaza: " + i + " Matricula: " + this.matriculas.get(i);

			}
			cadena+="\n --------";
		}
		return cadena;
	}





}
