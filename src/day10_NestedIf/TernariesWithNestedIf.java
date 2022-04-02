package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int s=85;
/*
        if (s>=0 && s<=100){ //if the score is valid
            if (s>=60) {//if the student passed the exam
                System.out.println("Congrats,you passed");
            }else {//if the student failed the exam
                System.out.println("Failed");
            }
        }else{//if the score is not valid
            System.out.println("Invalid score");

        }
     */
        String result= (s>=0 && s<=100)? (s>=60)? "Passed" : "Failed": "Invalid score";
        System.out.println(result);

    }
}
