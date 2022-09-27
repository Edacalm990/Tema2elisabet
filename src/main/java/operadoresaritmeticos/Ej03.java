/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author elisabet
 */
/*3.- En el proyecto Tema2+tunombre, crea una nueva clase llamada Ej03, dentro del paquete operadoresaritmeticos, que contenga una llamada al método public static void main(String[] args). Realiza lo siguiente dentro del método main:
    a.- Declara e inicializa tres variables int (a=10,  b=5, i=0)
    b.- Declara e inicializa dos variables double (c=71.3 y d=4.8)
    c.- Realiza las siguiente operaciones aritméticas a+b, a-b, a*b, a/b, c+d, c-d, c*d, c/d. El resultado de cada operación se almacena en una nuevas variables que se crearán para tal efecto, con el nombre que tú decidas, siempre siguiendo las recomendaciones de legibilidad de código.
    d.- Muestra el resultado de cada operación usando text blocks, usando las variables creadas en el paso c).
    e.- También muestra en pantalla los resultados de las siguientes operaciones: a*=3, b-=1, a/=b, c+=d.
    f.- Finalmente, el programa muestra en consola la siguiente información, en distintas instrucciones: valor de i, valor de i++, valor de i y valor de ++i.
*/
public class Ej03 {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int i=0;
        double c=71.3;
        double d=4.8;
        
        int sumaA = a + b;
        int restaA = a - b;
        int multiplicacionA = a * b;
        int divisionA = a / b;
        double sumaC = c + d;
        double restaC = c - d;
        double multiplicacionC = c * d;
        double divisionC = c / d;
        
        System.out.println("""
                           a+b = %s 
                           a-b = %s 
                           a*b = %s
                           a/b = %s
                           c+d = %s
                           c-d = %s
                           c*d = %s
                           c/d = %s
                           """.formatted(sumaA, restaA, multiplicacionA, divisionA, sumaC, 
                                   restaC, multiplicacionC, divisionC));

        System.out.println(i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);    
        
        System.out.printf("Suma %.3f Resta %.4f Multiplicacion %.2f  Division %f",
                sumaC, restaC, multiplicacionC, divisionC);
        
        
/*
    s formats strings.
    d formats decimal integers.
    f formats floating-point numbers.
    t formats date/time values.
    .2 solo dos digitos 
        control+R = renombrar todo
*/

a*=3; // a = a*3
b-=1; // b= b-1
a/=b; // a = a/b
c+=d; // c = c+d

a=11;
b=5;

int cociente = a/b;
int resto = a%b;
        System.out.println("""
                           
                           cociente %d
                           resto %d
                           """.formatted(cociente, resto));
    }
}
