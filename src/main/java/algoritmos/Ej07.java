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

/*Conversor de Euros a Dolares*/
public class Ej07 {
    public static void main(String[] args) {
        final double DOLARPOREURO = 0.99; 
        
        String eurosString = JOptionPane.showInputDialog("Cuantos euros quieres convertir a dolares?");
        double euros = Double.parseDouble(eurosString);
        
        double eurosConvertidosDolares=euros*DOLARPOREURO;
        
        JOptionPane.showMessageDialog(null, """
                                            %.2f euros son %.2f dolares
                                            """.formatted(euros, eurosConvertidosDolares));
        
        
    }
}
