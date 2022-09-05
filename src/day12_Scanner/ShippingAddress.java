package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("please enter your full name");
        String name=input.nextLine();
        System.out.println("please enter your building number");
        int buildingNumber=input.nextInt();
        input.nextLine();
        System.out.println("please enter your Street name");
        String streetName=input.nextLine();
        System.out.println("please enter your city Name");
        String cityName=input.nextLine();
        System.out.println("please enter your state");
        String state= input.nextLine();
        System.out.println("please enter your zipcode");
        String zipcode= input.next();
        System.out.println("full name= " + name);
        System.out.println("building number= " +buildingNumber);
        System.out.println("street name= " + streetName);
        System.out.println("city name = " +cityName);
        System.out.println("state= " + state);
        System.out.println("zipcode = " + zipcode);
        input.close();

    }
}
