package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();

        while(!(age >= 1 && age <= 120)){
            System.err.println("Invalid entry, please re-enter");
            age = scan.nextInt();
        }
        System.out.println("Are you a US cizizen? yes/no");
        String answer = scan.next();
        while(!(answer.equals("yes") && answer.equals("no"))){
            System.err.println("Invalid answer, re-enter please");
            System.out.println("Enter your age :  ");
            answer = scan.next().toLowerCase();

        }






        scan.close();
    }
}
