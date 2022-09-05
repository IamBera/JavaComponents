package day13_StringClass;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("write a sentence");
        String sentence=scan.nextLine();
        char firstchar=sentence.charAt(0);
        char lastChar=sentence.charAt(sentence.length()-1);
        System.out.println(""+firstchar+lastChar);
        scan.close();

    }
}
/*
 write a program that asks user to enter a sentence.
then print the first & last characters of the sentence
 */