package day10_NestedIf;

public class Grade {
    public static void main(String[] args) {
        char grade = 'L';
        String result=(grade=='A')? "Excellent":(grade=='B')? "Great Job":(grade=='C')? "Passed":(grade=='F')?"Failed":"Invalid";
        System.out.println(result);


        System.out.println("---------------------------------------------------------");

        switch (grade){
            case 'A':
                System.out.println("exclnt");
                break;
            case 'B':
                System.out.println("great jb");
                break;
            case 'C':
                System.out.println("good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("failed");
                break;
            default:
                System.out.println("INvalid gerara here");
        }












    }
}
/*
3. Create a class called Grade, a char variable named grade is given.
write a program to print the following messages:
'A': excellent
'B': great job
'C': good
'D': passed
'F': failed
other wise: invalid
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
 */
