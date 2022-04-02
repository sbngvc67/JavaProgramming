package week07;

public class whileHungry {
    public static void main(String[] args) {

        boolean isHungry=true;
        int bananas=0;
        int countToFull=3;
/*
        while (isHungry){
            bananas++;
            System.out.println("Eating a banana: \uD83C\uDF4C "+bananas);
            // unicodes :
            //condition that will change boolean to false
            if (bananas==countToFull){
                isHungry=false;
            }
        }
*/
        while (true){
            bananas++;
            System.out.println("Eating a banana: \uD83C\uDF4C "+bananas);
            //condition that will take us out of the loop
            if (bananas==countToFull){
                break;
            }
        }

        System.out.println("Had enough bananas, let's get back to study");


    }
}
