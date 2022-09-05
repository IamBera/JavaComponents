package day09_IfStatement;

public class PosNegZero {
    public static void main(String[] args){
        int n = -1;
        if(n > 0){
            System.out.println("positive");
        } else if (n < 0) {
            System.out.println("negative");
        } else if (n == 0) {
            System.out.println("zero");
        }

        System.out.println("---------------------------------------");
        boolean positive = n > 0 ;
        boolean negative = n < 0 ;
        boolean zero = n == 0;
        if(positive){
            System.out.println("positive");
        } else if (negative) {
            System.out.println("negative");
        }else if(zero){
            System.out.println("neutral");
        }


    }
}
