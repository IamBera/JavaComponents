package day17_While_DoWhile;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        //1. Write a program that can divide two positive numbers without
        //using / (division) and * (multiplication) operators.

        int firstnumber = 89;
        int secondnumber = 5;
        int divide = 0;

        while (firstnumber >= secondnumber) {
            firstnumber -= secondnumber;
            divide++;
        }
        System.out.println(divide + " with a remainder of " + firstnumber);


        System.out.println("------------------------------------------------");


        int price=200;
        int discount=0;

        discount=price/5;
        System.out.println(discount);



    }

}
