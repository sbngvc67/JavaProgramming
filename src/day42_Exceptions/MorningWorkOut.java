package day42_Exceptions;

public class MorningWorkOut {
    public static void main(String[] args) {

        System.out.println("------------Push up started-------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.print("\rPush up "+i);
            sleep(1.5);
        }


        System.out.println("\n------------Push ups completed-------------------");







    }
    public static void sleep(double seconds){

        try {
            Thread.sleep((long) (seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
