package prjAula1;

import java.util.Scanner;

public class Pr34 {
    public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		double preco, pix, cc;
		
		System.out.println("Digite o preço: ");
		preco = in.nextDouble();
		
		pix = preco * 10/100;
		
		cc = preco + (preco * 5/100);
		
		System.out.println("O desconto no pix fica: "+pix);
		
		System.out.println("O acréscimo no cartão de crédito fica: "+cc);
		
	}
}
