   import java.util.*; 
    
public class programaSalario {
   public static void main (String args[]){
Scanner scanner = new Scanner(System.in);
       double F,C;
      System.out.println("Digite a primeira temperatura");
       double Ff = scanner.nextDouble();
       
       double cC=(Ff-32*5)/9;
       
         if(cC>=15&&cC<22){
           System.out.println("ameno");
       }   else if (cC<=14){
           System.out.println("frio");
   }else{
       System.out.println("calor");
       } 
       
       
       
       
   
       
       
   } 
    
    
    
}