/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;

import java.util.Scanner;

/**
 *
 * @author elisabet
 */
public class EjemploExpresionesLogicas {
    public static void main(String[] args) {
        //lee por teclado nombre, aprellido1, edad, peso(kg), y estatuta (cm)
        // guarda en una variable boleana
            // a: 25 >= edad <=30
            // b: 50 >peso <100
            // c: estatura <175
            // d: 100 >estatura< 180
            // e: edad +10 < 60
            // f: nombre = Pablo ignorando mayus y min. Usa equalIgnoreCase
            // g  apellido contiene 'j'
            // h apellido termina en dez
            // la edad no esta entre 40 y 50
        
            
        String nombre, apellido1;
        int edad, estatura;
        double peso;
        
        Scanner teclado = new Scanner(System.in);
        // SI HAY QUE LEER TEXTOS Y NÚMEROS CON SCANNER
        // PRIMERO SE LEEN LOS TEXTOS Y AL FINAL LOS NUMEROS
        
        // SI LO ANTERIOR NO ES POSIBLE, HAY QUE TENER EN CUENTA QUE
        // DESPUÉS DE LEER UN NÚMERO SI VAMOS A LEER UNA LINEA HAY QUE LIMPIAR EL BUFFER
        // (teclado.nextLine())
        

        System.out.println("Introduce el nombre ");
        nombre= teclado.nextLine();
        
        System.out.println("Introduce el apellido");
        apellido1 = teclado.nextLine();
        
        // limpiar porquería 
        teclado.nextLine();
        
        System.out.println("Introduce la edad ");
        edad = teclado.nextInt();
        
        System.out.println("Introduce el peso en kg");
        peso= teclado.nextInt();
        
        System.out.println("Introduce la estatura en cm");
        estatura=teclado.nextInt();
        
        // a: 25 >= edad <=30
        boolean a= 25 >= edad && edad<=30;
        
        // b: 50 >peso <=100
        boolean b= 50< peso && peso >=100;
           
        // c: estatura no mide 175
        boolean c= estatura!=175;
        
        // d: 100 >estatura< 180
        boolean d= 100 < estatura && estatura < 180;
        
        // e: edad +10 < 60
        boolean e= edad + 10 > 60;
        
        // f: nombre = Pablo ignorando mayus y min. Usa equalIgnoreCase
        String pablo = "pablo";
        boolean f = nombre.equalsIgnoreCase("Pablo");
        
        // g  apellido contiene 'j'. Usa contains en String
        
        
        // h apellido termina en dez. Usa endsWith de los Strings
                
        // la edad no esta entre 40 y 50
        
        
    }
}
