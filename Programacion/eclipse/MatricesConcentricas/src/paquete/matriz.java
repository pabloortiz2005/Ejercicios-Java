package paquete;

import java.util.Scanner;

	public class matriz {
	    public static void main(String[] args) {
	        Scanner leer = new Scanner(System.in);

	        System.out.print("Ingrese el tamaño de la matriz (n x n): ");
	        int n = leer.nextInt();
	        boolean sol = true;
	        int[][] matrix = new int[n][n];

	        
	        //Se introduce la matriz por filas introduciendo un espacio entre los numeros.
	       
	        System.out.println("Ingrese los elementos de la matriz por filas: (Deja un espacio entre los numeros)");
	       
	        for (int fila = 0; fila < n; fila++) {
	            for (int columna = 0; columna < n; columna++) {
	                matrix[fila][columna] = leer.nextInt();
	            }
	        }
	        // El numero de anillos es n / 2 ya que la mitad del tamañano de la matriz es su numero de anillos
	        
	        for (int anillo = 0; anillo < n / 2; anillo++) { 
	        	
	        	//Lee en diagonal el principio de cada anillo, GRACIAS MATRIZ ESPIRAL
	        	//Para hacer despues la comparación
	            int z = matrix[anillo][anillo]; 

	           
	            // bucle para leer posiciones dentro de cada anillo
	            
	            for (int i = anillo; i < n - anillo; i++) {
	            	
	            	
	            	//se comprueba si todos los numeros del anillo son iguales
	            	
	            	/*
	            	 Comparaciones:
	            	 
	            	 1. columna arriba del anillo
	            	 2. fila arriba del anillo -
	            	 3. columna derecha del anillo -
	            	 4. fila abajo del anillo -
	            	 
	            	 */
	            	
	            	
	                if (matrix[anillo][i] != z || matrix[i][anillo] != z || matrix[n - anillo - 1][i] != z || matrix[i][n - anillo - 1] != z) {
	                    sol=false;
	                } 
	            }
	        }
	        
	        // Imprimimos la solucion

	        if (sol==true) {
	            System.out.println("La matriz es concéntrica.");
	        } else {
	            System.out.println("La matriz no es concéntrica.");
	        }
	    

	   
	        
	        
	    
	        
	    }
	}