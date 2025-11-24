package prjAula1;

import java.util.Scanner;
public class Media2 {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		double n1, n2, media, exame, medianova;
	
		System.out.println("Digite a primeira nota: ");
		n1 = in.nextDouble();		
			
		System.out.println("Digite a segunda nota: ");
		n2 = in.nextDouble();
	
		media = (n1 + n2) /2;
	
		System.out.println("A média é "+media);
	
		if (media<3) {
			System.out.println("Reprovado");
		}
		else if (media>=6) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Atualmente em exame");
		
			System.out.println("Insira a nota do exame: ");
			exame = in.nextDouble();
	
			medianova = (media+exame)/2;
	
			if (medianova>=6) {
				System.out.println("Aprovado");
			}
			else {
				System.out.println("Reprovado");
			}
		}
	}		
} 