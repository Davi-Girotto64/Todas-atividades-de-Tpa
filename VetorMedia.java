package prjAula1;

import java.util.Scanner;
public class VetorMedia {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);	 
		 final int TAM = 10;
	        int[] a = new int[TAM];
	        int soma = 0;

	        for (int i=0; i<TAM; i++) {
	            System.out.print("Digite o " + (i + 1) + "º valor do vetor A: ");
	            a[i] = in.nextInt();
	            soma = soma + a[i];
	        }

	        double media = soma / 10.0;

	        System.out.println("\nValores do vetor A:");
	        for (int i=0; i<TAM; i++) {
	            System.out.print(a[i] + " ");
	        }
	        System.out.println("\n\nA média dos valores é: " +media);
	    }
	}

    
}