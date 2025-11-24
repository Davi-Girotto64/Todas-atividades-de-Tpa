package prjAula1;

import java.util.Scanner;
public class Produto {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		double valor, quantidade, preco, lucro, total;
		
		System.out.println("Digite o valor do produto: ");
		valor = in.nextDouble();
		
		System.out.println("Digite a quantidade vendida: ");
		quantidade = in.nextDouble();
		
		System.out.println("Digite o preço por venda: ");
		preco = in.nextDouble();
		
		lucro = (valor - preco) * quantidade;
		
		total = (quantidade * preco) + lucro;
		
		System.out.println("O valor total é: "+total);
		
	}
}

    
