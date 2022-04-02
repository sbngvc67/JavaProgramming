package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str="AAABBBCAAAAAAAA";
        char ch='B';

        int frequency=0; // +1+1+1==> 3

        for (int i = 0; i <str.length() ; i++) { // i: indexes of str
            char eachChar=str.charAt(i); //  eachChar: each character of str


            // 'A' == 'A'
            if (ch==eachChar){ // if given ch is matching with eachChar, then ch is appeared in the string
                frequency++;
            }
        }
        System.out.println("frequency = " + frequency);
    }}
