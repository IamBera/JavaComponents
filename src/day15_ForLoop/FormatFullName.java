package day15_ForLoop;

import java.util.Locale;

public class FormatFullName {
    public static void main(String[] args) {
       String fistName="cyDEo";
       String lastName ="SCHOOL";
       String firstName=fistName.substring(0,1).toUpperCase() + fistName.substring(1).toLowerCase();
       lastName =lastName.substring(0,1)+lastName.substring(1).toLowerCase();
        System.out.println(firstName + lastName);


    }
}
