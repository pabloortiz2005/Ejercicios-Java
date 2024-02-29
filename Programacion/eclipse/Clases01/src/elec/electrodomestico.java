package elec;

public class electrodomestico {
	private int pBase;
	private String color;
	private char cElectrico;
	private int peso;
	
	private final int pBaseD=100;
	private final String colorD="blanco";
	private final char cElectricoD='f';
	private final int pesoD=5;
	
	
	
	public electrodomestico() {
		this.color= colorD;
		this.cElectrico= cElectricoD;
		this.pBase= pBaseD;
		this.peso= pesoD;
	}
	
	public electrodomestico(int pBase, int peso) {
		this.color= getColor();
		this.cElectrico= getcElectrico();
		this.pBase= pBaseD;
		this.peso= pesoD;
	}
	
	public electrodomestico(int pBase,  String color, char cElectrico,int peso) {
		this.color= color;
		this.cElectrico= cElectrico;
		this.pBase= pBase;
		this.peso= peso;
	}
	
	
	
	
	public int getPBase() {
        return pBase;
    }

    public void setPBase(int precioBase) {
        this.pBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getcElectrico() {
        return cElectrico;
    }

    public void cElectrico(char cElectrico) {
        this.cElectrico = cElectrico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPBaseD() {
        return pBaseD;
    }

    public String getColorD() {
        return colorD;
    }

    public char getcElectricoD() {
        return cElectricoD;
    }

    public int getPesoD() {
        return pesoD;
    }
    public String comprobarColor(String color) {

        String[] colores = { "blanco", "negro", "rojo", "azul", "gris" };

        for (int i = 0; i < colores.length; i++) {
            if (colores[i].equalsIgnoreCase(color)) {
                return colores[i];
            }
        }
        return "Tu color sera Blanco";

    }
public int precioFinal() {

        int precioFinal=pBase;
        switch (cElectrico) {
        case 'A':
            precioFinal += 100;
            break;

        case 'B':
            precioFinal += 80;
            break;

        case 'C':
            precioFinal += 60;
            break;

        case 'D':
            precioFinal += 50;
            break;

        case 'E':
            precioFinal += 30;
            break;

        case 'F':
            precioFinal += 10;
            break;
            /*
        default:
        	System.out.println("F");
        	*/
        }
        if(peso >=0 && peso <=19) {
            precioFinal +=10;
        }else if(peso >=20 && peso <=49) {
            precioFinal +=50;
        }else if(peso >=50 && peso <=79) {
            precioFinal +=80;
        }else if(peso >=80) {
            precioFinal +=100;
        }

        return precioFinal;
    }

public char comprobarcElectrico(char cElectrico) {

    char[] cElectric = { 'A','B','C','D','E','F','a','b','c','d','e','f'};

    for (int i = 0; i < cElectric.length; i++) {
        if (cElectric[i]==cElectrico) {
            return cElectric[i];
        }
    }
    return 'F';

}


}
