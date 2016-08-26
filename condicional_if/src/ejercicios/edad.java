
package ejercicios;

import java.util.Scanner;


public class edad {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite su edad");
        int edad = sc.nextInt();
        
        if(edad >= 18){
            
            System.out.println("Usted es mayor de edad");
            
        }else{
            
            System.out.println("Usted es menor de edad");
            
        }
        
        
    }
    
    
}
