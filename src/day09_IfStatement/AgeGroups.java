package day09_IfStatement;

public class AgeGroups {
    public static void main(String[] args){
        int age=40;
        if(age == 1 || age == 2){
            System.out.println("infant");
        }else if(age == 3 || age == 4 || age == 5){
            System.out.println("Toddler");
        }else if(age<=9 && age>=6){
            System.out.println("Kid");
        } else if (age>=10&&age<=12) {
            System.out.println("Pre-Teen");
        } else if (age<=17&&age>=13) {
            System.out.println("Teenager");
        } else if (age>=18&&age<=20) {
            System.out.println("Young Adult");
        }else if(age>=21&&age<=39){
            System.out.println("Adult");
        } else{
            System.out.println("DONT YOU THINK THAT YOU LIVED ENOUGH GO AND DIE!!");
        }
    }
}
/*
5. Create a class called AgeGroups, and write a program that can define
the age groups of a person
             age groups are:
                    infant (1 - 2)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult
(40 - 49),
                    Middle-Aged Adult (50 -
54),
                    Very Young Senior Citizen
(55 - 64),
                    Young Senior Citizen (65
- 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
 */