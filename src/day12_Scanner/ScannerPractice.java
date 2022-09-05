package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7:");
        int num = scan.nextInt();
        String result="";
        if(num>=1 && num<=7 ){

            result= (num==1)?"mondy":(num==2)?"sali":(num==3)?"crsmb":(num==4)?"persmb":(num==5)?"friday":(num==6)?"saturday":"sunday";

        }else {

            result="Invalid Number";
        }
        System.out.println(result);
        scan.close();
    }


}
