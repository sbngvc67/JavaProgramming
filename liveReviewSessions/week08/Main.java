import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below

        String[]str=sentence.split(" ");
        String divide1=Arrays.toString(str).substring(0,Arrays.toString(str).indexOf(" "));
        System.out.println(divide1);


    }
}