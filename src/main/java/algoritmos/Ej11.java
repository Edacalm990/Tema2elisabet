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
/*Se requiere obtener el área de la figura, a partir de R y H. 
Realiza un algoritmo para resolver el problema.*/
public class Ej11 {
    public static void main(String[] args) {
        // area triangulo isosceles= (base*(Math.sqrt(Math.pow(hipotenusa, 2)-((Math.pow(base,2))/4))/2
        // aea semicirculo= (Math.PI*(Math.pow(r,2))/2
        
        String baseString = JOptionPane.showInputDialog("Dame la base en cm");
        double base=Double.parseDouble(baseString);
        
        String hipotenusaString = JOptionPane.showInputDialog("Dame la hipotenusa en cm");
        double hipotenusa=Double.parseDouble(hipotenusaString);
        
        double alturaTrianguloIsosceles = Math.sqrt(Math.pow (hipotenusa,2)-((Math.pow (base,2))/4));
        double areaTringuloIsosceles=(base*alturaTrianguloIsosceles)/2;
        
        double radioSemiCirculo= base/2.0;
        double areaSemiCirculo= (Math.PI*(Math.pow(radioSemiCirculo, 2)))/2.0;
        
        double areaTotalDeLaFigura=areaTringuloIsosceles+areaSemiCirculo;
        
        System.out.println(areaTotalDeLaFigura);
        JOptionPane.showMessageDialog(null, """
                                            EL area total de la figura es %f cm\u00B2""".formatted(areaTotalDeLaFigura));
        
    }
}
