package prjAula1;

import java.util.Scanner;
public class Idade7 {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		double p=1.45, j=1.34, id1=0.025, id2=0.02;
		int i = 0;
		do {
			j = j + id1;
			p = p + id2;
			i++;
		}while (j<=p);
		System.out.println("João fica maior que pedro em: "+i +" anos");
	}
}