package day15_ForLoop;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("-----------------------------------------");
        int total = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number");
        total += scan.nextInt();
        System.out.println(total);
        scan.close();
    }


}
