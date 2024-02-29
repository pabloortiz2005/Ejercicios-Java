package elec;

public class MAIN {

	public static void main(String[] args) {
        // TODO Auto-generated method stub

        double total=0;
        double totalTV=0;
        double totalLavadora=0;
        electrodomestico[ ] E = new electrodomestico[10];

        E[0]  = new lavadora();
        E[1]  = new lavadora(100,20,40,"rojo",'B');
        E[2]  = new lavadora(100, 40);
        E[3]  = new television();
        E[4]  = new television(800,"negro",'E',42,35, false);
        E[5]  = new television(700, 12);
        E[6]  = new electrodomestico();
        E[7]  = new electrodomestico(350,"rojo", 'C', 17);
        E[8]  = new electrodomestico(320, 6);
        E[9]  = new electrodomestico(120,"azul", 'A', 60);

        for (int i=0;i<E.length;i++) {
            try {
                if (((Object)E[i]).getClass().getSimpleName().equals("electrodomestico")) {
                    total+=E[i].precioFinal();


                }else if (((Object)E[i]).getClass().getSimpleName().equals("lavadora")) {
                    totalLavadora+=E[i].precioFinal();

                }else {
                    totalTV+=E[i].precioFinal();

                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        System.out.println("Precio total de los electrodomesticos: "+ total +" euros");
        System.out.println("Precio total de las lavadoras: "+ totalLavadora +" euros");
        System.out.println("Precio total de las televisiones: "+ totalTV +" euros");

        System.out.println();

        // Comprobamos si el metodo comprobar color funciona perfectamente.
        electrodomestico Electrodomestico = new electrodomestico(200, "verde", 'A', 15);
        String colorVerificado = Electrodomestico.comprobarColor(Electrodomestico.getColor());
        System.out.println("Color verificado: " + colorVerificado);


    }
}