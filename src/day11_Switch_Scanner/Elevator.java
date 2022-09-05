package day11_Switch_Scanner;

public class Elevator {
    public static void main(String[] args) {
        int floorNumber = 4;
        String result="";
        if(floorNumber>=1&&floorNumber<=3){

            switch (floorNumber){
                case 1:
                    result="Floor 1 selected. Companies: Lobby Verizon Starbucks";
                    break;
                case 2:
                    result="Floor 2 selected. Companies: Cybertek, Nasa, Intelsat";
                    break;
                default:
                    result="Floor 3 selected. Companies: Lyft, BofA, Stake house";

            }

        }else{
            result="Invalid floor- "+ floorNumber;
        }
        System.out.println(result);
    }
}
