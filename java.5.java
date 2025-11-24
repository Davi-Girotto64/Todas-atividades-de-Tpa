package prjAula1;

import java.util.Scanner;
public class CalculoBhaskara {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		double a, b, c, x, x1, x2, delta;
		
		System.out.println("Digite o valor de A: ");
		a = in.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = in.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = in.nextDouble();
		
		delta = (b*b) - 4 * a * c; 
		
		System.out.println("O valor de delta é: "+delta);
		
		if (delta<0) {
			System.out.println("Não existem raizes reais para a equação");
		}
		else if (delta==0) {
			x = -b / (2 * a);
			System.out.println("O valor de x é: "+x);
			System.out.println("Existe apenas uma raiz real para a equação");
		}
		else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
		    x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Existem duas raizes reais para a equação");
			System.out.println("O valor de x1 é: "+x1);
			System.out.println("O valor de x2 é: "+x2);
			
		}
		
	}
}