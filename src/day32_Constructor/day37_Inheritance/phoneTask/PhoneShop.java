package day32_Constructor.day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone=new Iphone("Iphone 12","6.7 inches",1000,"Black");
        Samsung samsung=new Samsung("Galaxy S19","6 inches",900,"White");
        Nokia nokia=new Nokia("Brick","4 inches",50,"Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(789678678);
        iphone.faceTime("yahoo@gmail.com");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        nokia.call(123121);
        nokia.text(232343);
        nokia.selfDefense();

        System.out.println("******************************");
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);




    }
}
