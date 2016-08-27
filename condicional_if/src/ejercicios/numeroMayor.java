
package ejercicios;

//dados dos numeros enteros devolver el mayor

import java.util.Scanner;

public class numeroMayor {
    
    public static void main(String... andres){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite primer numero");
        int num1 = sc.nextInt();
        System.out.println("Digite segundo numero");
        int num2 = sc.nextInt();
        
        if(num1 > num2){
            
            System.out.println("Primer numero es mayor");
            
        }else if(num2 > num1){
            
            System.out.println("Segundo numero es mayor");
            
        }else{
            
            System.out.println("Los numeros son iguales");
            
        }
        
        
    }
    
    
}
