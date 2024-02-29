package juego;

public class juego2 {

	   private int vidas;
       private int vidasi;
       private int record;

     //constructor


       public juego2(int vidas) {

           this.vidas=vidas ;
           this.vidasi=this.vidasi;
           

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
           
           public boolean RestarVida() {
           	vidas--;
           	
           	if(this.vidasi==0) {
           		System.out.println("Has perdido");
           		return false;
           	}
           	return true;
           	
           }
           
           //reiniciar
           public void Reinicio() {
        	   this.vidasi=vidasi;
           }
           
           
           public void ActualizarRecord() {
        	   if(this.vidasi==record) {
        		   System.out.println("Se a alcanzado el record");
        		   
        	   }else if(this.vidas>record) {
        		   record=this.vidas;
        		   System.out.println("Se a superado el record, es : " + record);
        	   }
           }
}
          

   		
           
