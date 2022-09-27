/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;

/**
 *
 * @author elisabet
 */
public class Ej02 {

    public static void main(String[] args) {
        //a
        int a = 1, b = 2, c = 3;
        //b
        double d = 4.5, e = 5.7, f = 6.9;
        //c
        System.out.println(
                    "variable a=" + a
                + " variable b=" + b
                + " variable c=" + c + "\n"
                + "variable d=" + d
                + " variable e=" + e
                + " variable f=" + f);
        //d
        int sumaA = a + b;
        int restaA = a - b;
        int multiplicacionA = a * b;
        int divisionA = a / b;
        double sumaC = c + d;
        double restaC = c - d;
        double multiplicacionC = c * d;
        double divisionC = c / d;

        System.out.println("a+b= " + sumaA
                + " a-b=" + restaA
                + " a*b=" + multiplicacionA
                + " a/b=" + divisionA + "\n"
                + "c+d=" + sumaC
                + " c-d=" + restaC
                + " c*d=" + multiplicacionC
                + " c/d=" + divisionC);
        //e.
        b = c;
        c = a;
        a = b;

        System.out.printf("a=" + a + " b=" + b + " c=" + c);
        
       }
}
