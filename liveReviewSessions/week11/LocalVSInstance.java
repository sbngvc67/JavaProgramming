package week11;

public class LocalVSInstance {
    public int a=4;

    public void showDifference(int number){ // Ques= I want to be able to change this as well
        int a=number;
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {
        LocalVSInstance obj=new LocalVSInstance();
        System.out.println("--coming from the method");
        obj.showDifference(8);
        System.out.println("--coming from instance variable----");
        System.out.println(obj.a);
        obj.a=1;
        System.out.println(obj.a);
    }

}
