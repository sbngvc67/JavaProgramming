package week10;

public class R05_MethodOverloading {
    public static void main(String[] args) {

        System.out.println(convertBritishToMetric(5.0,11.0));

        System.out.println(convertBritishToMetric(71));

        String str="Java is fun";
        System.out.println(str.substring(3,5));
        System.out.println(str.substring(3));


    }

    public static double convertBritishToMetric(double feet, double inches){
        if (feet<0||inches<0||inches>12){
            System.err.println("Invalid feet or inches");
            System.exit(-1);
        }
        return feet*12*2.54+inches*2.54;
    }

    public static double convertBritishToMetric(double inches){

        if (inches<0){
            System.err.println("Invalid feet or inches");
            return -1;
        }
        return inches*2.54;
    }



}
