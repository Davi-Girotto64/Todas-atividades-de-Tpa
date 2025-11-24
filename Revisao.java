package prjAula1;

import java.util.Scanner; 
public class Revisao {
	public static void main(String args []) {
	Scanner in = new Scanner (System.in);
	double n1, n2, n3, n4, mi, nm, ex;
	
	System.out.println("Insira a 1a nota: ");
	n1 = in.nextDouble();
	
	System.out.println("Insira a 2a nota: ");
	n2 = in.nextDouble();
	
	System.out.println("Insira a 3a nota: ");
	n3 = in.nextDouble();
	
	System.out.println("Insira a 4a nota: ");
	n4 = in.nextDouble();
	
	mi = (n1+n2+n3+n4)/4;
	
	System.out.println("A sua media é: "+mi);
	
	if (mi<5) {
		System.out.println("Reprovado");
	}
	else if (mi>7) {
		System.out.println("Aprovado");
	}
	else {
		System.out.println("Exame");
	}
	System.out.println("Insira a nota do exame: ");
	ex = in.nextDouble();
	
	nm = (mi+ex)/2;
	
	System.out.println("A sua nova média é: "+nm);
	
	if (nm>=7) {
		System.out.println("Aprovado");
	} else {
		System.out.println("Reprovado");
		}
	}
}

    
