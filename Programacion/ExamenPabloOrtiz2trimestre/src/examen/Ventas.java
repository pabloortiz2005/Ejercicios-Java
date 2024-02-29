package examen;

import java.util.Date;

public class Ventas{
	private Articulos art;
	private String fechaCompra;
	private int unidades;
	private double precioTotal;
	private boolean pagado;



	public Ventas(Articulos art, String fechaCompra, int unidades, double precioTotal, boolean pagado) {
		super();
		this.art = art;
		this.fechaCompra = fechaCompra;
		this.unidades = unidades;
		this.precioTotal = precioTotal;
		this.pagado = pagado;
	}

	public Articulos getArt() {
		return art;
	}

	public void setArt(Articulos art) {
		this.art = art;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}


	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public boolean isPagado() {
		return pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

	@Override
	public String toString() {
		return "Ventas [articulo=" + art + ", fechaCompra=" + fechaCompra + ", unidades=" + unidades + ", precioTotal="
				+ precioTotal + ", pagado=" + pagado + "]";
	}



}
