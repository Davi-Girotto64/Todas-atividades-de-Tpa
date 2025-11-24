package prjAula1;

import java.util.Scanner;
public class Numero2 {
	public static void main (String args []) {
		Scanner in = new Scanner(System.in);
		int numero;
	
		System.out.println("Digite o número desejado: ");
        numero = in.nextInt();
	  
        numero = numero % 2;
        
        if (numero ==1) {
        	System.out.println("O número inserido é impar");
        }
        else {
        	System.out.println("O número inserido é par");
        }
        
	}
}