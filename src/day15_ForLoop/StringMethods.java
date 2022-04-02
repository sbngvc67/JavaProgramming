package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {

        String str=" ";

        boolean r= str.isEmpty();

        System.out.println("r = " + r);

        boolean r1=str.isBlank();

        System.out.println("r1 = " + r1);

        String str2="Cydeo         ";
        System.out.println(str2.isBlank());
        System.out.println(str.isEmpty());
        System.out.println("---------------------------------");

        String sentence="My favorite programming language is Java";
        boolean hasCSharp= sentence.contains("C#");
        boolean hasJava=sentence.contains("Java");
        boolean lowercase=sentence.toLowerCase().contains("java");

        System.out.println("hasCSharp = " + hasCSharp);
        System.out.println("hasJava = " + hasJava);
        System.out.println("lowercase = " + lowercase);
        System.out.println("************************************************************");

        String input="I love Java";
        String input2="Java";

        System.out.println(input.contains(input2));


        for (int number=1; number<7; number+=2){
            System.out.println("number = " + number);



    }
}}
