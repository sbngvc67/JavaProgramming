package week05;

public class StringReview01 {
    public static void main(String[] args) {

        String str3= "java";
        String str4= new String("JAVA");

        System.out.println(str3.equalsIgnoreCase(str4));
        System.out.println("-------------------------------------------");

        String message= "EU8 is awesome!!";
        int count= message.length();

        System.out.println("count = " + count);
        System.out.println(count==16);

        if (message.length()==16){
            System.out.println("happy testing");
        }
        System.out.println("***********************************************");
        System.out.println(message.toUpperCase());
        System.out.println("message after uppercase");
        System.out.println(message);
        System.out.println("------------------------------------------------------------");
        String messageTwo=message.toUpperCase();
        System.out.println(messageTwo);
        System.out.println("------------------------------------------");

        String str= " abc  ";
        System.out.println(str.trim());
        str=str.trim();
        System.out.println(str);

        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");

        String str2= " abc cde  ";
        str2=str2.replaceAll(" ","");
        System.out.println(str2);
        System.out.println("************************************************************************");

        String str6=" EU8 Awesome ";
        str6=str6.trim().replace(" ","").toUpperCase().substring(3);
        System.out.println(str6);





    }
}
