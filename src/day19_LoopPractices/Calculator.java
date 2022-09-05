package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int num1 = scan.nextInt();
        System.out.println("enter a math operator (+/-)");
        char opera= scan.next().charAt(0);

        if( !(opera== '+' || opera== '-')){
            System.out.println("invalid  math operator : " + opera);
            System.exit(0);
        }
        System.out.println("enter a number");
        int num2=scan.nextInt();

        if(opera=='+'){
            System.out.println(num1+num2);
        }else {
            System.out.println(num1-num2);
        }
    }

}
