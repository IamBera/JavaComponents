package day17_While_DoWhile;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("username?" );
        String u=scan.next();
        System.out.println("password?");
        String p = scan.next();

        if(u.equals("Cydeo") && p.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            int attempt = 3;
            while(!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempt > 0){
                if(attempt==1){
                    System.out.println("THIS IS YOUR LAST CHANCE!");
                }
                System.out.println("incorrect username or password, please reenter");
                System.out.println("enter username");
                u = scan.next();

                System.out.println("password?");
                p = scan.next();
                attempt--;
            }
            if(u.equals("Cydeo") && p.equals("Cydeo123")){
                System.out.println("Logged in");
            }else{
                System.out.println("Your account is locked");
            }
        }
    }
}
