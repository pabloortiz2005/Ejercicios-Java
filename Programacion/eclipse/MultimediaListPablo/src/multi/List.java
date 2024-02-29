package multi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class List extends multi{

	private ArrayList<multi> lista;
	private int cap;
	private int cont;

	public List(int multi) {
		this.cap=cap;
		this.lista=new ArrayList<multi>();
		this.cont=0;

	}

	public int size() {
		return cont;
	}

	public boolean add(multi m) {
		if(cont<cap) {
			lista.add(m);
			cont++;
			return true;
		}else {
			return false;
		}
	}

	public multi get(int pos) {

		return lista.get(pos);

	}




	@Override
	public String toString() {
		return "List [lista=" + lista + ", cap=" + cap + ", cont=" + cont + "]";
	}

	public int indexOf(Pelicula peli) {

		Iterator <multi> it = lista.iterator();

		while(it.hasNext()) {
			if(it.next().equals(peli)) {
				return lista.indexOf(peli);
			}
		}
		return -1;

	}

	public int indexOf(Disc disco) {

		Iterator <multi> it2 = lista.iterator();

		while(it2.hasNext()) {
			if(it2.next().equals(disco)) {
				return lista.indexOf(disco);
			}
		}
		return -1;

	}
}


