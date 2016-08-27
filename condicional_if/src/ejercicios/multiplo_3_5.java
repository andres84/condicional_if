
package ejercicios;

//determinar si un numero es multiplo de 3 y 5

import java.util.Scanner;

public class multiplo_3_5 {

public static void main(String... andres){
    
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite numero");
    int numero = sc.nextInt();
    
    if(numero % 3 == 0 && numero % 5 == 0){
        
        
        System.out.println("El numero " + numero + " es multiplo de 3 y de 5");
        
    }else{
        
        System.out.println("El numero " + numero + " no es multiplo de 3 y 5");
        
    }
    
    
}

    
}
