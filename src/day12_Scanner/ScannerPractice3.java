package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter your full name");
        String fullName= input.nextLine();
        System.out.println("enter your programming language");
        String programminglanguage= input.nextLine();
        System.out.println("enter your age:");
        int age= input.nextInt() ;
        System.out.println("enter your school name:");
        String schoolName= input.nextLine();
        System.out.println(fullName);
        System.out.println(programminglanguage);
        System.out.println(age);
        System.out.println(schoolName );
        input.close();
    }
}
