/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresrelacionales;

/**
 *
 * @author elisabet
 */
/*
4.- En el proyecto Tema2+tunombre, crea una nueva clase llamada Ej04, dentro del paquete 
operadoresrelacionales, que contenga una llamada al método public static void main(String[] args). 
La aplicación Java contendrá comentarios descriptivos del código y realizará lo siguiente:
    a.- Declara e inicializa dos variables int (a=10,  b=20).
    b.- Declara cuatro variables booleanas.
    c.- Guarda, en las variables booleanas, el resultado de realizar las siguientes operaciones relacionales: a<b, a>b, a==b, a!=b.
    d.- Muestra en pantalla el resultado de las operaciones, usando las variables booleanas.
*/
public class Ej04 {
    public static void main(String[] args) {
        int a = 10;
        int b= 20;
        boolean uno;
        boolean dos;
        boolean tres;
        boolean  cuatro;
        
        uno = a<b;
        dos = a>b;
        tres = a==b;
        cuatro= a!=b;
        
        System.out.println("""
                           a<b = %b
                           a>b = %b
                           a==b = %b
                           a!=b =%b
                           """.formatted(uno,dos,tres,cuatro));
        
    }
}
