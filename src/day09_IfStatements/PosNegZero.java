package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {
        int n=0;

        boolean positive= n>0, negative=!positive, zero=!positive&&!negative;

        if (positive){
            System.out.println("Positive");

        }else if(negative){
            System.out.println("Negative");

        }else{
            System.out.println("Zero");
        }


        if (n>0){
            System.out.println("Positive");

        }else if(n<0){
            System.out.println("Negative");

        }else{
            System.out.println("Zero");
        }



    }
}
