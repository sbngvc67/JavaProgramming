package week12;

public class TelephoneTest {
    public static void main(String[] args) {

        System.out.println(Telephone.total);
        Telephone telephone=new Telephone();

        telephone.setNumber("555-5055050");
        System.out.println(telephone.getNumber());


    }
}
