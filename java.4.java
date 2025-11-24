package prjAula1;

import java.util.Scanner;
public class CalculoAresta {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		double aresta, volume; 
		
		System.out.println("Digite o valor da aresta: ");
		aresta = in.nextDouble();
		
		volume = aresta * aresta * aresta;
				
		System.out.println("O volume é: "+volume);
		
	}
}