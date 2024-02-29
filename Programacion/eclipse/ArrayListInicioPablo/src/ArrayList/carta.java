package ArrayList;

import java.util.Objects;

public class carta implements Comparable<carta>{

	private String palos;
	private String num;



	public carta(String palos, String num) {

		this.palos = palos;
		this.num = num;
	}


	public String getPalos() {
		return palos;
	}


	public void setPalos(String palos) {
		this.palos = palos;
	}


	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	private int oValor(String num) {
		switch(num) {

		case "As":
			return 1;
		case "Sota":
			return 8;
		case "Caballo":
			return 9;
		case "Rey":
			return 10;
		default:
			return Integer.parseInt(num);
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(num, palos);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		carta other = (carta) obj;
		return Objects.equals(num, other.num) && Objects.equals(palos, other.palos);
	}


	@Override
	public int compareTo(carta o) {

		if(this.palos==o.getPalos()) {
			return oValor(this.num)-oValor(o.getNum());

		} else {
			return this.palos.compareTo(o.getPalos());
		}

	}


	@Override
	public String toString() {
		return num + " de " + palos;
	}
	
	

}
