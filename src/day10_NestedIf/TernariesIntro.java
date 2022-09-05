package day10_NestedIf;

import jdk.swing.interop.SwingInterOpUtils;

public class TernariesIntro {
    public static void main(String[] args) {
        int n = 100;

        if(n%2 == 0){
            System.out.println("even");
        }else{
            System.out.println("Odd");
        }

        System.out.println("-----------------------------------------------");
        String result1 = (n%2 == 0)? "Even" : "Odd" ;
        System.out.println(result1);
        System.out.println("------------------------------------------------");
        int age= 23;
        if(age >=21){
            System.out.println("eligible");
        }else{
            System.out.println("not eligible");
        }

        System.out.println( (age>=21)?"eligible" : "not eligible");
        System.out.println("-----------------------------------------------");

        int number = 0;
        if(number>0){
            System.out.println("positive");
        } else if (number<0) {
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
        System.out.println("--------------------------------------------");
        System.out.println((number>0)? "positive" :(number<0)? "negative":"zero");

    }
}
