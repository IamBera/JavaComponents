package day11_Switch_Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        int number =4  ;
        String words="";
        if(number>=1 && number<=9){

            if(number==1){
                words="one";
            } else if (number==2) {
                words="two";
            }else if (number==3) {
                words="three";
            }else if (number==4) {
                words="four";
            }else if (number==5) {
                words="five";
            }else if (number==6) {
                words="six";
            }else if (number==7) {
                words="seven";
            }else if (number==8) {
                words="eight";
            }else{
                words="nine";
            }


        }else{
            System.out.println("Invalid Number");
        }
        System.out.println(words);

        System.out.println("-----------------------------------------------------");
        String result= (number>=1 && number<=9)? (number==1)? "One": (number==2)? "Two":(number==3)?"Three":(number==4)?"Four":(number==5)?"five":(number==6)?"six":(number==7)?"seven":(number==8)?"eight":"nine":"Invalid Number";
        System.out.println(result);





    }
}
