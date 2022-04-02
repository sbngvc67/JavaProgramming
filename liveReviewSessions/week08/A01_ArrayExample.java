package week08;

public class A01_ArrayExample {
    public static void main(String[] args) {


        int []statusCodes={200,201,204,400,401,403,404,500};

        System.out.println("-------size of an Array---------------------");

        System.out.println("the size of our array: "+statusCodes.length);

        int sizeOfArray= statusCodes.length;

        String[] responseTypes = new String[]{"OK","Created","No Content","Bad Request","Unauthorized","Forbidden","Not Found","Internal Server Error"};

        int sizeOfArrays = statusCodes.length; // 8, use it for creating loops

        for (int i = 0; i < sizeOfArrays ; i++) {
            String text = statusCodes[i]+" : "+responseTypes[i];
            System.out.println("Each Status Code means = " + text);

        }



    }
}
