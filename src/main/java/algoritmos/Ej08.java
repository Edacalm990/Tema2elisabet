/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author elisabet
 */

/*En un hospital existen tres áreas: Ginecología, Pediatría y Traumatología. 
El presupuesto anual del hospital se reparte de la siguiente forma: Ginecología 40%, 
Traumatología 30%, Pediatría 30%. Obtener la cantidad de dinero que recibirá cada área, 
para cualquier cantidad de presupuesto.*/

public class Ej08 {
    public static void main(String[] args) {
        double ginecologia=0.4;
        double traumatologia=0.3;
        double pediatria=0.3;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Presupuesto total");
        double presupuesto = teclado.nextDouble();
        
        ginecologia *= presupuesto;
        traumatologia *= presupuesto;
        pediatria *= presupuesto;
        
        System.out.println("""
                           Con un presupuesto de s% €
                           se asigna a ginecología s% €, traumatología s% € y a pediatria s% €
                           """.formatted(presupuesto, ginecologia,traumatologia, pediatria));
        
        
    }
    
}
