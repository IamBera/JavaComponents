package day18_nestedLoops;

import java.util.Scanner;

public class Odd0rEven {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        while(true){
            System.out.println("enter a number");
            int num = scan.nextInt();

            if(num%2 == 0){
                System.out.println( num + " is Even number");
            }else {
                System.out.println(num + " is odd number");
            }
            System.out.println("would you like to enter another number?");
            String a = scan.next().toLowerCase();
            while(!(a.equals("yes") || a.equals("no")) ){
                System.out.println("please re enter, would you like to enter another number?");
                a = scan.next().toLowerCase();
            }

            if(a.equals("no")){
                break;
            }
        }
        scan.close();
    }
}
