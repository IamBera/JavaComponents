package day18_nestedLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter a number");
        int n1=scan.nextInt();
        System.out.println("enter a math operator (+,-,*,/)");
        String o=scan.next();
        System.out.println("enter a number");
        int n2=scan.nextInt();
        int result=0;
        if(o=="+"){
            result=n1 + n2;
        } else if (o=="-") {
            result=n1 - n2;
        } else if (o=="*") {
            result=n1*n2;
        } else if (o=="/") {
            result=n1/n2;
        }else{
            System.out.println("invalid operator");
            System.out.println("please reenter a math operator");
            o=scan.next();
        }
        System.out.println(result);
    }
}
