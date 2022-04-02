package day10_NestedIf;

import java.util.Scanner;

public class GradeReport2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double score;
        System.out.println("Enter Score");

        score = scan.nextDouble();


        /*
        90 ~ 100: excellent
        80 ~ 89: Great
        70 ~ 79: Good
        60 ~ 69: Passed
        0 ~ 59: failed
         */

/*
        if (score>=0 && score<=100){
            //5 possibilities
            if (score>=90){
                System.out.println("Excellent");
            }else if (score>=80){
                System.out.println("Great");
            }else if (score>=70){
                System.out.println("Good");
            }else if (score>=60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else{
            System.out.println("Not a valid score");
        }
        */

        String result = ""; //temporary
        System.out.println(result);
        System.out.println("----------------------------------");

        //solution 2: use ternaries ONLY
        String result2 = (score >= 0 && score <= 100) ? (score >= 90) ? "Excellent" : (score >= 80) ? "Great" : (score >= 70) ? "Good"
                : (score >= 60) ? "Passed" : "Failed" : "Invalid Score";

        System.out.println("result2 = " + result2);

        System.out.println("----------------------------------");

        String result3="";

        if (score >= 0 && score <= 100);{

            result3 = (score >= 90) ? "Excellent" : (score >= 80) ? "Great" : (score >= 70) ? "Good" : (score >= 60) ? "Passed" : "Failed";

        }{
            result3= "Invalid Score";
        }

        System.out.println(result3);







    }
}
