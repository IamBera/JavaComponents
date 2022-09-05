package day04_Variables;

import jdk.swing.interop.SwingInterOpUtils;

public class Circle {
    public static void main(String[] args) {
        double PI = 3.14;
        double radius = 5.5;
        double diameter = radius * 2;
        double area = radius * radius * PI;
        double perimeter = PI * diameter;

        System.out.println("PI = " + PI);
        System.out.println("radius = " + radius);
        System.out.println("diamter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
