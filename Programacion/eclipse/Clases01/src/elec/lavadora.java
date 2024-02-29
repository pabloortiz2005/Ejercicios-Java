package elec;


    public class lavadora extends electrodomestico {
        private int carga;

        private final int cargaD = 5;

        public lavadora() {
            super();
            this.carga = cargaD;
        }

        public lavadora(int precioBase, int peso) {
            super(peso,precioBase);
            this.carga = cargaD;
        }

        public lavadora(int precioBase,int peso, int carga, String color, char consumoEnergetico) {
            super(precioBase, color, consumoEnergetico, peso);
            this.carga = carga;
        }



        public int getCarga() {
            return carga;
        }

        public void setCarga(int carga) {
            this.carga = carga;
        }

        public int getCargaDefecto() {
            return cargaD;
        }

        @Override
        public int precioFinal() {
            int precioFinal=super.precioFinal();
            if(carga>30) {
                precioFinal += 50;

            }
            return precioFinal;


        }


    }