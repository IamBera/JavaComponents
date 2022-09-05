package day09_IfStatement;

public class MinNumber {
    public static void main(String[] args) {
        int n1 = 52;
        int n2 = 52;
        if (n1 < n2) {
            System.out.println(n1 + " is the minimum number");
        }
        if(n1 > n2){
            System.out.println(n2 + " is the minimum number");
        }
        if(n1 == n2){
            System.out.println("thoose numbers are equel");
        }
    }
}
