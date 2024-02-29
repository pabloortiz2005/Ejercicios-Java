package juego;


public class juego {


            
            private  int vidas;

  
    //constructor


    public juego(int ini) {

        this.vidas=ini ;
        

    }

    
    //setters


        public void setVidasRestantes(int vidas) {
            this.vidas= vidas ;

        }

    // getters 

    
        
        public static int getVidasRestantes(int vidas) {
            return vidas ;
        }

    // imprimir 

        public void muestraVidasRestantes() {
           
       
         
            System.out.println("Te quedan :" + this.vidas + " vidas");
        }

     //restar vida
        
        public void RestarVida() {
        	vidas--;
        }
       

		
        
}