package day09_IfStatement;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 62;
        double n2 =10 ;
        char mathOperator = '*';

        if(mathOperator =='+'){
            System.out.println(n1 + n2);
        }
        if(mathOperator == '*'){
            System.out.println(n1 * n2);
        }
        if(mathOperator == '-'){
            System.out.println(n1 - n2);
        }
        if(mathOperator == '/'){
            System.out.println(n1 / n2);
        }
    }
}
