package prjAula1;

import java.util.Scanner;
public class ProgramaFaixaEtaria {
        public static void main(String args[]) {        
        Scanner in= new Scanner(System.in);
        int idade, contador1=0, contador2=0, contador3=0, contador4=0, contador5=0, i=0, continuar=1;
        double porcentagem1, porcentagem2, porcentagem3, porcentagem4, porcentagem5;
        
        while (continuar ==1) {
        	System.out.println("Escreva a idade desejada:");
            idade = in.nextInt();
            
        	if (idade<=15) {
        		System.out.println("A idade inserida está na 1º faixa etária");
        		contador1++;
        		i++;
        	}
        	else if (idade>=16 && idade<=30) {
        		System.out.println("A idade inserida está na 2º faixa etária");
        		i++;
        		contador2++;
        	}
        	else if (idade>=31 && idade<=45) {
        		System.out.println("A idade inserida está na 3º faixa etária");
        		i++;
        		contador3++;
        	}
        	else if (idade>=46 && idade<=60) {
        		System.out.println("A idade inserida está na 4º faixa etária");
        		i++;
        		contador4++;
        	}
        	else {
        		System.out.println("A idade inserida está na 5º faixa etária");
        		i++;
        		contador5++;
        	}
        	System.out.println("Deseja continuar? 1-Sim ou 2-Não");
        	continuar = in.nextInt();
        }
        if (continuar==2) {
        	porcentagem1 = (contador1*100) /i;
        	porcentagem2 = (contador2*100) /i;
        	porcentagem3 = (contador3*100) /i;
        	porcentagem4 = (contador4*100) /i;
        	porcentagem5 = (contador5*100) /i;
        	
        	System.out.println("Quantidade na 1ª Faixa (ate 15 anos): "+contador1);
        	System.out.println("Quantidade na 2ª Faixa (16 a 30 anos): "+contador2);
        	System.out.println("Quantidade na 3ª Faixa (31 a 45 anos): "+contador3);
        	System.out.println("Quantidade na 4ª Faixa (46 a 60 anos): "+contador4);
        	System.out.println("Quantidade na 5ª Faixa (acima de 61 anos): "+contador5);
        	
        	System.out.println("Porcentagem na 1ª Faixa: "+porcentagem1+"%");
        	System.out.println("Porcentagem na 2ª Faixa: "+porcentagem2+"%");
        	System.out.println("Porcentagem na 3ª Faixa: "+porcentagem3+"%");
        	System.out.println("Porcentagem na 4ª Faixa: "+porcentagem4+"%");
        	System.out.println("Porcentagem na 5ª Faixa: "+porcentagem5+"%");
        }
     }
}

    
