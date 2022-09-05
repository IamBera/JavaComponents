package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {
        double number1= 4;
        double number2= 7;
        char operator= '*';
        boolean validoperator= operator=='+'||operator=='-'||operator=='*'||operator=='/';
        double s=0;
        if(validoperator){
            switch(operator){
                case '+':
                    System.out.println(number1+number2);
                 break;
                case '-':
                    System.out.println(number1 - number2);
                    break;
                case '*':
                    System.out.println(number1 * number2);
                    break;
                default:
                    System.out.println(number1/number2);


            }



        }else{
            System.out.println("invalid operator: " + operator);
        }

    }
}
