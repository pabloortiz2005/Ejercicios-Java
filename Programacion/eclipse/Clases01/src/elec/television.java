package elec;


	public class television extends electrodomestico{

	    private double pulgadas;
	    private boolean sTDT;
	    private final double pulgadasD=20;
	    private final boolean sTDTD=false;

	    public television() {
	        super();
	        this.pulgadas=pulgadasD;
	        this.sTDT=sTDTD;
	    }

	    public television(int precioBase, int peso) {
	        super(precioBase,peso);
	        this.pulgadas=pulgadasD;
	        this.sTDT=sTDTD;
	    }


	    public television(int precioBase, String color, char consumoEnergetico, int peso, int pulgadas, boolean sTDT) {
	        super(precioBase,color,consumoEnergetico,peso);
	        this.pulgadas=pulgadas;
	        this.sTDT=sTDT;
	    }

	    public double getPulgadas() {
	        return pulgadas;
	    }

	    public boolean getsTDT() {
	        return sTDT;
	    }



	    @Override
	    public int precioFinal() {
	        int precioFinal=super.precioFinal();
	        if(pulgadas>40) {
	            precioFinal *=1.3;
	        }
	        if(sTDT==true) {
	            precioFinal += 50;

	        }
	        return precioFinal;
	    }
}
