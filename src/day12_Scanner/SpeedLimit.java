package day12_Scanner;

import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the current speed");
        int currentSpeed=input.nextInt();
        if (currentSpeed>=55){
            System.out.println("You're driving "+(currentSpeed-55)+ " mph over the limit. Slow down!");
        }else{
            System.out.println("Everthing is okay. Keep drive like this you dumbass");
        }
     input.close();
    }
}
/*
Write a program for the speed check. a variable named speedLimit is
given and assigned, ask user to enter the current speed, if the
current speed is over the speedLimit print slow down, otherwise do not
print anything
Ex:
speedLimit = 55;
Enter current speed:
105
output:
You're driving 50 mph over the limit. Slow down!
 */