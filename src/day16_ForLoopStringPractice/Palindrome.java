package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {
        String str="JAVA";
        String result="";
        for(int i = str.length()-1 ; i>=0 ; i--){
            result +=str.charAt(i);
        }

        System.out.println(result);



    }
}
