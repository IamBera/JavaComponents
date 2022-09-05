package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Steven";
        int age = 19;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";

        System.out.println(name + " is eligible to vote: " + isEligible);
        System.out.println("-------------------------------------------------------");
        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 19;
        int income = 40000;

        boolean q2 = creditScore >= 700 && age2 >= 21 && income >= 60000;
        System.out.println(name2 + " is eligible for loan: " + q2);

        String name3= "shay";
        int age3 = 21;
        char gender = 'F';

        boolean iseligible3 = age3 >= 18 && (gender == 'F' || gender == 'M');
        System.out.println(iseligible3);
        System.out.println("-----------------------------------------------");

        String name4 = "James";
        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;
        boolean iseligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;
        System.out.println(name4 + " is eligible to apply for US citizenShip: " + iseligible4);

        System.out.println("----------------------------------------------");

        String student = "anna";

        double gpa = 3.5;
        int familyIncome = 100000;

        boolean scholarship = gpa >= 3.5 || familyIncome <= 60000;
        System.out.println(student+ " can take scholarship: " + scholarship);

        System.out.println("---------------------------------");

        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;
        System.out.println(passed);
        System.out.println(failed);









































    }
}
