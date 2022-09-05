package day11_Switch_Scanner;

public class daysOfMonths {
    public static void main(String[] args) {
        int month=12;
        String result="  ";
        if(month>=1&&month<=12){

            switch (month) {
                case 2:
                    System.out.println("28 days");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 days");
                    break;
                default:
                    System.out.println("31 days");
            }

        }else{
            System.out.println("invalid");




        }
    }
}
