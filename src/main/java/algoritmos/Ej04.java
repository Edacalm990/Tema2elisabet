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

/*Uber establece un precio mínimo por servicio de 1,25€ fijos y además 8 céntimos por Km recorrido. 
Elabora un programa que lea el número de km a recorrer y proporcione el presupuesto.*/
public class Ej04 {
    public static void main(String[] args) {
        final double PRECIOFIJO = 1.25;
        final double PRECIOPORKM=0.08;
        
        String kmRecorridosString = JOptionPane.showInputDialog("Cuantos km vas ha recorrer?");
        double kmRecorridos= Double.parseDouble(kmRecorridosString);
        
        double presupuesto= PRECIOFIJO + (PRECIOPORKM*kmRecorridos);
        
        JOptionPane.showMessageDialog(null, """
                                            El presupuesto total es %f euros """.formatted(presupuesto));
    }
}
