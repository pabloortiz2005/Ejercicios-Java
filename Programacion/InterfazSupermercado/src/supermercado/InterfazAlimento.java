package supermercado;

import java.time.LocalDate;

public interface InterfazAlimento {

	public void setCaducidad(LocalDate fc);

	public LocalDate getCaducidad();

	public int getCalorias();

}
