package day13_StringClass;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("schreib ein Wort");
        String w=scan.next();
        char fw=w.charAt(0);
        char lw=w.charAt(w.length()-1);
        if(fw==lw){
            System.out.println("first and last words are same");
        }else{
            System.out.println("first and last words are not same");
        }
        scan.close();
    }
}
/*
write a program that can check if the first and last characters of the
string are same
ex:
level
output:
same
 */