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

/*Cada grupo de clase de un centro educativo tiene 30 horas de clase a la semana. 
Calcula el número de profesores que se necesitan, teniendo en cuenta que un profesor 
imparte un número de horas de clase a la semana, que se debe pedir al usuario, 
junto con el número total de grupos que tiene el centro escolar.*/
public class Ej05 {
    public static void main(String[] args) {
        final int HORASDECLASEALASEMANA=30;
        
        String horasQueImparteCadaProfesorSemanaString = JOptionPane.showInputDialog(
                "Cuantas horas imparte cada profesor?");
        double horasQueImparteCadaProfesorSemana= Double.parseDouble(horasQueImparteCadaProfesorSemanaString);
        
        String gruposEnElCentroString = JOptionPane.showInputDialog(
                "Cuantas grupos tiene el centro?");
        int gruposEnElCentro = Integer.parseInt(gruposEnElCentroString);
        
        int horasTotalesDeClase = HORASDECLASEALASEMANA * gruposEnElCentro;
        double profesoresNecesarios = horasTotalesDeClase / horasQueImparteCadaProfesorSemana;
        
        if (profesoresNecesarios%1!=0) {
            double parteDecimal = profesoresNecesarios % 1; 
            double parteEntera = profesoresNecesarios - parteDecimal;
            int totalDeProfesores= (int)parteEntera+1;
            double horasQueTieneQueHacerElProfesorExtra = parteDecimal * horasQueImparteCadaProfesorSemana;
                        
            JOptionPane.showMessageDialog(null, """
                                                Se necesitan %s profesores en total
                                                %.0f harán %.2f horas a la semana
                                                y necesitará un profesor extra que realice %.2f horas
                                                """.formatted(totalDeProfesores, parteEntera, horasQueImparteCadaProfesorSemana, horasQueTieneQueHacerElProfesorExtra));
        } else {
            JOptionPane.showMessageDialog(null, """
                                                Se necesitan %.0f profesores .
                                                """.formatted(profesoresNecesarios));
        }
        
 
        
        
    }
}
