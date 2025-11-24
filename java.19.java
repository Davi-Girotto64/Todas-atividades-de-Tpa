package prjAula1;

import java.util.Scanner;
public class Idade5 {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int idade1, idade2, idade3, idade4, idade5, maior = 0, menor = 0, porcentagemMaior, porcentagemMenor, total;
		
		System.out.println("Insira a primeira idade: ");
		idade1 = in.nextInt();
		
		System.out.println("Insira a segunda idade: ");
		idade2 = in.nextInt();
		
		System.out.println("Insira a terceira idade: ");
		idade3 = in.nextInt();
		
		System.out.println("Insira a quarta idade: ");
		idade4 = in.nextInt();
		
		System.out.println("Insira a quinta idade: ");
		idade5 = in.nextInt();
		
		if (idade1>=18) {
			maior = maior + 1;
		}else {
			menor = menor + 1;
		}
		
		if (idade2>=18) {
			maior = maior + 1;
		}else {
			menor = menor + 1;
		}
		
		if (idade3>=18) {
			
			maior = maior + 1;
		}else {
			menor = menor + 1;
		}
		
		if (idade4>=18) {
			maior = maior + 1;
		}else {
			menor = menor + 1;
		}
		
		if (idade5>=18) {
			maior = maior + 1;
		}else {
			menor = menor + 1;
		}
		
		total = maior + menor;
		
		porcentagemMaior = (maior * 100) /total;
		
		porcentagemMenor = (menor * 100) /total;
		
		System.out.println("A quantidade de maiores e menores são: "+maior +" maiores e "+menor +" menores");
		System.out.println("A porcentagem de maiores e menores são: "+porcentagemMaior +"% e "+porcentagemMenor +"%");
	}
} 