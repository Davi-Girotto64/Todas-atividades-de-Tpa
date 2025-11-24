package prjAula1;

import java.util.Scanner;
public class Festa {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		double homem, mulher, salgado, refrigerante, bolo;
		
		System.out.println("Digite a quantidade de homens: ");
		homem = in.nextDouble();
		
		System.out.println("Digite a quantidade de mulheres: ");
		mulher = in.nextDouble();
		
		salgado = (mulher * 6) + (homem * 10);
		
		refrigerante = (homem * 800) / 1000 + (mulher * 600) / 1000;
		
		bolo =  (homem + mulher * 100) /1000;
		
		System.out.println("A quantidade de bolos necessários é: "+bolo);
		
		System.out.println("A quantidade de salgados necessários é: "+salgado);
		
		System.out.println("A quantidade de refrigerantes necessários é: "+refrigerante);
		
	}
}
