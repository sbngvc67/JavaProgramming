package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstName="Saban";
        String lastName="Gövec";
        String fullName= firstName+" "+lastName;
        int age= 45;
        String jobTitle= "SDET";
        String companyName= "Apple Inc.";
        double salary= 100000.58;

        System.out.println("fullName = " + fullName);


//FulL name of the person is ________
        System.out.println("Full name of the person is "+ fullName+".");

        System.out.println(fullName+ " is "+age+" years old.");

        //fullName is JobTitle, works at CompanyName, and fullName' salary is Salary.

        System.out.println(fullName+" is "+jobTitle+", works at "+ companyName+", and "+fullName+"'s salary is $"+salary+".");




    }






}
