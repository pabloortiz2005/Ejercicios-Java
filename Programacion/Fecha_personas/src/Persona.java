
public class Persona {
	private String nombre;
	private String apellido;
	private String Dni;
	private Fecha Fecha_nac;
	private double altura;
	private int telefono;
	
	public Persona() {
		
	}

	public Persona(String nombre, String apellido, String dni, Fecha fecha_nac, double altura, int telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		Dni = dni;
		Fecha_nac = fecha_nac;
		this.altura = altura;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return Dni;
	}

	public void setDni(String dni) {
		Dni = dni;
	}

	public Fecha getFecha_nac() {
		return Fecha_nac;
	}

	public void setFecha_nac(Fecha fecha_nac) {
		Fecha_nac = fecha_nac;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	
	
	
}
