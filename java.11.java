package prjAula1;

import java.util.Scanner;
public class DiasDaSemana {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		int n;
		
		System.out.println("Insira o último número da placa do veiculo:");
		n = in.nextInt();
				
		switch(n) {
			case 1:
			case 2:
				System.out.println("O Veiculo não poderá circular as Segundas-feiras");
				break;
			case 3:
			case 4:
				System.out.println("O Veiculo não poderá circular as Terças-feiras");
				break;
			case 5:
			case 6:
				System.out.println("O Veiculo não poderá circular as Quartas-feiras");
				break;
			case 7:
			case 8:
				System.out.println("O Veiculo não poderá circular as Quintas-feiras");
				break;
			default:
				System.out.println("Não há restrinção");
		}
	}
}