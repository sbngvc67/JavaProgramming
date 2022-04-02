package day10_NestedIf;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double score;
        System.out.println("Enter Score");

        score= scan.nextDouble();


        /*
        90 ~ 100: excellent
        80 ~ 89: Great
        70 ~ 79: Good
        60 ~ 69: Passed
        0 ~ 59: failed
         */


        if (score>=0 && score<=100){
            //5 possibilities
            if (score>=90){
                System.out.println("Excellent");
            }else if (score>=80){
                System.out.println("Great");
            }else if (score>=70){
                System.out.println("Great");
            }else if (score>=60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else{
            System.out.println("Not a valid score");
        }

        String result=""; //temporary
        System.out.println(result);



    }
}
