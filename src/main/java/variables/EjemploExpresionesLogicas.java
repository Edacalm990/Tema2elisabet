/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;

import java.util.Scanner;
import javax.swing.JOptionPane;

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
        

        nombre= JOptionPane.showInputDialog("Introduce tu nombre");
        
        apellido1 = JOptionPane.showInputDialog("Introduce tu apellido");
        
        // limpiar porquería solo con printInt
        //teclado.nextLine();
        
        // Lectura de datos con JOption
        String edadString=JOptionPane.showInputDialog("Introduce tu edad");
        edad = Integer.parseInt(edadString);
        
        String pesoString=JOptionPane.showInputDialog("Introduce tu peso en KG");
        peso=Double.parseDouble(pesoString);
        
        String estaturaString=JOptionPane.showInputDialog("Introduce tu estatura");
        estatura=Integer.parseInt(estaturaString);
        
        // Su edad esta comprendida entre 25 y 30 (ambos inclusive)
        boolean a= 25 <= edad && edad<=30;
        System.out.println("Su edad esta comprendida entre 25 y 30 (ambos inclusive)? " + a);
        
        // Su peso es mayor 50 o menor o igual 100 (100 inclusive)?
        boolean b= 50< peso || peso <=100;
        System.out.println("""
                           Su peso esta es mayor que 50 o menor o igual a  100? %b
                           """.formatted(b));   
        
        // c: estatura no mide 175
        boolean c= estatura!=175;
        System.out.println("Su estatura es diferente a 175 cm?" + c);
        
        // d: Su estatura está comprenida entre 100 y 180 (ambos no incluidos)
        boolean d= 100 < estatura && estatura < 180;
        System.out.println("Su estatura está comprenida entre 100 y 180 (ambos no incluidos)? " + d);
        
        // e: Su edad si sumamos 10 es menos que 60
        boolean e= edad + 10 < 60;
        System.out.println("Su edad si sumamos 10 es menos que 60 ? " + e);
        
        // f: nombre = Pablo ignorando mayus y min. Usa equalIgnoreCase
        final String PALABRA = "Pablo";
        boolean f = nombre.equalsIgnoreCase(PALABRA);
        System.out.println("""
                           Su nombre es %s ?  %s 
                           """.formatted(PALABRA, nombre));
        
        // g  apellido contiene 'j'. Usa contains en String
        boolean g= apellido1.toLowerCase().contains("j");
        System.out.println("El apellido contiene la j? " + g);
        
        // h apellido termina en dez. Usa endsWith de los Strings
        boolean h= apellido1.endsWith("dez");
        JOptionPane.showMessageDialog(null, "El apellido termina en dez?", "Boolean h", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("El apellido termina en dez? " + h);
        
        // i la edad no esta entre 40 o 50
        boolean i= edad<40 || edad>50;
        JOptionPane.showMessageDialog(null, """
                                            La edad esta no esta comprendida entre 40 y 50? %b
                                            """.formatted(i));
                
    }
}
