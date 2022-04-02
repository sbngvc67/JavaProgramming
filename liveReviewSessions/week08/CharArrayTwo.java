package week08;

import java.util.Arrays;
import java.util.List;

public class CharArrayTwo {
    public static void main(String[] args) {

        int [] countOfEachChar=new int[26];

        System.out.println("---Before putting the word into my int array--------------");
        System.out.println(Arrays.toString(countOfEachChar));
        String word="silent";

        for (char letter : word.toCharArray()) {
            System.out.println("letter = " + letter);
            countOfEachChar[letter-97]=countOfEachChar[letter-97]+1;
            System.out.println("---After putting the word into its index--------------");
            System.out.println(Arrays.toString(countOfEachChar));
        }


        String word2= "listen";
        for (char letter : word2.toCharArray()) {
            System.out.println("letter = " + letter);
            countOfEachChar[letter-97]=countOfEachChar[letter-97]-1;
            System.out.println("---After putting the word into its index--------------");
            System.out.println(Arrays.toString(countOfEachChar));
        }










    }


}
