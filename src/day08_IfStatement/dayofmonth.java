package day08_IfStatement;

public class dayofmonth {
    public static void main(String[] args) {
       int number = 5;
        boolean months31days = number == 1 || number == 3 || number == 5 || number== 7 || number== 8 || number== 10 || number == 12 ;
        boolean has28days = number == 2;
        boolean has30days = number == 4 || number==6 || number==9 || number==11;

        if(months31days){
            System.out.println("these month has 31 days");
        }
        if(has28days){
            System.out.println("it has 28 days");
        }
        if(has30days){
            System.out.println("it has 30 days");
        }


    }
}


// 31: 1 3 5 7 8 10 12