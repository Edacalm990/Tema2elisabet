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
// Algoritmo que lea por teclado el valor del radio de una circunferencia y calcule la longitud, el área de la circunferencia y el volumen de la misma.
public class Ej02 {
    public static void main(String[] args) {
        double radio; //cm
        double longitud;
        double area;
        double volumen;
        final double  V_FRACCION= 4.0/(double)3;

        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Radio de la circunferencia");
        radio = teclado.nextDouble();
        
        //Longitud de la circunferencia = 2*PI*Radio Area de la circunferencia = PI*Radio^2 Volumen de la esfera = (4/3)*PI*Radio^3
        longitud = 2*Math.PI*radio;
        area = Math.PI*(Math.pow(radio, 2));
        volumen = (V_FRACCION* Math.PI * Math.pow(radio, 3)) ;
        
        System.out.println("""
                           El radio es %f centimetros
                           La longitud de la circumferencia es %f
                           El area de la circumferencia es %f
                           El volumen de la circumferencia es %f
                           """.formatted(radio, longitud, area, volumen));
    }
}

