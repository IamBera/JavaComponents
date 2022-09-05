package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {
        String str= "Java is fun, I love learning Java";
        String str2 = str.replace("Java" , "Python"); // new String object
        System.out.println(str);
        System.out.println(str2);
        String email="berakaya@gmail.com";
        email=email.replace("gmail" , "outlook");
        System.out.println(email);
        String s2= "C# is fun, C# is cool";

    }
}
