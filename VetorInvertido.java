package prjAula1;

import java.util.Scanner;
public class VetorInvertido {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 final int TAM=10;
			int a[],b[],i;
		 	int[] A = new int[TAM];
		 	int[] B = new int[TAM];
		 	
		    for (int i=0; i<10; i++) {
		    	System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
		    	A[i] = Scanner.nextInt();
		    }
		    
		    for (int i=0; i<10; i++) {
		    	B[i] = A[9 - i];
		    }
		    
		    System.out.println("Vetor B (invertido):");
		    for (int i=0; i<10; i++) {
		    	System.out.print(B[i] + " ");
		        }
       	} 
}


