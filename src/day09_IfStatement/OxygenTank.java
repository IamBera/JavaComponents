package day09_IfStatement;

public class OxygenTank {
    public static void main(String[] args) {
        int oxygenTank = 50;
        if(oxygenTank >= 90 && oxygenTank <= 99){
            System.out.println("Your tank is full");
        }else if(oxygenTank >= 80 && oxygenTank <= 89){
            System.out.println("Still okay");
        } else if (oxygenTank >= 70 && oxygenTank <= 79) {
            System.out.println("Dont go too far");
        } else if (oxygenTank >= 60 && oxygenTank <= 69) {
            System.out.println("Start to head back");
        } else if (oxygenTank >= 50 && oxygenTank <= 59) {
            System.out.println("Be carefull you are at %50");
        }else{
            System.out.println("you dead");
        }
    }
}
/*
Create a class called OxygenTank. You are diving in the ocean. Your
oxygen tank has a certain level (number) and you must print a message
based on the level:
Above 90 -  Your tank is full
Above 80 -  Still okay
Above 70 -  Don't go too far
Above 60 -  Start to head back
Above 50 -  Be careful now you at at 50%
USE ONE PRINT STATEMENT ONLY
 */