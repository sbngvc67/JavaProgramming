package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        int maxNumber=max(5,7);
        System.out.println(maxNumber);

        int multiplatication=maxNumber*2;
        System.out.println(multiplatication);

    }

    public static int max(int a, int b){
        int result=0;

        if (a>b){
            result=a;
        }else{
            result=b;
        }
        return result;
    }

}
