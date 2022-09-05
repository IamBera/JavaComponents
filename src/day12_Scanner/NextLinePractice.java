package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter your age");
        int age=input.nextInt();
         input.nextLine();
        System.out.println("enter your full name");
        String fullName=input.nextLine();
        System.out.println("enter your school Name");
        String schoolname= input.nextLine();


        System.out.println("enter your GPA");
        double GPA= input.nextDouble();
        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("schoolname = " +schoolname );
        System.out.println("gpa= " + GPA);
        input.close();
    }
}
