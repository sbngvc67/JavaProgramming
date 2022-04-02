package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
    /*28 Days:2
    30 Days: 4,6,9,11
    31 Days: 1,3,5,7,10,12
     */

        int number=0;
        int year=2000;
        String result;

        if (number>=1 && number<=12){

            switch (number){
                case 2:
                    result=(year%4==0)?"29 Days": "28 Days";
                    break;

                case 4: case 6: case 9: case 11:
                    result="30 Days";
                    break;
                default:
                    result="31 Days";


}
        }else{
            result="Invalid number";

        }
        System.out.println(result);
}}
