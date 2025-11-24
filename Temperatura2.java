package prjAula1;

import java.util.Scanner;
public class Temperatura2 {
	public static void main (String args []) {
		Scanner in = new Scanner(System.in);
		double f,c;
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
        f = in.nextDouble();
		
        c = (f-32) * 5/9;

        System.out.println("A temperatura em graus celsius é: "+c);
        
        if (c<0) {
        	System.out.println("A temperatura está extremamente fria");
        }
        else if (c<=10) {
        	System.out.println("A temperatura está fria");
        }
        else if (c<=20) {
        	System.out.println("A temperatura está moderadamente fria");
        }
        else if (c<=24) {
        	System.out.println("A temperatura está amena");
        }
        else {
        	System.out.println("A temperatura está quente");
           }
        
	        }
     }
    
