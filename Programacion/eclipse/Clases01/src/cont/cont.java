package cont;

public class cont {
	 private int conta;
	 //constructor por defecto
	 public cont() {
	 }
	 //constructor con parámetros
	 public cont(int conta) {
	 if (conta < 0) {
	 this.conta = 0;
	 } else {
	 this.conta = conta;
	 }
	 }
	 //constructor copia
	 public cont(final cont c) {
	 conta = c.conta;
	 }
	 //getter
	 public int getCont() {
	 return conta;
	 }
	 //setter
	 public void setCont(int conta) {
	 if (conta < 0) {
	 this.conta = 0;
	 } else {
	 this.conta = conta;
	 }
	 }
	 //método incrementar contador
	 public void incrementar() {
	 conta++;
	 }
	 //método decrementar contador
	 public void decrementar() {
	 conta--;
	 if (conta < 0) {
	 conta = 0;
	 }
	 }
	}
