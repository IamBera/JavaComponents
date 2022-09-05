package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
       int month=12;
       String result="  ";
        if(month>=1&&month<=12){
            switch (month){

                case 1:
                    result="ocak";
                    break;
                case 2:
                    result="subat";
                    break;
                case 3:
                    result="MRT";
                    break;
                case 4:
                    result="NISAN";
                    break;
                case 5:
                    result="MAYIS";
                    break;
                case 6:
                    result="HAZIRAN";
                    break;
                case 7:
                    result="TEMMUZ";
                    break;
                case 8:
                    result="AUGUST";
                    break;
                case 9:
                    result="SEPTEMBER";
                    break;
                case 10:
                    result="OKTOBER";
                    break;
                case 11:
                    result="NOVEMBER";
                    break;
                case 12:
                    result="DEZEMBER";




            }
        }else{
            System.out.println("invalid number");
        }
        System.out.println(result);



    }
}
