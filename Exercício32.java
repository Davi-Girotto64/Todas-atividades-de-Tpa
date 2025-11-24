package prjAula1;

import java.util.Scanner;

public class Exercicio32{
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		double a, b, c, menor, meio, maior;
		
		System.out.println("Insira o valor de A: ");
		a = in.nextDouble();
		
		System.out.println("Insira o valor de B: ");
		b = in.nextDouble();
		
		System.out.println("Insira o valor de C: ");
		c = in.nextDouble();
		
		if (a <= b && a <= c) {
            menor = a;
            
            if (b <= c) {
                meio = b;
                maior = c;
            } else {
                meio = c;
                maior = b;
            }
        } else if (b <= a && b <= c) {
            menor = b;
            
            if (a <= c) {
                meio = a;
                maior = c;
            } else {
                meio = c;
                maior = a;
            }
        } else {
            menor = c;
            
            if (a <= b) {
                meio = a;
                maior = b;
            } else {
                meio = b;
                maior = a;
            }
        }
		System.out.println("Os valores em ordem crescente são: " +menor + ", " +meio + ", " +maior);
	}
}