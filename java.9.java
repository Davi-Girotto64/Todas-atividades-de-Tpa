package prjAula1;

import java.util.Scanner;
public class Combustivel {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in); 
		double gasto, combustivel, distancia;
	
		System.out.println("Digite a distância percorrida (em km): ");
		distancia = in.nextDouble();
	
		System.out.println("Digite a capacidade de combustivel (em litros): ");
		combustivel = in.nextDouble();
	
		gasto = distancia / combustivel;
	
		System.out.println("O gasto médio é: "+gasto);
	
		if (gasto>=10) {
			System.out.println("O veículo é econômico: ");
		}
		else {
			System.out.println("O veículo não é econômico");
		}
	
	}
}