package day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str="JavaJavaJavaJavaJava";

        int frequency=0;


        for (int i = 0; i <= str.length()-4; i++) {
            String eachSub=str.substring(i,i+4);
            System.out.println("eachSub = " + eachSub);

            if (eachSub.equals("Java")){ // if given ch is matching with eachChar, then ch is appeared in the string
                frequency++;
            }
        }
        System.out.println("frequency = " + frequency);

    }
}
