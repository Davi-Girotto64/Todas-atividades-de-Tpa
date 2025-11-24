package prjAula1;

import java.util.Scanner;
public class NumerosPares {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		int i=1,n=2;
		
		System.out.print("Os números pares são: "+i);
		
		do {
			n = i + i;
			i++;
			System.out.print(","+n);
		}while (i<=250);
	}
}