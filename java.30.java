package prjAula1;

import java.util.Scanner;
public class NumeroDias {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		int dias, anos, meses;
		
		System.out.println("Digite a quantidade de dias desejado: ");
		dias = in.nextInt();
		
		meses = dias/30;
		 
		anos = meses/12;
		
		anos = dias/365;
		
		System.out.println("Os dias convertidos em meses: "+meses);
		
		System.out.println("Os dias convertidos em anos: "+anos);
		
	}
}