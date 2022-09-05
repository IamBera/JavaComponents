package day19_LoopPractices;

public class ExitMethod {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
           if (i ==3){
               //continue;// loopun o an ki kalanini atliyor
               //break;  loopu bitiriyor
               System.exit(0); // terminates the program
           }

            System.out.println(i);
        }
        System.out.println("wooden spoon");
    }
}
