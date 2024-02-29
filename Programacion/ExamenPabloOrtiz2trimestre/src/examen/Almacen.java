package examen;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Almacen {
	static Scanner letras = new Scanner (System.in);
	static Scanner numeros = new Scanner (System.in);
	static Scanner dobles = new Scanner (System.in);





	public static void main(String[] args) {
		ArrayList<Articulos> listaArticulos=new ArrayList<Articulos>();
		ArrayList<Proveedores> listaProv=new ArrayList<Proveedores>();
		Scanner leer = new Scanner (System.in);
		int num;
		Articulos Art;
		Proveedores prov;
		boolean prog=false;



		while(prog==false) {

			System.out.println("\n \n Alta Articulo 1 \n Baja Articulo 2 \n Alta Proveedor 3 \n Baja Proveedor 4 \n Listar Articulos 5 \n Listar Proovedores 6 \n Venta Articulo 7 \n Existencias Disponibles 8 \n Si quieres acabar el programa pulsa 0" );
			num=leer.nextInt();
			switch(num) {

			case 1:


				String provedorA="";
				boolean prove=false;


				//No he logrado hacer que haga falta un proveedor existente pero creo que me he quedado cerca

				/*
				int cont=0;
				Proveedores p;

				System.out.println("Proveedor del articulo");
				while (prove==false) {

					provedorA=letras.nextLine();



					for (Proveedores provedor:listaProv) {
						cont++;
						p=listaProv.get(cont);
						if(listaProv.contains(p)) {
							prove=true;
							break;
						}
						System.out.println("Inserte un proveedor existente porfavor");
					}

				 */

				System.out.println("Proveedor del articulo");
				provedorA=letras.nextLine();
				Art=altaArticulo(provedorA);
				listaArticulos.add(Art);
				break;
			case 2:

				int posA;

				System.out.println("Introduce la posicion del articulo que quieres borrar");
				posA=leer.nextInt();
				listaArticulos.remove(posA);

				break;
			case 3:
				prov=altaProv();
				listaProv.add(prov);
				break;
			case 4:
				int posP;
				System.out.println("Introduce la posicion del proveedor que quieres borrar");
				posP=leer.nextInt();
				listaArticulos.remove(posP);
				break;
			case 5:
				for (Articulos articulos:listaArticulos) {
					System.out.println(articulos + ", ");
				}
				break;
			case 6:
				for (Proveedores proveedores:listaProv) {
					System.out.println(proveedores + ", ");
				}
				break;
			case 7:
				Articulos art;
				int posArt;
				System.out.println("Introduce la posicion del articulo que se haya vendido");
				posArt=numeros.nextInt();
				art=listaArticulos.get(posArt);
				venta(art);

				break;
			case 8:
				int tamaño;
				tamaño=listaArticulos.size();
				System.out.println("Hay " + tamaño + " diferentes articulos en stock");
				for (Articulos arti:listaArticulos) {
					//Usamos los datos necesarios del objeto
					System.out.print("Nombre=" + arti.getNombreArticulo() + ", codigo= " + arti.getCodArticulo() + ", Unidades Disponibles= " + arti.getUnidadesDispo());
				}
				break;
			case 0:
				prog=true;
				break;
			}
		}
	}

	public static Articulos altaArticulo(String provedorA) {

		String codA="";
		String nombreA="";
		String descA="";
		double precioA=0;
		double ivaA=0;

		int unidadesD=0;

		System.out.println("Codigo del articulo");
		codA=letras.nextLine();

		System.out.println("Nombre del articulo");
		nombreA=letras.nextLine();

		System.out.println("Descripción del articulo");
		descA=letras.nextLine();

		System.out.println("Precio del articulo");
		precioA=dobles.nextDouble();

		ivaA=precioA*0.21;



		System.out.println("Unidades del articulo");
		unidadesD=numeros.nextInt();

		Articulos Articulo=new Articulos(codA, nombreA, descA, precioA,ivaA, provedorA ,unidadesD);


		return Articulo;

	}

	public static Proveedores altaProv() {

		String codP="";
		String nombreP="";
		String direcP="";
		String f_Alta;
		String telP="";
		String correo="";

		System.out.println("Codigo del proveedor");
		codP=letras.nextLine();

		System.out.println("Nombre del proveedor");
		nombreP=letras.nextLine();

		System.out.println("Direccion del proveedor");
		direcP=letras.nextLine();

		System.out.println("Fecha de alta del proveedor");
		f_Alta=letras.nextLine();

		System.out.println("Telefono del proveedor");
		telP=letras.nextLine();

		System.out.println("Correo del proveedor");
		correo=letras.nextLine();


		Proveedores Prov=new Proveedores(codP, nombreP, direcP, f_Alta,telP, correo);


		return Prov;

	}

	public static Ventas venta(Articulos art) {
		boolean paga;
		String pagas="";
		String f_Compra="";
		int uni=0;
		double pT=0.0;


		System.out.println("Cuantas unidades compras");
		uni=numeros.nextInt();

		//Restamos 1 en unidades del objeto al cual nos estamos refiriendo
		art.setUnidadesDispo(art.getUnidadesDispo() - uni);

		pT=art.getPrecioArticulo()*0.21;


		System.out.println("Introduce la fecha de compra");
		f_Compra=letras.nextLine();


		System.out.println("");


		System.out.println("Ha pagado? S/N");
		pagas=letras.nextLine();
		if (pagas.equalsIgnoreCase("S")) {
			paga=true;
		} else {
			paga=false;
		}






		Ventas operacion= new Ventas(art,f_Compra, uni, pT,paga);


		return operacion;
	}



}


