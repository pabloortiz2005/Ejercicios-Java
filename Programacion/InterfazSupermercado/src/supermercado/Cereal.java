package supermercado;

import java.time.LocalDate;

public class Cereal implements InterfazAlimento {

	private String marca;
	private TipoCereal tCereal;
	private double precio;
	private LocalDate cad;


	public Cereal(String marca, TipoCereal tCereal, double precio) {

		this.setMarca(marca);
		this.settCereal(tCereal);
		this.setPrecio(precio);
		this.setCaducidad(LocalDate.now());
	}




	public Cereal(String marca, TipoCereal tCereal, double precio, LocalDate cad) {

		this.setMarca(marca);
		this.settCereal(tCereal);
		this.setPrecio(precio);
		this.setCaducidad(cad);
	}


	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public TipoCereal gettCereal() {
		return tCereal;
	}
	public void settCereal(TipoCereal tCereal) {
		this.tCereal = tCereal;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public int getCalorias() {

		if (this.gettCereal().equals("espelta")) {

			return 5;

		} else if(this.gettCereal().equals("maiz")) {

			return 8;

		} else if(this.gettCereal().equals("trigo")) {

			return 12;

		} else {

			return 15;
		}

	}

	@Override
	public void setCaducidad(LocalDate fc) {
		// TODO Auto-generated method stub
		this.cad=fc;
	}



	@Override
	public LocalDate getCaducidad() {
		// TODO Auto-generated method stub
		return this.cad;
	}


	@Override
	public String toString() {
		return "Cereal [marca=" + this.getMarca() + ", tCereal=" + this.gettCereal() + ", precio=" + this.getPrecio() + ", calorias=" + this.getCalorias()
		+ ", cad=" + this.getCalorias() + "]";
	}


}
