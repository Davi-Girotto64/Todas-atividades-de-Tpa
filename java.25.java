package prjAula1;

import java.util.Scanner;
public class MediaAritmetica {
	public static void main(String args []) {
	
		Scanner ler = new Scanner(System.in);

        double n1, n2, n3, n4, mA;

        System.out.println("Digite o valor da primeira nota: ");
        n1 = ler.nextInt();

        System.out.println("Digite o valor da segunda nota: ");
        n2 = ler.nextInt();

        System.out.println("Digite o valor da terceira nota: ");
        n3 = ler.nextInt();

        System.out.println("Digite o valor da quarta nota: ");
        n4 = ler.nextInt();

        mA = (n1 + n2 + n3 + n4) / 4;

        System.out.println("Média Aritmética "+mA);
        	
    }
}