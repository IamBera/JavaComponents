package day04_Variables;

public class Rectangle {
    public static void main(String[] args) {
        int lengt = 6;
        int width = 5;
        int area = lengt * width;
        int perimeter = 2 * (lengt + width);

        System.out.println("lengt = " + lengt);
        System.out.println("width = " + width);
        System.out.println("area = " + area + "cm");
        System.out.println("perimeter = " + perimeter + "cm2");
    }

}
