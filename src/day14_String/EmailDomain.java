package day14_String;

public class EmailDomain {
    public static void main(String[] args) {

        String email= "Cydeo.School@gmail.com";
        String email2= email.replace("gmail", "yahoo");

        System.out.println("email2 = " + email2);

        System.out.println("-------------------------------");

        int beginningIndex=email.indexOf("@")+1;
        int endingIndex=email.lastIndexOf(".");

        String domain= email.substring(beginningIndex,endingIndex);

        System.out.println(domain);

        System.out.println("---------------------------------------");

        String str1="Java is fun, Java is cool, I love Java";

        String s1= str1.substring(0,11); // Java is fun

        int beg= str1.indexOf(" J")+1;
        int end= str1.lastIndexOf(",");
        String s2= str1.substring(beg, end);

        System.out.println("s2 : "+s2);

        String s3= str1.substring(str1.lastIndexOf("I"));

        System.out.println("s3 = " + s3);



    }
}
