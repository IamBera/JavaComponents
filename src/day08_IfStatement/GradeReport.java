package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {
        System.out.println(true == !false); //true
        System.out.println(!true != false); //false
        System.out.println(!false == true); //true

        int score = 85;
        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score <= 89;
        if(a){
            System.out.println("excellent");
        }
        if(b){
            System.out.println("Good");
        }
        boolean c = score >= 70 && score <= 79 ;
        if(c){
            System.out.println("okay");
        }

    }
}
