package day11_Switch_Scanner;

public class CappucinoBuyer {
    public static void main(String[] args) {
        String size="tall";
        boolean validSize= size=="tall"||size=="grande"||size=="venti";

        if(validSize){
            switch (size){
                case "tall":
                    System.out.println("Price is $3.69; \n90 calories");
                    break;
                case "grande":
                    System.out.println("Price is $3.99; \n120 calories ");
                    break;
                default:
                    System.out.println("Price is $4.29;\n150 calories");

            }


        }else{
            System.out.println("Invalid Size");
        }
    }
}
