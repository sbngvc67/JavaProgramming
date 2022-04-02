package day11_Switch_Scanner;

public class NameOfMonth {
    public static void main(String[] args) {
/*
        int number=0;
        String result="";

        if (number>=1 && number<= 12) {
            //12 possibilities

            if (number==1) {
            result="January";
            }else if (number==2) {
            result="February";
            }else if (number==3) {
            result="March";
            }else if (number==4) {
            result="April";
            }else if (number==5) {
            result="May";
            }else if (number==6) {
            result="June";
            }else if (number==7) {
            result="July";
            }else if (number==8) {
            result="August";
            }else if (number==9) {
            result="September";
            }else if (number==10) {
            result="Oktober";
            }else if (number==11) {
            result="November";
            }else{
            result="December";
            }

        }else{
            System.out.println("Invalid value");
        }

        System.out.println(result);
*/

        int number=13;

        switch (number){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid");

        }

    }
}
