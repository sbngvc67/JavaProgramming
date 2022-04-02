package week09;

public class CustomMethodsPractice01 {
    public static void main(String[] args) {

        int personOneAge=10;

 /*       if (personOneAge>21){
            System.out.println("Eligible");
        }else{
            System.out.println("not eligible to buy");
        }

  */
        eligibleOrNot(22);

    }

    public static void eligibleOrNot(int age ){
        if (age>21){
            System.out.println("Eligible");
        }else{
            System.out.println("not eligible to buy");
        }

    }
}
