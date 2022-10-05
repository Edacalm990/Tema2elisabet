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
/*Tres personas deciden invertir su dinero para formar una empresa. Cada una de ellas invierte 
una cantidad distinta, que debes solicitar al usuario por teclado. Implementa un algoritmo que 
imprima el porcentaje que invierte cada uno con respecto al total de la inversión.*/
public class Ej06 {
    public static void main(String[] args) {
        double dineroQueInviertePersona1;
        double dineroQueInviertePersona2;
        double dineroQueInviertePersona3;
        
        String dineroQueInviertePersona1String= JOptionPane.showInputDialog(
                "Cuantas dinero va a invertir la 1º persona?");
        dineroQueInviertePersona1=Double.parseDouble(dineroQueInviertePersona1String);
        
        String dineroQueInviertePersona2String= JOptionPane.showInputDialog(
                "Cuantas dinero va a invertir la 2º persona?");
        dineroQueInviertePersona2=Double.parseDouble(dineroQueInviertePersona2String);
        
        String dineroQueInviertePersona3String= JOptionPane.showInputDialog(
                "Cuantas dinero va a invertir la 3º persona?");
        dineroQueInviertePersona3=Double.parseDouble(dineroQueInviertePersona3String);
        
        double totalDeDineroQueInvierten=
                dineroQueInviertePersona1 +
                dineroQueInviertePersona2 +
                dineroQueInviertePersona3;
        
        double porcentajeDineroPersona1= (dineroQueInviertePersona1 / totalDeDineroQueInvierten) * 100;
        double porcentajeDineroPersona2= (dineroQueInviertePersona2 / totalDeDineroQueInvierten) * 100;
        double porcentajeDineroPersona3= (dineroQueInviertePersona3 / totalDeDineroQueInvierten) * 100;
    
        // TODO solucionar el % para que s emuestre
        JOptionPane.showMessageDialog(null, """
                                            La 1º persona ha invertido %.2f,
                                            La 2º persona ha invertido %.2f ,
                                            La 3º persona ha invertido %.2f ,
                                            """.formatted(porcentajeDineroPersona1,porcentajeDineroPersona2,porcentajeDineroPersona3));
    }
}
