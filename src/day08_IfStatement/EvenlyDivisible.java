package day08_IfStatement;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int number = 65;
        boolean f1 = number % 2 == 0;
        boolean f2 = number % 3 == 0;
        boolean f3 = number % 5 == 0;
        System.out.println(number + " is divisible by 2 = " + f1);
        System.out.println(number + " is divisible by 3 = " + f2);
        System.out.println(number + " is divisible by 5 = " + f3);
    }
}
