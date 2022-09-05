package day09_IfStatement;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 30,
                b = 15,
                c = 20;
        boolean aIsMedian = (a > b && a < c) || (a > c && a < b) ;
        boolean bIsMedian = (b > a && b < c) || (b > c && b < a);
        boolean cIsMedian = (c > a && c < b) || (c > b && c < a);

        if (aIsMedian) {
            System.out.println("a is median");
        }
        if(bIsMedian){
            System.out.println("b is median");
        }
        if(cIsMedian){
            System.out.println("c is median");
        }
    }
}
