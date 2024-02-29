package entornos;

import java.util.Scanner;

public class Entornos {

	private int m1 [][];
	private int m2 [][];

	public Entornos(int F1, int C1, int F2, int C2) {

		m1= new int [F1][C1];
		m2= new int [F2][C2];
	}
			
	public void rm1(Scanner escaner) {
		        //3      4       5
		for(int i=0;i<m1.length;i++) {
			        //6      7       8
			for(int j=0;j<m1[i].length;j++) {
				System.out.println("Introduce el numero de la posicion para la matriz 1 " + (i+1) + "," + (j+1)); //9
				m1[i][j]=escaner.nextInt();//10
			}	
		}
	}

	public void rm2(Scanner escaner) {
		        //12      13     14
		for(int i=0;i<m2.length;i++) {
					//15   16           17
			for(int j=0;j<m2[i].length;j++) {
				System.out.println("Introduce el numero de la posicion para la matriz 2 " + (i+1) + "," + (j+1));//18
				m2[i][j]=escaner.nextInt();///18
			}	
		}
	}

	public void im1(Scanner escaner) {
				//40   41        42
		for(int i=0;i<m1.length;i++) {
			//     43        44         45
			for(int j=0;j<m1[i].length;j++) {
				System.out.print(m1[i][j] + " , ");//46
			}
			System.out.println();//47
		}
	}

	public void im2(Scanner escaner) {
		//    50       51        52
		for(int i=0;i<m2.length;i++) {
			//  53          54         55
			for(int j=0;j<m2[i].length;j++) {
				System.out.print(m2[i][j] + " , ");//56
			}
			System.out.println();//57
		}
	}

	public boolean comp() { 
		         //20                            //21
		if(m1.length==m2.length && m1[0].length==m2[0].length) {
			return true; //22
		}else {
			return false;//24
		}

	}

	public boolean igual() {
		if(!comp()) {//25
			return false;//26
		}
			//27     28         29
		for(int i=0;i<m1.length;i++) {
			//   30         31          32
			for(int j=0;j<m1[i].length;j++) {
						//33
				if(m1[i][j] != m2[i][j]) {
					return false; // 34
				}
			}

		}
		return true; //35

	}

}
