package prjAula1;

import java.util.Scanner; 
public class CalculoRaio {
	public static void main (String args []) {
		Scanner in = new Scanner(System.in);
		double raio, altura, volume;
		
		System.out.println("Digite o raio: ");
		raio = in.nextDouble();
		
		System.out.println("Digite a altura: ");
		altura = in.nextDouble();
		
		volume = 3.14 * (raio * raio) * altura; 
		
		System.out.println("O volume é: "+volume);
		
	}
}