package multi;

public class multi2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List miLista2= new List(10);
		Disc Disco= new Disc ("Savior","Green day",Formato.mp3,180,Genero.pop);
		Disc Disco2= new Disc ();
		Disc Disco3= new Disc ();
		miLista2.add(Disco);
		miLista2.add(Disco2);
		miLista2.add(Disco3);
		System.out.println("Posicion " + miLista2.indexOf(Disco));
		System.out.println(Disco.toString());
	
	}
}
