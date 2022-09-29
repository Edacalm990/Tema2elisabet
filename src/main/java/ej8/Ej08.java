/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8;

import java.util.Scanner;

/**
 *
 * @author elisabet
 */
/*
8.- Crea una nueva clase llamada Ej14, que contenga una llamada al método public static void main(String[] args). 
El programa tendrá una variable entera tiempo inicializada con un valor leído por teclado, en segundos, 
y queremos conocer este tiempo pero expresado en horas, minutos y segundos, mostrando los resultados 
por pantalla.
*/
public class Ej08 {
    public static void main(String[] args) {
        
        double segundosTotales;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime los segundos");
        
        segundosTotales = teclado.nextDouble();
        double minutosTotales=segundosTotales/60;
        double horasTotales=minutosTotales/60;
        int horas=(int)horasTotales;
        int minutos= (int)minutosTotales - (horas*60);
        int segundos=(int)segundosTotales - ((int)minutosTotales*60);
        
        System.out.println(horas + " horas ");
        System.out.println(minutos + " minutos ");
        System.out.println(segundos + " segundos ");
     
        
        
        
        
    }
}
