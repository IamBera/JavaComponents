package day09_IfStatement;

import java.util.Scanner;

public class CharacterIdentity {
    public static void main(String[] args) {
       // char n= 'A';
Scanner scan=new Scanner(System.in);
        System.out.println("Please enter any character you want");
        char n=scan.next().charAt(0);
        if(n <= 97 && n >= 122){
            System.out.println("lowerletter");
        } else if (n <= 90 && n >= 65) {
            System.out.println("upperletter");
        } else if (n > 47 && n < 58) {
            System.out.println("digit");
        }else{
            System.out.println("special chars");
        }

        scan.close();
    }
}
/*
4. Create a class called Character Identity, and write a program that can
identify if the given character is a digit or Alphabetic Character(A~Z
or a~Z) or a special character
Ex:
ch = '@'
output:
Special Character
HINT: You may wanna check out the numbers of the
chracters on ASCII table
 */
