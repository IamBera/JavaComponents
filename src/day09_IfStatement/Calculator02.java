package day09_IfStatement;

public class Calculator02 {
    public static void main(String[] args) {
        double salary = 1350000 ;
        boolean isMarried = false;
        int taxRate1= 35,taxRate2= 30,taxRate3=25,taxRate4=20;

        if(isMarried){
            taxRate1 -=5;
            taxRate2-=5;
            taxRate3-=5;
            taxRate4-=5;
        }

        if(salary >= 130000){
          //  System.out.println(salary/taxRate2);
          salary=salary-(salary/100*taxRate1);

        } else if (salary <= 130000 && salary>=100000) {
            salary=salary-(salary/100*taxRate2);
        }

        System.out.println("salary = " + salary);

    }
}
/*
Write a program that can calculate the salary after tax based on the
following requirements

the tax rates are:
35% for salary of 130K or more
30% for salary of 100K to 130k
(excluded)
25% for salary of 80K to 100K
(excluded)
20% for salary less than 80K
in addition, if the person is married, he/she will pay 5%
less tax
 */