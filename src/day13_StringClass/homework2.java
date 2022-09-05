package day13_StringClass;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please write a word");
        String w1=input.next();
        System.out.println("write noch mal bitte");
        String w2=input.next();
        int totalcharsw1=w1.length();
        int totalcharsw2=w2.length();
        System.out.println(totalcharsw1);
        System.out.println(totalcharsw2);
        input.close();

        if(totalcharsw1>totalcharsw2){
            System.out.println(w1);
        }else{
            System.out.println(w2);
        }

    }
}
/*
write a program that asks user to enter two strings, and print out the
longest string
 */