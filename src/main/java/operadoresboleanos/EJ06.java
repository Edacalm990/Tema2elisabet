/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresboleanos;

/**
 *
 * @author elisabet
 */
/*6.- Indica si el siguiente código funciona o no. En caso afirmativo indica que hace, en caso negativo explica por qué no funciona.
    a.-     boolean adivina = ((83 == 'a') && false);
        System.out.println(adivina);

    b.-     int a = 'a';
        System.out.println(a);

    c.-     int number = 2.14;
        System.out.println(number);

    d.-    double pi = 3,14;
        System.out.println(pi);

    e.-     boolean test = (1==1);
        System.out.println(test);
*/
public class EJ06 {
    public static void main(String[] args) {
        boolean adivina = ((83 == 'a') && false);
        System.out.println(adivina);

        int a = 'a';
        System.out.println(a);

        int number = 2.14; // Porque es de tipo integer y el literal es de tipo float
        System.out.println(number); 

        double pi = 3,14; // porque el literal usa una , en vez de un . 
        System.out.println(pi);

        boolean test = (1==1);
        System.out.println(test);
    }
}
