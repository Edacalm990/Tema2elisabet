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
        final double GINECOLOGIA=0.4;
        final double TRAUMATOLOGIA=0.3;
        final double PEDIATRIA=0.3;
        
        double presupuestoGinecologia;
        double presupuestoTraumatologia;
        double presupuestoPediatria;
        
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Presupuesto total");
        double presupuesto = teclado.nextDouble();
        
        presupuestoGinecologia= GINECOLOGIA* presupuesto;
        presupuestoTraumatologia = TRAUMATOLOGIA * presupuesto;
        presupuestoPediatria= PEDIATRIA*presupuesto;
        
        System.out.println("""
                           Con un presupuesto de %.2f €
                           se asigna a ginecología %.2f €, traumatología %.2f € y a pediatrÍa %.2f €
                           """.formatted(presupuesto, presupuestoGinecologia,  presupuestoTraumatologia, presupuestoPediatria));
        
        System.out.printf("Presupuesto Ginecologia %.2f €, Traumatologia %.2f", presupuestoGinecologia, presupuestoTraumatologia);
    }
    
}
