package prjAula1;

import java.util.Scanner;
public class Idade6 {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		int i=0, idade, maior = 0, menor = 0;
		
		while(i<5) {
			System.out.println("Insira a idade:");
			idade = in.nextInt();
			
			if (idade>=18) {
				maior++;
			}
			else {
				menor++;
			}
			System.out.println("Maiores:"+maior +" e Menores:"+menor );
			i++;
		}		
	}
}