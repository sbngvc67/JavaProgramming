package week04;

public class TrafficLightSelector {
    public static void main(String[] args) {


        char color= 'r';

        switch (color){
            case 'R': case 'r':
                System.out.println("Red light");
                break;
            case 'y': case 'Y':
                System.out.println("Yellow light");
            break;
            case 'G': case 'g':
                System.out.println("Green Light");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
