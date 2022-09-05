package day12_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class circleAreaPerimeter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("PLEASE WRITE THE RADIUS OF CIRCLE");
        double r= input.nextDouble();
        input.close();
        double area= r * r *3.14;
        double perimeter = 2 * r * 3.14;
        System.out.println("area= " + area);
        System.out.println("perimeter= " + perimeter);

    }
}
