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
// Algoritmo que lea por teclado una cantidad de grados centígrados y los pase a grados Fahrenheit.
public class Ej01 {
    public static void main(String[] args) {
        double gradosC;
        double gradosF;
        
        final double FORMULA_DIVISION = 9.0/5.0;
        final int FORMULA_SUMA =32;
        
        // formula ( °C × 9 / 5) + 32
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("¿Cuantos grados centigrados quieres convertir a grados Fahrenheit?");
         gradosC = teclado.nextDouble();
        
        System.out.println(gradosC);
        gradosF=(gradosC*9/5)+32;
        
        System.out.println(gradosC + " grados centigrados son " + gradosF + " grados Fahrenheit");
        System.out.println("""
                           %f grados centigrados son %f grados Fahrenheit
                           """.formatted(gradosC, gradosF));
        
        double resultado = (gradosC * FORMULA_DIVISION) + FORMULA_SUMA;
        System.out.println(resultado);
        
        double a; // valor primiivo
        Double b; // objeto tipo double, también almacena el dato pero puedes aplicarles metodos
        
       
    }
}

