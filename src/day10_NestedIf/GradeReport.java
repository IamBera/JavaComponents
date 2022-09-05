package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args){
        int score = 73;

        if(score>=0&&score<=100){

            if(score>=90&&score<=100){
                System.out.println("Excellent");
            } else if (score>=80&&score<=89) {
                System.out.println("Great");
            } else if (score>=70&&score<=79) {
                System.out.println("Good");
            } else if (score>=60&&score<=69) {
                System.out.println("Passed");
            }else{
                System.out.println("failed you bastard");
            }

        }else{
            System.out.println("Invalid Score");
        }

        System.out.println("----------------------------------------------");
        String results= (score>=0&&score<=100)? (score>=90)? "excellent":(score>=80)? "great":(score>=70)? "good":(score>=60)? "good":(score>=50)? "passed": "failed":"invalid score";
        System.out.println(results);
    }
}
