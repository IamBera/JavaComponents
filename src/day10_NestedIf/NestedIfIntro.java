package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 98;
        if (score >= 0 && score <= 100) {
            if (score >= 60) {

                System.out.println("Pass");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid Score");
        }

        System.out.println("-----------------------------------------");

        int number = 7;
        if(number>=1 && number<=7){

            if(number==1){
                System.out.println("monday");
            }else if(number==2){
                System.out.println("tuesday");
            }else{
                System.out.println("wednesday thursday fridday saturday sunday");
            }

        }else{
            System.out.println("Invalid Number");
        }




    }






}