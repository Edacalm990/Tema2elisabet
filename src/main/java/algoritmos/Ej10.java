/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

import javax.swing.JOptionPane;

/**
 *
 * @author elisabet
 */
/*Una empresa constructora se dedica a realizar bloques de pisos en parcelas como las que figuran 
en la imagen de la derecha. Necesitan saber el área de la parcela según las medidas A, B y C. Realiza 
el ejercicio usando JOption para solicitar y mostrar datos al usuario.*/
// (base x altura)/2 triangulo
// (lado x lado)
public class Ej10 {
    public static void main(String[] args) {
            /* Declaramos una variable tipo String
         * para almacenar el nombre y otra para la edad
         * Además declaramos una variable de tipo int
         * para poder almacenar la edad que el usuario
         * introduce en una variable de tipo numérico.*/
        String a, c;
        double aDouble, b, cDouble;
         
        /* Contruimos el cuandro de diálogo para la medida*/
        a=JOptionPane.showInputDialog("Introduce la primera medida (A)");
        // otra forma de hacerlo parseando directamente
        b=Double.parseDouble(JOptionPane.showInputDialog("Introduce la segunda medida (B)"));
        c=JOptionPane.showInputDialog("Introduce la tercera medida (C)");
         
        /* 
         * conversión de String a double*/
        aDouble=Double.parseDouble(a);
        //bDouble=Double.parseDouble(b);
        cDouble=Double.parseDouble(c);
        
        double triangulo = ((aDouble - cDouble) * b)/2.0;
        double rectangulo = b * cDouble;
        double area = triangulo + rectangulo;
        
        JOptionPane.showMessageDialog(null, "El area del poligono irregular es %.2f".formatted(area));
               
    }
}
