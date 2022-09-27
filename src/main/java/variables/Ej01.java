/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;

/**
 *
 * @author elisabet
 */
public class Ej01 {
    
    public static void main(String[] args) {
    //a
        int integer;
        double floatingPoint;
        char character;
        boolean boleano;
        
        //b
        double numeroDecimalDoble;
        int numeroInteger;
        
        //c
        String palabra;
        
        // d
        integer= 2568956;
        floatingPoint = 1.236;
        character='a';
        boleano=true;

        numeroDecimalDoble = 1.63346;
        numeroInteger = 154236;
        
        palabra = "palabra";
        
        //e
        System.out.println("Declarando e inicializando una variable de tipo integer llamada integer, con literal " + integer);
        System.out.println("Declarando e inicializando una variable de tipo floatingPoint llamada floatingPoint, con literal " + floatingPoint);
        System.out.println("Declarando e inicializando una variable de tipo character llamada character, con literal " + character);
        System.out.println("Declarando e inicializando una variable de tipo boolean llamada boleano, con literal " + boleano);
        
        //f
        System.out.printf("Variable tipo double donde solo se muestran 2 digitos %.2f \n", numeroDecimalDoble);
        System.out.printf("Variable tipo float donde solo se muestran 2 digitos %.2f \n", floatingPoint);
    }
}
