package prjAula1;

import java.util.Scanner;
public class Temperatura {
	public static void main (String args []) {
	
		Scanner in = new Scanner(System.in);
		double f, c;
		
		System.out.println("Coloque a Fahrenheit atual: ");
		f = in.nextDouble();
		
		c = (f-32) * 5/9;
	
			System.out.println("A temperatura em Graus Celsius é: "+c);
		if (c<=15) {
			System.out.println("A temperatura se encontra fria");
		}
		else if (c<22) {
			System.out.println("A temperatura se encontra ameno");
		}
		else {
			System.out.println("A temperatura se encontra quente");
        		}
		
	     }
		
   }	

