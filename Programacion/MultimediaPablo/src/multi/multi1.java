package multi;

public class multi1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List miLista=new List(10);
		Pelicula Pelicula1=new Pelicula("Avatar","James Cameron",Formato.dvd,180,"Robien Heart", null);
		Pelicula Pelicula2=new Pelicula();
		Pelicula Pelicula3=new Pelicula();
		miLista.add(Pelicula1);
		miLista.add(Pelicula2);
		miLista.add(Pelicula3);
		
		System.out.println("Posicion " + miLista.indexOf(Pelicula1));
		System.out.println(Pelicula1.toString());
	}

}
