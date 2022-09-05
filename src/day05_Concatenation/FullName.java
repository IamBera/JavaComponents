package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Conor";
        String lastName = "Khabib";
        int age = 45;
        String companyName = "Apple INC";
        String  jobTitle = "SDET";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;
        System.out.println("Full name of the person is " + fullName + " and "+ firstName + " is " + age + " years Old.");


        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + ", and " +fullName + "'s salary is $" + salary);
    }
}
