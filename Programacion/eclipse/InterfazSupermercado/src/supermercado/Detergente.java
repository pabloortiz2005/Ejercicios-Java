package supermercado;

public class Detergente implements InterfazDescuento, InterfazLiquido{

	private String Marca;
	private double precio;
	private double volumen;
	private String envase;
	private double descuento;


	//Constructor vacio

	public Detergente() {
		this.setMarca("miColor");
		this.setPrecio(3.89);
		this.setVolumen(0.5);
		this.setTipoEnvase("PET");
		this.setDescuento(0.5);
	}



	//Constructo marca y precio


	public Detergente(String marca, double precio) {

		this.setMarca(marca);
		this.setPrecio(precio);
		this.setVolumen(0.5);
		this.setTipoEnvase("PET");
		this.setDescuento(0.5);

	}


	//constructor con todo
	public Detergente(String marca, double precio, double volumen, String envase, double descuento) {

		this.setMarca(marca);
		this.setPrecio(precio);
		this.setVolumen(volumen);
		this.setTipoEnvase(envase);
		this.setDescuento(descuento);
	}


	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getEnvase() {
		return envase;
	}

	public void setEnvase(String envase) {
		this.envase = envase;
	}

	@Override
	public void setVolumen(double v) {

		this.volumen=v;
	}

	@Override
	public double getVolumen() {

		return this.volumen;
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

		return this.getPrecio()-(this.getPrecio()*this.getDescuento());

	}

	@Override
	public String toString() {
		return "Detergente: Marca=" + this.getMarca() + "\n precio=" + this.getPrecio() + "\n volumen=" + this.getVolumen() + "\n envase=" + this.getTipoEnvase()
		+ "\n descuento=" + this.getDescuento() + "\n precio con descuento=" + this.getPrecioDescuento() + "]";
	}


}
