package day17_While_DoWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String str="Cat Dog Cat Dog cAt CAT caT";

        int frequency=0;


        for (int i = 0; i <= str.length()-3; i++) {
            String eachSub=str.substring(i,i+3);

            if (eachSub.equalsIgnoreCase("Cat")){ // if given ch is matching with eachChar, then ch is appeared in the string
                frequency++;
            }
        }
        System.out.println("frequency = " + frequency);

    }
}
