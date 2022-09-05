package day18_nestedLoops;

import java.util.Scanner;

public class Loggin {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("username?");
        String u=scan.next();
        System.out.println("password?");
        String p=scan.next();

        if(u.equals("Cydeo") && p.equals("WoodenSpoon")){
            System.out.println("LOGGED IN!");
        }else{
            for (int i = 1; i < 3; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("username?");
                u =scan.next();
                System.out.println("password?");
                p =scan.next();

                if(u.equals("Cydeo") && p.equals("WoodenSpoon")){
                    System.out.println("LOGGED IN!");
                    break;
                }
                if(i==1){
                    System.out.println("last chance!");
                }
            }
        }
        scan.close();
    }
}
