package week05;

public class ReverseUsingCharAtMethod {
    public static void main(String[] args) {

        // palindrome "madam" when you reverse: "madam" again

        String word="JAVA";

        String reverse=""+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);
        System.out.println(reverse);

        String word1="hello";
        System.out.println(word1.charAt(4));
        System.out.println(word1.charAt(3));

        String reverseWord="";
        reverseWord+=word1.charAt(4);
        reverseWord+=word1.charAt(3);
        reverseWord+=word1.charAt(2);
        reverseWord+=word1.charAt(1);
        reverseWord+=word1.charAt(0);

        System.out.println("reverseWord = " + reverseWord);

        if (word1.equals(reverseWord)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
        System.out.println("-----------------------------------");

        String kelime="github";

        System.out.println(kelime.replace("hub","lab"));
        kelime=kelime.replace("hub","lab");
        System.out.println("kelime = " + kelime);

        String kelime2=kelime.replace('i','o');
        System.out.println("kelime2 = " + kelime2);

        String searchRESULT="1-48 of over 6,000 results for java";
        String result= searchRESULT.replace("1-48 of over ","")
                .replace(" results for java","");
        System.out.println("result = " + result);

        String expectedResult="6000";

        if (expectedResult.equals(result)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }







    }
}
