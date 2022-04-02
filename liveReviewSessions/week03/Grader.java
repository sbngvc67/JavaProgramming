package week03;

public class Grader {
    public static void main(String[] args) {
        //for a given grade
        /*
        System.out.println(true == !false); //true
        System.out.println(!true != false); //false
        System.out.println(!false == true);//true

        System.out.println(!!false); //false
        System.out.println(!!!true); //false
    /*

    }
}
/*
90
 */

            int score = 65; //0 ~100

            boolean a = score >= 90 && score <= 100;
            boolean b = score >= 80 && !a;
//      boolean b= score >=80 && score<=89;
            boolean c = score >= 70 && !b && !a;
            boolean d = score >= 60 && score <= 69;
            boolean f = !a && !b && !c && !d;
/*
            if (a) {//if the student made A
                System.out.println("Excellent");
            }
            if (b) {
                System.out.println("Great");
            }

            if (c){
                System.out.println("Good");
            }
            if(d) {
                System.out.println("Passed");
            }

            if(f) {
                System.out.println("Failed");
            }







*/
        if (score >= 90 && score <= 100) {//if the student made A
            System.out.println("Excellent");
        }
        if (score >= 80 && !a) {
            System.out.println("Great");
        }

        if (score >= 70 && !b && !a){
            System.out.println("Good");
        }
        if(score >= 60 && score <= 69) {
            System.out.println("Passed");
        }

        if(!a && !b && !c && !d) {
            System.out.println("Failed");
        }

        System.out.println("----------------------------");



        }}
