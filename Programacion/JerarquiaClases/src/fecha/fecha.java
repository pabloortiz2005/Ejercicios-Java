package fecha;
import java.util.Date;
public class fecha {
	private int dia;
	private int mes;
	private int anyo;
	//Constructor por defecto
	public fecha() {
	}
	//Constructor con parámetros
	public fecha(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}
	//setters y getters
	public void setDia(int d) {
		dia = d;
	}
	public void setMes(int m) {
		mes = m;
	}
	public void setAño(int a) {
		anyo = a;
	}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAño() {
		return anyo;
	}
	//Método para comprobar si la fecha es correcta
	public boolean fechaC() {
		boolean diaC = false, mesC=false, anyoC=false;
		anyoC = anyo > 0;
		mesC = mes >= 1 && mes <= 12;
		switch (mes) {
		case 2:
			if (esBisiesto()) {
				diaC = dia >= 1 && dia <= 29;
			} else {
				diaC = dia >= 1 && dia <= 28;
			}
			break;
		case 11:
			diaC = dia >= 1 && dia <= 30;
			break;
		default:
			diaC = dia >= 1 && dia <= 31;
		}

		return diaC && mesC && anyoC;
	}
	//Método privado para comprobar si el año es bisiesto
	//Este método lo utiliza el método fechaCorrecta
	private boolean esBisiesto() {
		return (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0);
	}
	//pasar dia
	public void diaSiguiente() {
		dia++;
		if (!fechaC()) {
			dia = 1;
			mes++;
			if (!fechaC()) {
				mes = 1;
				anyo++;
			}
		}
	}
	//ver fecha
	@Override
	public String toString() {
		StringBuilder build = new StringBuilder();
		if (dia < 10) {
			build.append("0");
		}
		build.append(dia);
		build.append("-");
		if (mes < 10) {
			build.append("0");
		}
		build.append(mes);
		build.append("-");
		build.append(anyo);
		return build.toString();
	}

	public boolean esMayorQue(fecha f) {


		if (this.anyo>f.anyo) {
			return true;
		} else if (this.anyo==f.anyo && this.mes>f.mes) {
			return true;
		} else if (this.anyo==f.anyo && this.mes==f.mes && this.dia>f.dia) {
			return true;
		} else {
			return false;
		}

	}
}
