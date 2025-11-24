package prjAula1;

import java.util.Scanner;
public class Salario2 {
	public static void main (String args[]) {	
		Scanner in = new Scanner(System.in);
		double salario;
		
		System.out.println("Coloque o seu salário atual: ");
		salario = in.nextDouble();
		
		if (salario<1302.00) {
			System.out.println("Seu salário está abaixo do salário minimo");		
		}
		else {
			System.out.println("Seu salário está acima do salário minimo");
		       }
		
	     }

  }

    
