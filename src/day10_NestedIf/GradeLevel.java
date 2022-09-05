package day10_NestedIf;

public class GradeLevel {
    public static void main(String[] args) {
        int grade = 18;
        String level = (grade>=1 && grade<=18)? (grade>=1&&grade<=5)? "elementary school":(grade>=6&&grade<=8)? "Middle School":(grade>=9&&grade<=12)? "High school":(grade>=13&&grade<=16)? "College":"Grad School":"Invalid Number";
        System.out.println(level);

    }
}
/*
1. Create a class called GradeLevel, Given a number(byte) grade level
determine and print which school type someone is in.
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
For Any Other grade: Invalid grade level given
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
 */