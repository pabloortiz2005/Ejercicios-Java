package examen;



public class Articulos {


	private String codArticulo;
	private String nombreArticulo;
	private String descArticulo;
	private double precioArticulo;
	private double ivaAplicado;
	private String provedorArticulo;
	private int unidadesDispo;


	//Constructor con todo debido a que un almacen no necesita guardar articulos de los cuales faltan información
	public Articulos(String codArticulo, String nombreArticulo, String descArticulo, double precioArticulo,
			double ivaAplicado, String provedorArticulo, int unidadesDispo) {

		this.codArticulo = codArticulo;
		this.nombreArticulo = nombreArticulo;
		this.descArticulo = descArticulo;
		this.precioArticulo = precioArticulo;
		this.ivaAplicado = ivaAplicado;
		this.provedorArticulo = provedorArticulo;
		this.unidadesDispo = unidadesDispo;
	}


	public String getCodArticulo() {
		return codArticulo;
	}


	public void setCodArticulo(String codArticulo) {
		this.codArticulo = codArticulo;
	}


	public String getNombreArticulo() {
		return nombreArticulo;
	}


	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}


	public String getDescArticulo() {
		return descArticulo;
	}


	public void setDescArticulo(String descArticulo) {
		this.descArticulo = descArticulo;
	}


	public double getPrecioArticulo() {
		return precioArticulo;
	}


	public void setPrecioArticulo(double precioArticulo) {
		this.precioArticulo = precioArticulo;
	}


	public double getIvaAplicado() {
		return ivaAplicado;
	}


	public void setIvaAplicado(double ivaAplicado) {
		this.ivaAplicado = ivaAplicado;
	}


	public String getProvedorArticulo() {
		return provedorArticulo;
	}


	public void setProvedorArticulo(String provedorArticulo) {
		this.provedorArticulo = provedorArticulo;
	}


	public int getUnidadesDispo() {
		return unidadesDispo;
	}


	public void setUnidadesDispo(int unidadesDispo) {
		this.unidadesDispo = unidadesDispo;
	}


	@Override
	public String toString() {
		return "Articulos [codArticulo=" + codArticulo + ", nombreArticulo=" + nombreArticulo + ", descArticulo="
				+ descArticulo + ", precioArticulo=" + precioArticulo + ", ivaAplicado=" + ivaAplicado
				+ ", provedorArticulo=" + provedorArticulo + ", unidadesDispo=" + unidadesDispo + "]";
	}










}
