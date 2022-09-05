package day15_ForLoop;

public class XD {
    public static void main(String[] args) {
        for (int i=1; i<=55; i++){
            if(i % 2 == 0){
                System.out.print(i+ " ");
            }
        }
        System.out.println(" ");
        for (char word= 65; word<=90; word++){
            System.out.print(word + " ");
        }
        System.out.println("");
        for (char i = 'a'; i<='z';i++){
            System.out.print(i+ " ");
        }

    }
}
