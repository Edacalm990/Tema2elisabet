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
/*Programa que pida el precio de un artículo y calcule su valor aplicándole un 21% de IVA.*/
public class Ej09 {
    public static void main(String[] args) {
        
        final double IVA=0.21;
        
        Scanner teclado= new Scanner (System.in);
        System.out.println("¿Cual es el precio del articulo?");
        
        double precioSinIva=teclado.nextDouble();
        
        double precioConIva=(precioSinIva*IVA)+precioSinIva;
        
        System.out.println("""
                           El precio con IVA es %.2f €
                           """.formatted(precioConIva));
    }
}
