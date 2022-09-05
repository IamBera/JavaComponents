package day07_Operators;

public class Casting {
    public static void main(String[] args) {
        float averageScore = 20.5f;
        byte num1 = (byte) averageScore;
        System.out.println("num1 = " + num1);
        short num2 = (short) averageScore;
        System.out.println("num2 = " + num2);
        int num3 = (short)averageScore;
        float num4 = averageScore;
        double num5 = averageScore;
        long num6 = (long) averageScore;

        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
    }
}
