package week02;

public class CarInfo {
    public static void main(String[] args) {
        int year = 2022, milage= 0, price= 100_000;
        String make="Audi", model = "A6", color="Black";
        //automatic=true; manual=false;
        boolean transmission= true;

        System.out.println(year+" "+make+" "+model+"\nAutomatic Transmission :"+transmission);
        System.out.println(color+"! "+milage+" kilometers !"+price+"Euros");

        double priceInTl = price*15.5;

        double taxRate = 1.80;
        double priceAfterTaxInTl=priceInTl+(priceInTl*taxRate);

        System.out.println("priceAfterTaxInTl = " + priceAfterTaxInTl);









    }




}
