package prjAula1;

import java.util.Scanner;
public class Media {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		double n1, n2, media;
		
		System.out.println("Digite a primeira nota: ");
		n1 = in.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		n2 = in.nextDouble();
		
		media = (n1+n2) /2;
		
		System.out.println("A média é: "+media);
		
		if (media<4) {
			System.out.println("Reprovado");
		}
		else if (media<6) {
			System.out.println("Recuperação");
		}
		else {
			System.out.println("Aprovado");
		}
	}
}