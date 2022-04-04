package week12.static_examples;

public class StaticTest {
    public String instanceValue="Selenium";
    public static String word="Java";



    public static void main(String[] args) {
        //System.out.println(instanceValue);
        System.out.println("word = " + word);
        StaticMethods object=new StaticMethods();
        object.displayMessage("Hello static function");

        // I want to use displayMessage method,do I have to creat object?

        StaticMethods objects=new StaticMethods();
        objects.displayMessage("Hello, I am using object to call you");

        //variables
        System.out.println(StaticMethods.count);
        System.out.println(object);

    }
}
