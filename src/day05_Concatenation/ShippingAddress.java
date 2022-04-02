package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
/*
        String name= "Jimmy Joe";
        String buildingNumber= "1123B";
*/

        String name= "James King",
                buildingNumber="11821B",
                streetName="Jones Branch Dr",
                city="McLean",
                state="VA",
                zipCode= "22031A";

       // System.out.println(name+"\n" + buildingNumber + " " + streetName+ "\n"+ city+ ", "+state+" "+zipCode);
        String shippingAddress= (name+"\n" + buildingNumber + " " + streetName+ "\n"+ city+ ", "+state+" "+zipCode);
        System.out.println(shippingAddress);








    }











}
