package day07_Operators;

import jdk.swing.interop.SwingInterOpUtils;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 = +25;
        int num2 = -25;

        System.out.println( num1 < 0 );
        System.out.println( num2 < 0 );

        System.out.println("--------------------------------------------");
        int a = 5;
        ++a;
        System.out.println(a);
        --a;
        System.out.println(a);
        System.out.println("-------------------------------------------------");
        int b =  100;
        System.out.println(++b); // soldan ekleyince direkt 1 arttiriyor
        int c = 100;
        System.out.println(c++); // post increment: sonrakini 1 arttiriyor
        System.out.println(c);
        System.out.println("-------------------------------------------------");
        int x = 200;
        System.out.println( --x  ); //pre
        int y = 200;
        System.out.println( y-- ); //post

        System.out.println("-----------------------------------");
        int z = 45;
        System.out.println( ++z); //z:46
        System.out.println( z++); //46, z:46
        System.out.println(z); //z:47

        int q = 30;
        System.out.println(--q ); //29, q = 29
        System.out.println(q--); // 29, q = 28
        System.out.println(q); // 28









    }
}
