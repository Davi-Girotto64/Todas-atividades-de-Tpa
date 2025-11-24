package prjAula1;

import java.util.Scanner;
public class CalculoIMC2 {
	public static void main (String args []) {
		Scanner in = new Scanner(System.in);
		double peso, altura, imc;
		
		System.out.println("Digite o peso: ");
		peso = in.nextDouble();
		
		System.out.println("Digite a altura: ");
		altura = in.nextDouble();
		
		imc = peso/(altura * altura);
		
		System.out.println("O IMC é: "+imc);
		
		if (imc<18.5) {
			System.out.println("Se encontra com excesso de magreza");
		}
		else if (imc>=18.5 && imc<25) {
			System.out.println("Se encontra com peso normal");
		}
		else if (imc>=25 && imc<30) {
			System.out.println("Se encontra com excesso de peso");
		}
		else if (imc>=30 && imc<35) {
			System.out.println("Se encontra com obesidade grau 1");
		}
		else if (imc>=35 && imc<40) {
			System.out.println("Se encontra com obesidade grau 2");
		}
		else {
			System.out.println("Se encontra com obesidade grau 3");
		}
	}
}