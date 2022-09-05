package day18_nestedLoops;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Do you want to reserve a room? yes/no");
        String reservation= scan.next().toLowerCase();

        while(!(reservation.equals("yes") || reservation.equals("no"))){
            System.out.println("invalid answer, please reenter;");
            reservation= scan.next().toLowerCase();
        }
        String room="";
        if(reservation.equals("yes")){
            System.out.println("Which type of room do you want to reserve?\nKing Bed ==> 120$\nQueen Bed ==> 100$\nsingle Bed ==> 80$");
             room= scan.next().toLowerCase();
        }else {
            System.out.println("Have a nice day");

        }
        while((room.equals("king bed") && room.equals("queen bed") && room.equals("single bed"))){
            System.out.println("invalid answer,which type of room do you want to reserve?");
            room=scan.next().toLowerCase();
        }
        System.out.println("You have selected " + room);
        scan.close();


    }
}
//5. Create a class called RommReservation, write a program for the room
//reservation, your program asks the user wants to reserve a room.
//if user entered yes, then ask which type of room the user
//wants to reserve. if user entered no, print "have a nice day"
//(if user entered any invalid answer (other
//than yes/no) ask user to reenter until user provides a valid entry)
//            King Bed ==> 120$
//            Queen Bed ==> 100$
//            single Bed ==> 80$
//the program should be able to display the room he/she reserved
//and total price of the room.
//(if the user selected an invalid room, ask the user to
//reselect the room until user provides a valid entry)