package day08_IfStatement;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number = 200;
       boolean n1 = number > 0;
       boolean n2 = number < 0;
       boolean n3 = number == 0;

        System.out.println(number + " is positive number = " + n1);
        System.out.println(number + " is negative number = " + n2);
        System.out.println(number + " is 0 = " + n3);
    }
}
