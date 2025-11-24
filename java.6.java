package prjAula1;

import java.util.Scanner;
public class CalculoIMC {
	public static void main (String args []) {
		Scanner in = new Scanner(System.in);
		double peso, altura, imc;
		
		System.out.println("Digite o peso: ");
		peso = in.nextDouble();
		
		System.out.println("Digite a altura: ");
		altura = in.nextDouble();
		
		imc = peso/(altura * altura);
		
		System.out.println("O IMC é: "+imc);
	}
}