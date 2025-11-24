package prjAula1;

import java.util.Scanner;
public class Variavel {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		int valorA, valorB, variavel;
		
		System.out.println("Digite o valorA: ");
		valorA = in.nextInt();
		
		System.out.println("Digite o valorB: ");
		valorB = in.nextInt();
		
		variavel = variavel = valorA;
		
		valorA = valorA = valorB;
		
		valorB= valorB = variavel;
			
		System.out.println("Seu valorA é "+valorA);
		
		System.out.println("Seu valorB é "+valorB);
		
    	}
  }

