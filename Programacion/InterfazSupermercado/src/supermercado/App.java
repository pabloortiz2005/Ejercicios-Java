package supermercado;

import java.nio.file.spi.FileSystemProvider;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class App {

	public static void main(String[] args) {




		ArrayList<InterfazAlimento> Alimentos = new ArrayList<>();
		ArrayList<InterfazLiquido> liquidos = new ArrayList<>();
		
		//Cereales
		Cereal kellogs= new Cereal ("Kellogs", TipoCereal.maiz, 2.25, LocalDate.now());
		Cereal CornFlakes= new Cereal ("CornFlakes", TipoCereal.maiz, 2.25, LocalDate.now());

		//Vinos
		Vino tomelloso = new Vino("Tomelloso", "Rioja", 7.40, 6.65, 0.2, "Cristal", 0.75, LocalDate.now());
		Vino Barbadillo = new Vino("Tomelloso", "Blanco", 8.40, 8.65, 0, "Cristal", 0.75, LocalDate.now());

		//Detergentes 
		
		Detergente WippExpress = new Detergente("WippExpress", 6, 5, "PET", 0);
		Detergente Ariel = new Detergente("Ariel", 7, 4.5, "PET", 0.3);


		Alimentos.add(kellogs);
		Alimentos.add(CornFlakes);
		Alimentos.add(tomelloso);
		Alimentos.add(Barbadillo);
		
		liquidos.add(WippExpress);
		liquidos.add(Ariel);
		liquidos.add(tomelloso);
		liquidos.add(Barbadillo);


		int calTotales=0;
		
		for (InterfazAlimento a :Alimentos) {
			calTotales+=a.getCalorias();
			
		}
		
		
		double volTotal=0.0;
		System.out.println("Calorias totales: " + calTotales);
		
		for (InterfazLiquido b :liquidos) {
			volTotal+=b.getVolumen();
			
		}
		System.out.println("Volumen total: " + volTotal);
		
		
		
		System.out.println("Volumen detergente Ariel: " + Ariel.getVolumen());
		
		System.out.println("Cereales: " + kellogs.getMarca() + " caducan en: " + kellogs.getCaducidad());
		
		System.out.println("Vino " + Barbadillo.getMarca() + " de tipo: " + Barbadillo.getTipoVino());
		
		
		LocalDate fecha = LocalDate.of(2024, 2, 14);
		
		System.out.println("Fecha: " + fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear());
	}

}
