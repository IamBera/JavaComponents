package day13_StringClass;

import java.util.Locale;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("your first name?");
        String firstName= scan.next();
        System.out.println("your last name?");
        String lastName=scan.next();
        char f = firstName.charAt(0);
        char l = lastName.charAt(0);
        String initial = f + "." +l + ".";
        System.out.println("initial = " + initial);
        String s1 =" Batch 25 is the best batch.";
        int totalChars= s1.length();
        System.out.println("total chars = " + totalChars);
        char lastChar=s1.charAt(s1.length()-1);
        System.out.println("last char = " + lastChar);
        scan.close();
        System.out.println("--------------------------------------------");
        String str= "wooden spoon";
        str= str.toUpperCase();
        System.out.println(str);

    }
}
