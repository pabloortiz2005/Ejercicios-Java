package multi;

import java.util.Arrays;

public class List extends multi{

	private multi [] lista;
	private int cap;
	private int cont;
	
	public List(int multi) {
		this.cap=cap;
		this.lista=new multi[cap];
		this.cont=0;
	}
	
	public int size() {
		return cont;
	}
	
	public boolean add(multi m) {
		if(cont<cap) {
			lista[cont]= m;
			cont++;
			return true;
		}else {
			return false;
		}
	}
	
	public multi get(int pos) {
		
		return lista[pos];
		
	}
	
	public int indexOf(multi m) {
		
		for (int i=0; i<cap; i++) {
		if(lista[i].equals(m)) {
			return i;
		}
	}
		return -1;
}

	@Override
	public String toString() {
		return "List [lista=" + Arrays.toString(lista) + ", capacidad=" + cap + ", contador="
				+ cont + "]";
	}
	
	
	
}


