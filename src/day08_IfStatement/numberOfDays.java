package day08_IfStatement;

public class numberOfDays {
    public static void main(String[] args) {

        int number=11;
        boolean has28Days=number==2; //for the 28-day-months
        boolean has30Days= number ==4 || number==6||number==9||number==11; //for the 30-day-months
        boolean has31Days= !has28Days &&!has30Days;

        if(has28Days){//if the month has 28 days
            System.out.println("28 Days");
        }
        if(has30Days){//if the month has 30 days
            System.out.println("30 Days");
        }
        if (has31Days){//if the month has 31 days
            System.out.println("31 Days");

        }

    }
}
