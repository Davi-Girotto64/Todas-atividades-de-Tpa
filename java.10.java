package prjAula1;

import java.util.Scanner;
public class DiaMes {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		int m;
		
		System.out.println("Insira o mês desejado:");
		m = in.nextInt();
		
		switch (m) {
			case 1:
			case 3:
			case 5: 
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("O mês informado tem 31 dias");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("O mês informado tem 30 dias");
				break;
			case 2:
				System.out.println("O mês informado tem 28 dias");
				break;
			default:
				System.out.println("Número invalido");
		}
	}
}