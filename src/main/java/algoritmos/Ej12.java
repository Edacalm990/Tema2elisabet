/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author elisabet
 */
/*Un alumno desea saber cuál será su calificación final en la materia de Programación.  Dicha calificación 
se compone de los siguientes porcentajes:
55% del promedio de sus tres calificaciones parciales.
30% de la calificación del exámen final.
15% de la calificación de un trabajo final.
*/
public class Ej12 {
    public static void main(String[] args) {
        final double PORCETAJEPARCIALES = 0.55;
        final double PORCENTAJEEXAMENFINAL=0.30;
        final double PORCENTAJETRANAJOFINAL=0.15;
        
        double primeraNotaParcial;
        double segundaNotaParcial;
        double terceraNotaParcial;
        double examenFinal;
        double trabajoFinal;
        
        String primeraNotaString = JOptionPane.showInputDialog(
                "Cuanto has obtenido en la primera calificación parcial?");
        primeraNotaParcial=Double.parseDouble(primeraNotaString);
        
        String segundaNotaString = JOptionPane.showInputDialog(
                "Cuanto has obtenido en la segunda calificación parcial?");
        segundaNotaParcial=Double.parseDouble(segundaNotaString);
        
        String terceraNotaString = JOptionPane.showInputDialog(
                "Cuanto has obtenido en la tercera calificación parcial?");
        terceraNotaParcial=Double.parseDouble(terceraNotaString);
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Cuanto sacaste en el examen final?");
        examenFinal=teclado.nextDouble();
        
        System.out.println("Cuanto sacaste en el trabajo final?");
        trabajoFinal=teclado.nextDouble();
        
        double notaParciales = ((primeraNotaParcial + segundaNotaParcial + terceraNotaParcial) / 3) * PORCETAJEPARCIALES;
        double notaExamenFinal = examenFinal * PORCENTAJEEXAMENFINAL;
        double notaTrabajoFinal = trabajoFinal * PORCENTAJETRANAJOFINAL;
        
        double notaFinal= notaParciales+notaExamenFinal+notaTrabajoFinal;
        
        JOptionPane.showMessageDialog(null, """
                                            Tu nota final de programación es %.2f
                                            """.formatted(notaFinal));
        
        if (notaFinal>=5) {
            System.out.println("Enhorabuena has aprobado la asignatura");
        } else {
            System.out.println("Lo siento vas a taner que ir a recuperación");
        }
       
    }
}
