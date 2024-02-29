package examen;

import java.util.Date;

public class Proveedores {
	private String codProv;
	private String nombreProv;
	private String direcProv;
	private String fechaAlta;
	private String telProv;
	private String correoProv;


	//Constructor con todo ya que necesitaremos toda la informacion del proveedor
	public Proveedores(String codProv, String nombreProv, String direcProv, String fechaAlta, String telProv,
			String correoProv) {
		this.codProv = codProv;
		this.nombreProv = nombreProv;
		this.direcProv = direcProv;
		this.fechaAlta = fechaAlta;
		this.telProv = telProv;
		this.correoProv = correoProv;
	}


	public String getCodProv() {
		return codProv;
	}


	public void setCodProv(String codProv) {
		this.codProv = codProv;
	}


	public String getNombreProv() {
		return nombreProv;
	}


	public void setNombreProv(String nombreProv) {
		this.nombreProv = nombreProv;
	}


	public String getDirecProv() {
		return direcProv;
	}


	public void setDirecProv(String direcProv) {
		this.direcProv = direcProv;
	}


	public String getFechaAlta() {
		return fechaAlta;
	}


	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}


	public String getTelProv() {
		return telProv;
	}


	public void setTelProv(String telProv) {
		this.telProv = telProv;
	}


	public String getCorreoProv() {
		return correoProv;
	}


	public void setCorreoProv(String correoProv) {
		this.correoProv = correoProv;
	}


	@Override
	public String toString() {
		return "Proveedores [codProv=" + codProv + ", nombreProv=" + nombreProv + ", direcProv=" + direcProv
				+ ", fechaAlta=" + fechaAlta + ", telProv=" + telProv + ", correoProv=" + correoProv + "]";
	}




}
