/**
 * 
 */

/**
 * @author Juan Carlos
 *
 * Clase FECHA
 * Fecha con tres atributos; dia, mes y anyo. 
 */
public class Fecha {
	// Atributos
	private int dia;
	private int mes;
	private int anyo;
	
	
	/* Constructores de la clase Fecha */
	public Fecha() {	// Por defecto a fecha 1.1.2000
		this.dia = 1;
		this.mes = 1;
		this.anyo = 2000; 
	}
	
	public Fecha(int d, int m, int a) { // Constructor que recibe los tres parámetros
		this.dia = d;
		this.mes = m;
		this.anyo = a;
		// OTRA FORMA usando los set
		//setDia(d);
		//setMes(m);
		//setAnyo(a);
	}
	
	public Fecha (Fecha miFecha) { // Constructor de copia
		this.dia = miFecha.getDia();
		this.mes = miFecha.getMes();
		this.anyo = miFecha.getAnyo();
	}
	/* Métodos GET y SET de los atributos de FECHA */

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	
	/* Método para imprimir la fecha */
	public void imprimirFecha() {
        System.out.println("Fecha: " + dia + "/" + mes + "/" + anyo);
    }
	
	/* Método para verificar si el anyo es bisiesto */
	public boolean esBisiesto() {
		return (anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0);
	}
	
	/* Método para obtener los días del mes */
	public int obtenerDiasDelMes(int mes) {
        int[] diasDelMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes >= 1 && mes <= 12) {
            if (mes == 2 && esBisiesto()) {
                return 29;
            } else {
                return diasDelMes[mes];
            }
        } else {
        	return -1; // Valor inválido para el mes
        }
	
	}
	
	/* Método para reiniciar la FECHA */
	public void reiniciar(int dia, int mes, int anyo) {
        setDia(dia);
        setMes(mes);
        setAnyo(anyo);
    }
	
	
	/* Método para obtener el nombre del mes */
	public String obtenerNombreMes() {
        String[] nombresMeses = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                                  "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        if (mes >= 1 && mes <= 12) {
            return nombresMeses[mes];
        } else {
            return "Mes inválido";
        }
    }
	

}
