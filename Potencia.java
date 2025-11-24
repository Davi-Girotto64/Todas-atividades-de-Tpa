

    package prjAula1;

import java.util.Scanner;
public class Potencia {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		int b, e, p=1, i=1;
		
		System.out.println("Digite a base desejada:");
		b = in.nextInt();
		
		System.out.println("Digite o expoente desejado:");
		e = in.nextInt();
		
		do {
			p = p * b;
			i++;
		}while (i<=e);
		System.out.println("A potência de " +b +"^" +e +" é "+p );	
	}
}
