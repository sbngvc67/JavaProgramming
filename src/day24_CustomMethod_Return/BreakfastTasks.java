package day24_CustomMethod_Return;

import java.util.Locale;

public class BreakfastTasks {
    public static void main(String[] args) {

        initials("cydeo", "school");
        domain("sbngvc67@gmail.com");
        System.out.println("---------------------------");
        String[] emails={"josh@gmail.com","jim@yahoo.com","Elminur@cydeo.com"};
        for (String email : emails) {
            domain(email);
        }
        nameOfMonth(12);
        nameOfDay(7);

    }
    public static void initials(String firstName, String lastName){
        String initial=firstName.charAt(0)+"."+lastName.charAt(0);
        initial=initial.toUpperCase(Locale.ROOT);
        System.out.println("initial = " + initial);
    }
    public static void domain(String email){

        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain = " + domain);    }
    public static void nameOfMonth(int number){
        String name="";
        if (number>=1 && number <=12){
            name=(number==1)? "January" :(number==2)? "February" :(number==3)? "March":(number==4)? "April"
                    :(number==5)? "May":(number==6)? "June":(number==7)? "July":(number==8)? "August"
                    :(number==9)? "September":(number==10)? "October":(number==11)? "November":"December";
        }else{
            name="Invalid";
        }
        System.out.println("Month name = " + name);    }
    public static void nameOfDay(int number){
        String name="";
        if (number>=1 && number <=7){
            name=(number==1)? "Monday" :(number==2)? "Tuesday" :(number==3)? "Wednesday":(number==4)? "Thursday"
                    :(number==5)? "Friday":(number==6)? "Saturday":"Sunday";
        }else{
            name="Invalid";
        }
        System.out.println("Day name = " + name);    }

    }




