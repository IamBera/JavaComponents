package day18_nestedLoops;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        while (true){
            System.out.println("enter your age: ");
            int age = scan.nextInt();

            while(!(age >= 1 && age <= 120)){
                System.out.println("Invalid Entry, Please re-enter your age");
                age = scan.nextInt();
            }

            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase();

            while( !(a.equals("yes")|| a.equals("no")) ){
                System.out.println("invalid entry, please reenter");
                a = scan.next().toLowerCase();

            }
            if(a.equals("no")){
                break;
            }
        }


        scan.close();
    }
}
