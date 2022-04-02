package week08;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {

        String searchResult="1-16 of 829 results for ipad";

        String[] each= searchResult.split(" ");

        System.out.println(Arrays.toString(each));

        String searchAmount=each[2];
        System.out.println("searchAmount = " + searchAmount);

        System.out.println("-------------------------------------");

        // Break time task : capture the amount 790 with split method
        String confirmation = "Id: 2239677\n" +
                "Amount: 790 USD\n"+
                "Card Number: 8548595959595\n"+
                "Name: oscar\n"+
                "Date: 11/10/2021";

        System.out.println("confirmation = " + confirmation);
        System.out.println("***************************************");
        String [] amount=confirmation.split("\n");
        System.out.println(Arrays.toString(amount));
        String amount1=amount[1].split(" ")[1];
        System.out.println("amount1 = " + amount1);



    }
}
