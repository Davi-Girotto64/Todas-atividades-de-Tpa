package prjAula1;

import java.util.Scanner;
public class Numero {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe o número: ");
		numero = in.nextInt();
		if (numero<0) {
			System.out.println("O número informado é negativo");
		}
		else if (numero==0) {
			System.out.println("O número informado é neutro");
		}
		else {
			System.out.println("O número informado é positivo");
		}
		
	}
	
}