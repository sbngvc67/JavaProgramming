package day10_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {
        int grade=2, groupNumber=1;
        String location= "", teacher="";

        if (grade>=1 && grade<=6){
            if (grade==1){
                location= "Apple orchard";
                groupNumber=3;
                teacher= "Ms.Smith";
            }else if (grade==2){
                location= "Zoo";
                groupNumber=7;
                teacher= "Mr. Lee";
            }
            System.out.println("location - "+location+"\nnumber of groups - "+groupNumber+"\nteacher in charge - "+teacher);


        }else{
            System.out.println("Invalid Grade");
        }


    }
}
