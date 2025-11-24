package prjAula1;

import java.util.Scanner;
public class Idade3 {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		int anoNasc, anoAtual, idade;
		
		System.out.println("Digite o ano atual: ");
		anoAtual = in.nextInt();
		
		System.out.println("Digite o ano de nascimento: ");
		anoNasc = in.nextInt();
		
		idade = anoAtual - anoNasc ;
		
		System.out.println("Sua idade é: "+idade);
		
		if (idade<10) {
			System.out.println("Se enquadra como Criança");
		}
		else if (idade>=10 && idade<18) {
			System.out.println("Se enquadra como Adolescente");
		}
		else if (idade>=18 && idade<60) {
			System.out.println("Se enquadra como Adulto");
		}
		else {
			System.out.println("Se enquadra como Idoso");
		}
		
	}
}	