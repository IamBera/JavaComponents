package day18_nestedLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        while (true) {

            System.out.println("enter your first number");
            int num1 = scan.nextInt();
            System.out.println("enter your second number");
            int num2 = scan.nextInt();

            System.out.println("Addition: " + (num1 + num2));
            System.out.println("Would you like to continue? yes/no");
            String a = scan.next().toLowerCase();
            while (!(a.equals("yes") || a.equals("no"))  ) {
                System.out.println("invalid entry, please re enter");
                a = scan.next().toLowerCase();
            }
            if(a.equals("no")){
                break;
            }
        }

    }
}
