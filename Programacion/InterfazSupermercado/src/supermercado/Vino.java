package supermercado;

import java.time.LocalDate;

public class Vino implements InterfazDescuento, InterfazLiquido, InterfazAlimento{

	private String marca;
	private String TipoVino;
	private double gradosAlcohol;
	private double precio;
	private double descuento;
	private String envase;
	private double vol;
	private LocalDate cad;


	public Vino(String marca, String tipoVino, double gradosAlcohol, double precio) {

		this.setMarca(marca);
		this.setPrecio(precio);
		this.setTipoVino(tipoVino);
		this.setGradosAlcohol(gradosAlcohol);
		this.setVolumen(0.5);
		this.setTipoEnvase("PET");
		this.setDescuento(0.2);
		this.setCaducidad(LocalDate.now());
	}



	public Vino(String marca, String tipoVino, double gradosAlcohol, double precio, double descuento,
			String envase, double vol, LocalDate fc) {

		this.setMarca(marca);
		this.setPrecio(precio);
		this.setTipoVino(tipoVino);
		this.setGradosAlcohol(gradosAlcohol);
		this.setVolumen(vol);
		this.setTipoEnvase(envase);
		this.setDescuento(descuento);
		this.setCaducidad(fc);

	}


	public String getMarca() {
		return this.marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getTipoVino() {
		return this.TipoVino;
	}



	public void setTipoVino(String tipoVino) {
		TipoVino = tipoVino;
	}



	public double getGradosAlcohol() {
		return this.gradosAlcohol;
	}



	public void setGradosAlcohol(double gradosAlcohol) {
		this.gradosAlcohol = gradosAlcohol;
	}



	public double getPrecio() {
		return this.precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public int getCalorias() {
		return (int) (this.gradosAlcohol*10);
	}



	@Override
	public void setVolumen(double v) {

		this.vol=v;

	}
	@Override
	public double getVolumen() {

		return this.vol;
	}
	@Override
	public void setTipoEnvase(String env) {

		this.envase=env;
	}
	@Override
	public String getTipoEnvase() {

		return this.envase;
	}
	@Override
	public void setDescuento(double des) {

		this.descuento=des;

	}
	@Override
	public double getDescuento() {

		return this.descuento;
	}
	@Override
	public double getPrecioDescuento() {

		return this.precio-(this.precio*this.descuento);
	}

	@Override
	public void setCaducidad(LocalDate fc) {

		this.cad=fc;

	}



	@Override
	public LocalDate getCaducidad() {
		// TODO Auto-generated method stub
		return this.cad;
	}


	@Override
	public String toString() {
		return "\n Vino: [marca=" + this.getMarca() + "\n TipoVino=" + this.getTipoVino() + "\n gradosAlcohol=" + this.getGradosAlcohol() + "\n precio="
				+ this.getPrecio() + "\n calorias=" + this.getCalorias() + "\n descuento=" + this.getDescuento() + "\n envase=" + this.getTipoEnvase() + "\n vol=" + this.getVolumen()
				+ "Precio total=" + this.getPrecioDescuento() + "\n Fecha caducidad=" + this.getCaducidad() + "]";
	}








}
