package day15_ForLoop;

public class FormatFullName {
    public static void main(String[] args) {

        String firstName= "cyDEo", lastName="SCHOOL";

        //firstName= firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
                //C                                 ydeo   ==> "Cydeo"

        firstName=(""+firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();
                //    "C"

        lastName= lastName.substring(0,1).toUpperCase()+ lastName.substring(1).toLowerCase();


        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        String fullName=firstName+" "+lastName;

        System.out.println("fullName = " + fullName);


    }
}
