package day18_nestedLoops;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write your name:");
        String n=scan.next();
        System.out.println("Write your gender m/w/o:");
        String g=scan.next().toLowerCase();
        while(!(g.equals("woman") || g.equals("man"))){
            System.out.println("invalid gender, please write again");
            g=scan.next();
        }
        System.out.println("are you married? yes/no");
        String m = scan.next().toLowerCase();
        while(!(m.equals("yes") || m.equals("no"))){
            System.out.println("invalid answer, please re enter;");
            m= scan.next().toLowerCase();
        }

        System.out.println("write your age");
        int a = scan.nextInt();
        while(!(a>0 && a<=120)){
            System.out.println("invalid number, please reenter your age");
            a= scan.nextInt();
        }
        System.out.println("how many miles do you drives in a day?");
        int mil= scan.nextInt();
        while(!(mil>5)){
            System.out.println("Write your mileage");
            mil= scan.nextInt();
        }
        System.out.println("do you want full coverage or liability insurance? yes/no");
        String liability = scan.next().toLowerCase();
        while(!(liability.equals("yes") || liability.equals("no"))){
            System.out.println("invalid answer, please re enter;");
            liability= scan.next().toLowerCase();
        }
        System.out.println("do you had any accidents or claims in past 5 years? yes/no");
        String accident = scan.next().toLowerCase();
        while(!(accident.equals("yes") || accident.equals("no"))){
            System.out.println("invalid answer, please re enter;");
            accident= scan.next().toLowerCase();
        }
        System.out.println("does your car have an antitheft device? yes/no");
        String antitheft = scan.next().toLowerCase();
        while(!(antitheft.equals("yes") || antitheft.equals("no"))){
            System.out.println("invalid answer, please re enter;");
            antitheft= scan.next().toLowerCase();
        }
        int price=0;

        if(a<25){
            price += 90;
            if(liability.equals("yes")){
                price +=160;
            }
        }else {
            if(liability.equals("yes")){
                price+=120;
            }
            price += 50;
        }

        if(mil<=10){
            if(liability.equals("yes")){
                price+=20;
            }
            price +=10;
        } else if (mil>10 && mil<50) {
            if(liability.equals("yes")){
                price+=50;
            }
            price += 30;
        }else{
            if(liability.equals("yes")){
                price+=70;
            }
            price +=50;
        }
        int discount=0;
        if(antitheft.equals("yes")){
            discount= price/5;
        }
        int extracharge=0;
        int discount2=0;
        int discount3=0;
        if(accident.equals("yes")){
            extracharge= price/15;
            discount2= price/10;
        }
        if(m.equals("yes")){
            discount3=price/5;
        }

        price -=discount;
        price -=discount2;
        price -= discount3;
        price += extracharge;
        System.out.println("You have to pay " + price + "$ ");

        scan.close();




    }
}
