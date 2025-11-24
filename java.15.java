package prjAula1;

import java.util.Scanner;
public class Idade {
	public static void main (String args []) {
		Scanner in = new Scanner(System.in);
		int anoNasc, anoAtual, idade;
		
		System.out.println("Digite o ano atual: ");
		anoAtual = in.nextInt();
		
		System.out.println("Digite o ano de nascimento: ");
		anoNasc = in.nextInt();
		
		idade = anoAtual - anoNasc;
		
		System.out.println("Sua idade é "+idade);
		
	}
}
