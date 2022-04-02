package week04;

public class TernaryExample {
    public static void main(String[] args) {
        int score=25;
        String result="";
        if (score>60){
            result="passed";
        }else{
            System.out.println("Failed");
        }
        //
        int score2=65;
        String result2=(score>60)? "Pass":"Fail";
        System.out.println("result2 = " + result2);

        System.out.println((score2>60)? "Pass":"Fail");



    }
}
