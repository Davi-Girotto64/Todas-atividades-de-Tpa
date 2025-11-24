package prjAula1;

import java.util.Scanner;
public class Laco {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		int i=0, n, r;
		
		System.out.println("Digite o número desejado: ");
		n = in.nextInt();
		
		while (i<=10) {
			r = i * n;
			System.out.println(+n +"X" +i +"=" +r);
			i++;
		}
	}
}