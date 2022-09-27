/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresboleanos;

/**
 *
 * @author elisabet
 */

/*5.- En el proyecto Tema2+tunombre, crea una nueva clase llamada Ej05, dentro del paquete 
operadoresbooleanos, que contenga una llamada al método public static void main(String[] args). 
La aplicación Java contendrá comentarios descriptivos del código y realizará lo siguiente:
    a.- Declara e inicializa dos variables lógicas, una se llamará verdadero y valdrá true, la otra falso y valdrá false.
    b.- Muestra las tablas de verdad de las operaciones lógicas && (AND) y || (OR), usando las variables 
verdadero y falso. Usa text blocks y lla instrucción println() para mostrar los resultados de evaluar 
las siguientes expresiones lógicas:
verdadero && verdadero
verdadero && falso
falso && verdadero
falso && falso
verdadero || verdadero
verdadero || falso
falso || verdadero
falso || falso

    c.- Muestra en pantalla el resultado de las expresiones !verdadero y !falso.
*/
public class Ej05 {
    public static void main(String[] args) {
        boolean verdadero=true;
        boolean falso=false;
        
        System.out.println("""
                           verdadero && verdadero = %b
                           verdadero && falso = %b
                           falso && verdadero = %b
                           falso && falso = %b
                           verdadero || verdadero = %b
                           verdadero || falso = %b
                           falso || verdadero = %b
                           falso || falso = %b
                           """.formatted(verdadero && verdadero, verdadero && falso, falso && verdadero,
                                   falso && falso, verdadero || verdadero, verdadero || falso, falso || verdadero, falso || falso));
    }
    
}
