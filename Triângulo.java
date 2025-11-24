package prjAula1;

import java.util.Scanner;
public class Triângulo {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		double a, b, c;
		
		System.out.println("Insira o valor de A: ");
		a = in.nextDouble();
		
		System.out.println("Insira o valor de B: ");
		b = in.nextDouble();
		
		System.out.println("Insira o valor de C: ");
		c = in.nextDouble();
		
		if (a >= b + c || b >= a + c || c >= a + b) {
			System.out.println("Isso não forma um triângulo");
		}
		else if(a==b && b==c) { 
			System.out.println("O Triângulo é Equilátero: Três lados iguais");
		}	
		else if (a != b && b != c && a != c) {
			System.out.println("O Triângulo é Escaleno: Três lados diferentes");
		}	
		else {
			System.out.println("O Triângulo é Isósceles: Dois lados iguais e um lado diferente");
		}
		
	}
    
}