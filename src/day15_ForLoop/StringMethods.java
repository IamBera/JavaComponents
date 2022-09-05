package day15_ForLoop;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String str=" ";
        boolean r=str.isEmpty();
        System.out.println(r);
        boolean r1=str.isBlank();
        System.out.println(r1);
        String str2="      ";
        System.out.println(str2.isBlank());
        System.out.println("--------------------------");
        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String sentence="my favorite programmin language is Java";
        boolean hasCSharp = sentence.contains("C#");
        System.out.println(hasCSharp);
        System.out.println("---------------------");
        String input1 ="I love jAvA";
        String input2 = "Java";
        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equalsIgnoreCase(input2));//false
        System.out.println(input1.contains("Java"));//false
        System.out.println(input1.toLowerCase().contains("java"));//true
        System.out.println(input1.toUpperCase().contains("JAVA"));//true
        System.out.println("-----------------------------------------------");
        String a = "Wooden Spoon";
        boolean b=a.startsWith("Woo");
        System.out.println(b);

    }
}
