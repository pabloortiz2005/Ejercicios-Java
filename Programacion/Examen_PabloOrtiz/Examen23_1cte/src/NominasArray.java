/**
 * 
 */

import java.util.Scanner;

/**
 * @author NOMBRE Y APELLIDOS DEL ALUMN@
 *
 */
public class NominasArray {

	/**
	 * @param args
	 * Programa; Cálculo de Nóminas
	 * Utilizar:
	 * -- Array para los empleados 
	 * -- Array bidimensional (sueldo por mes)
	 * -- Array sueldos anuales 
	 */
	static int totalEmpleados = 20;
	static int pagas = 12;

	static String[] empleados 		= new String[totalEmpleados];
	static double[][] sueldosMes 	= new double[pagas][totalEmpleados];
	static double[] sueldoAnual 	= new double[totalEmpleados];

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Principal. Mostrar menú con las opciones del programa
		 * 1. Cargar Empleados
		 * 2. Cargar Nominas por meses
		 * 3. Calcular nómina Anual empleados
		 * 4. Imprimir Nómina Empleado (Empleado)
		 * 5. Imprimir Todas las nóminas
		 * 6. Calcular gasto Mensual de la empresa (Mes)
		 * 7. Calcular gasto anual de la empresa
		 * 8. Calcular coste total del empleado (Empleado)
		 * 0. Salir 
		 */
		Scanner scanner = new Scanner(System.in);
		int controlador=0;
		boolean c=false;
		int empleado=0;
		int mes=0;
		double cmes=0;
		double ce=0;
		double ca=0;
		do {
			do{


				System.out.println();
				System.out.println("******MENU*****");
				System.out.println("Cargar Empleados=1");
				System.out.println("Cargar Nominas por meses=2");
				System.out.println("Calcular nomina Anual empleados=3");
				System.out.println("Imprimir Nomina empleado (empleado)=4");
				System.out.println("Imprimir todas las nominas=5");
				System.out.println("Calcular gasto mensual de la empresa (mes)=6");
				System.out.println("Calcular gasto anual empresa=7");
				System.out.println("Calcula coste total del empleado(empleado)=8");
				System.out.println("******SALIR*****=0");


				controlador=scanner.nextInt();
				switch(controlador) {

				case 1:
					cargarEmpleados(empleados);

					break;

				case 2:

					cargarNominasMeses(sueldosMes, empleados);
					break;

				case 3:

					calcularNominaAnual(sueldosMes,sueldoAnual);
					break;

				case 4:

					System.out.println("Eliga el numero de empleado");
					empleado=scanner.nextInt();
					empleado=empleado-1;
					imprimirNomina(sueldosMes, empleados, empleado);
					break;

				case 5:

					imprimirNominas(empleados, sueldoAnual);
					break;

				case 6:

					System.out.println("Eliga el numero de mes");
					mes=scanner.nextInt();
					mes=mes-1;
					cmes=costeMensual(sueldosMes,mes);
					System.out.println("El coste para la empresa del mes elegido es: "+cmes);
					break;
					
				case 7:

					ca=costeAnual(sueldoAnual);
					System.out.println("El coste anual para la empresa es: " + ca);
					break;

				case 8:

					System.out.println("Eliga el numero de empleado");
					empleado=scanner.nextInt();
					empleado=empleado-1;
					ce=costeEmpleado(empleado, sueldoAnual);
					System.out.println("El coste del empleado seleccionado es: " + ce);
					break;

				case 0:
					System.out.println("*********Adiooooooos*********");
					break;
				}

				if (controlador==1 || controlador==2 || controlador==0 || controlador==3 || controlador==4 || controlador==5 || controlador==6 || controlador==7 || controlador==8) {


					c=true;
				} else {
					System.out.println("Opcion erronea");
				}

			} while(c=false);
		} while(controlador!=0);



	}


	private static void cargarEmpleados(String[]empleados) {
		/* 
		 * Carga de los datos de los empleados
		 * Array empleados
		 */
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0;i<totalEmpleados;i++) {
			
			System.out.println("Introduce el empleado " + (i+1));
			empleados[i]=scanner.nextLine();
		}



	}

	private static void cargarNominasMeses(double[][] sueldosMes, String[]empleados) {
		/* 
		 * Método para cargar las Nóminas de los empleados X 12 meses
		 * Array SueldosMes
		 */
		Scanner scanner = new Scanner(System.in);
		for (int i=0;i<totalEmpleados;i++) {
			System.out.println("Empleado: " + empleados[i]);
			for (int j=0;j<pagas;j++) {
				System.out.println("Introduce el sueldo del mes " + (j+1));
				sueldosMes[j][i]=scanner.nextInt();
			}
		}



	}

	private static void calcularNominaAnual(double[][] sueldosMes, double[] sueldoAnual) {
		/* 
		 * Método para cargar los sueldos anuales de los empleados
		 * Tomamos los datos mensuales y generamos el dato anual por empleado
		 * Array SueldoAnual
		 */

		for (int i=0;i<=totalEmpleados-1;i++) {
			for (int j=0;j<pagas;j++) {
				System.out.println("Introduce el sueldo del mes " + (j+1));
				sueldoAnual[i]+= sueldosMes[j][i];
			}
		}


	}

	private static void imprimirNomina(double[][] sueldosMes, String[]empleados,int empleado) {
		/*
		 * Método para imprimir las nóminas del año (12 MESES) 
		 *  e imprimir la nómina ANUAL del empleado indicado.
		 */

		System.out.println("Empleado: " + empleados[empleado]);
		for (int j=0;j<pagas;j++) {
			System.out.println("Sueldo mes " + (j+1) + ": ");
			System.out.print(sueldosMes[j][empleado]);
			System.out.println();
		}



	}

	private static void imprimirNominas(String[]empleados, double[] sueldoAnual) {
		/*
		 * Método para imprimir las nóminas ANUALES de TODOS los empleados.
		 */
		for (int i=0;i<totalEmpleados;i++) {
			System.out.println("Sueldo anual de empleado: " + empleados[i]+": "+sueldoAnual[i]);
		}

	}

	private static double costeMensual(double[][] sueldosMes, int mes) {
		/* 
		 * Función que calcula el coste en nóminas del MES pasado por parámetro.
		 */
		double costeMes=0;


		for (int j=0;j<totalEmpleados;j++) {
			costeMes+=sueldosMes[mes][j];
		}






		return costeMes;
	}

	private static double costeAnual(double[] sueldoAnual) {
		/* 
		 * Función que calcula el coste en nóminas del AÑO pasado por parámetro.
		 */
		double costeAnyo=0;



		for (int i=0;i<totalEmpleados;i++) {
			costeAnyo+=sueldoAnual[i];
		}

		return costeAnyo;
	}

	private static double costeEmpleado(int empleado,double[] sueldoAnual) {
		/* 
		 * Función que calcula el coste del Empleado pasado por parámetro.
		 */
		double costeEmpleado=0;


		costeEmpleado=sueldoAnual[empleado];

		return costeEmpleado;
	}

}
