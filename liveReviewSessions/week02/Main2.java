package week02;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //Enter your code here
        String firstName= "James";
        String lastName="May";
        String fullName= lastName +", "+ firstName;
        String email="jamesmay@gmail.com";
        String street= "7925 Jones Branch Dr";
        String state= "VA";
        String city= "McLean";
        int zipcode= 22102;
        String address= street +" "+ city+ " "+state+" "+zipcode;
        int age= 35;
        double height= 5.10;
        double weight= 173.2;
        boolean isMarried= true;
        long workPhoneNumber= 7896542314l;
        long personalPhoneNumber= 2406542314l;
        String contacts= workPhoneNumber +" "+ personalPhoneNumber+" " + email;

        Scanner uscan= new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name ");
        System.out.println("Enter your last name ");
        System.out.println("Enter your email\nEnter your street\nEnter your city\nEnter your state");
        System.out.println("Enter your zip code\nEnter your work phone number\nEnter your personal phone number");
        System.out.println("Enter your age\nEnter your height\nEnter your weight\nAre you married?");
        System.out.println("Patient personal information");
        System.out.println("Full name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Contacts: work phone number - " + workPhoneNumber+", "+"personal phone number - "+personalPhoneNumber+", "+"email: "+email );
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight+" pounds");
        System.out.println("Married?: " + isMarried);

        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner scan=new Scanner(System.in);
        int areaCode=scan.nextInt();
        int localNumber=scan.nextInt();

        String phoneNumber;
        //WRITE YOUT CODE HERE:
        System.out.println((areaCode)+"-"+localNumber);
        System.out.println("Enter your Area Code");
        areaCode = scan.nextInt();
        System.out.println("Enter your Local Number");
        localNumber = scan.nextInt();





        /*

Patient personal information
Full name: Tyson, Mike
Address: 7911 Westpark Dr, McLean, VA 22102
Contacts: work phone number - 7896542315, personal phone number - 2406542315, email: miketyson@gmail.com
Age: 45
Height: 6.1
Weight: 175.2 pounds
Married?: false
         */









        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();
        // continue for city




    }
}

/*
public class Main {
  public static void main(String[] args) {
    //Enter your code here
    String firstName= "James";
    String lastName="May";
    String fullName= lastName +", "+ firstName;
    String email="jamesmay@gmail.com";
    String street= "7925 Jones Branch Dr";
    String state= "VA";
    String city= "McLean";
    int zipcode= 22102;
    String address= street +", "+ city+ ", "+state+" "+zipcode;
    int age= 35;
    double height= 5.10;
    double weight= 173.2;
    boolean isMarried= true;
    long workPhoneNumber= 7896542314l;
    long personalPhoneNumber= 2406542314l;
    String contacts= workPhoneNumber +" "+ personalPhoneNumber+" " + email;

    Scanner scan= new Scanner(System.in);
    System.out.println("Welcome to the patient portal!");
    System.out.println("Please enter your personal information");
    System.out.println("Enter your first name");
    System.out.println("Enter your last name");
    System.out.println("Enter your email\nEnter your street\nEnter your city\nEnter your state");
    System.out.println("Enter your zip code\nEnter your work phone number\nEnter your personal phone number");
    System.out.println("Enter your age\nEnter your height\nEnter your weight\nAre you married?");
    System.out.println("Patient personal information");
    System.out.println("Full name: " + fullName);
    System.out.println("Address: " + address);
    System.out.println("Contacts: work phone number - " + workPhoneNumber+", "+"personal phone number - "+personalPhoneNumber+", "+"email: "+email );
    System.out.println("Age: " + age);
    System.out.println("Height: " + height);
    System.out.println("Weight: " + weight+" pounds");
    System.out.println("Married?: " + isMarried);

 //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
    // Variables are already declared and given
    Scanner scan=new Scanner(System.in);
    int areaCode=scan.nextInt();
    int localNumber=scan.nextInt();

    String phoneNumber;
    //WRITE YOUT CODE HERE:
    System.out.println((areaCode)+"-"+localNumber);
    System.out.println("Enter your Area Code");
    areaCode = scan.next();
    System.out.println("Enter your Local Number");
    localNumber = scan.next();




   // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();
     // continue for city




  }
}
 */