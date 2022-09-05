package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter your age");
        int age =input.nextInt();
        input.nextLine();
        System.out.println("enter your gendet");
        String gender=input.next();
        System.out.println("enter your fullname");
        input.nextLine();
        String fullname=input.nextLine();
        System.out.println("enter your phone number");
        long number=input.nextLong();
        System.out.println("enter your zip code");
        int zipcode=input.nextInt();
        System.out.println("enter your school name");
        input.nextLine();
        String schoolname=input.nextLine();
        System.out.println("enter your city name");
        String cityname=input.nextLine();
        System.out.println("enter your state name");
        String statename=input.next();
        System.out.println("enter your building name");
        input.nextLine();
        String buildingname=input.nextLine();
        System.out.println("enter your street name");
        String streetname=input.nextLine();
        input.close();
        System.out.println(age);
        System.out.println(gender);
        System.out.println(fullname);
        System.out.println(number);
        System.out.println(zipcode);
        System.out.println(schoolname);
        System.out.println(cityname);
        System.out.println(statename);
        System.out.println(buildingname);
        System.out.println(streetname);
    }
}
/*

1. Enter your age (int)
2. Enter your gender (String- One word ONLY)
3. Enter your full name (String- Multiple
words)
4. Enter your phone number (long)
5. Enter your zip code (int)
6. Enter your School name (String- Can be
Multiple words)
7. Enter your city name (String- Can be
Multiple words)
8. Enter your state name (String- One word
ONLY)
9. Enter your building number (int)
10. Enter your Street name
 */