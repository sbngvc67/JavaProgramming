package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {

        String [] names={"Cydeo School","Wooden Spoon","Java Programming", "SQL Programming"};
/*
        for (String each : name) {
            String initial=each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1 );
            System.out.println(initial);
            
        }
        */
        for (String each : names) {
            String reversed="";

            for (int i = each.length()-1; i >=0 ; i--) {
                reversed+=each.charAt(i);
            }
            System.out.println(reversed);
        }
 


    }
}
