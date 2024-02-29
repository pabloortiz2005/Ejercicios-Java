package persona;

import java.time.LocalDate;
import java.time.Period;

import fecha.fecha;

public class persona {

	private String nombre;
	private String direc;
	private String cod_p;
	private String ciudad;
	private fecha f_nac;

	public persona() {

	}

	public persona(String nombre, String direc, String cod, String ciudad, fecha fechaNacimiento) {
	
		this.nombre=nombre;
		this.direc=direc;
		this.cod_p=cod;
		this.ciudad=ciudad;
		this.f_nac=fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirec() {
		return direc;
	}

	public void setDirec(String direc) {
		this.direc = direc;
	}

	public String getCod_p() {
		return cod_p;
	}

	public void setCod_p(String cod_p) {
		this.cod_p = cod_p;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public fecha getF_nac() {
		return f_nac;
	}

	public void setF_nac(fecha f_nac) {
		this.f_nac = f_nac;
	}

	public boolean esMayorDeEdad() {
		LocalDate fs= LocalDate.now();
		LocalDate faux= LocalDate.of( f_nac.getAño(), f_nac.getMes(), f_nac.getDia());
		Period periodo=Period.between(faux,fs);
		return periodo.getYears()>=18;	
	}
		
	public String comprobar() {
		if (esMayorDeEdad()==true) {
			return "si";
		} else {
			
			return "no";
		}
	}
	

	@Override
	public String toString() {
		return "persona [nombre=" + nombre + "\n" +  "Fecha Nacimiento=" + f_nac    + "\n" + "direc=" + direc  + "\n" + "cod_p=" + cod_p + "\n" + "ciudad=" + ciudad 
				 + "]";
	}



}
