/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author sara
 */
public class operador_interrogacion {

    public static void main(String[] args) {

        int x = 20;
        int y = 30;
        int mayor;

        if (x > y) {

            mayor = x;
            
        } else {
            
            mayor = y;
        }
        
        System.out.println(mayor);
        
        mayor = (x > y) ? x : y; //x : y, x seria el if y y seria el else
        
        
        System.out.println(mayor);

    }

}
