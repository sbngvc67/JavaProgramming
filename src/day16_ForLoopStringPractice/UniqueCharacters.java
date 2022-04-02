package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str="aaabdbccc";
        String result="";

        for (int i = 0; i <str.length() ; i++) {//i:index numbers of str (starting number from 0)
            char ch=str.charAt(i);
            if (str.indexOf(ch)==str.lastIndexOf(ch)){//if the first and last index numbers of character are the same, then the character is unique
                result+=ch;
                System.out.println(result);
            }
        }
        
        
        
        char ch='b';

        if (str.indexOf(ch)==str.lastIndexOf(ch)){//if the first and last index numbers of character are the same, then the character is unique
            result+=ch;
        }







    }
}
