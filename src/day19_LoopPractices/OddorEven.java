package day19_LoopPractices;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        while(true){
            System.out.println("enter a number");
            int num= scan.nextInt();

            if(num%2==0){
                System.out.println("even number");
            }else{
                System.out.println("odd number");
            }
            System.out.println("would you like to enter another number?(yes/no)");
            String a=scan.next();

            if(!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))){
                System.out.println("invalid entry,cya punk!!");
                System.exit(0);
            }

            if(a.equalsIgnoreCase("no")){
                System.out.println("thank you");
                break;
            }



        }
        scan.close();
    }
}
