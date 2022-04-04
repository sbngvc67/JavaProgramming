package week12;

public class ValueTest {
    public static void main(String[] args) {
        Value value=new Value();
        System.out.println(value.calledMethod);
        System.out.println(value.getValue());
        value.setValue(5);
        System.out.println(value.calledMethod);
        System.out.println(value.getValue());

        Value value1=new Value(3);









    }
}
