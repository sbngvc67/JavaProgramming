package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name;

    static{
        name="Batch 25";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public final static void main(String[] args) {

        final double pi=3.14;

        final String name;
        name="Java";
        System.out.println(name);
        FinalVariable obj=new FinalVariable("May/01");

        System.out.println(obj.birthDay);

        // FinalVariable.name="Python";
        System.out.println(FinalVariable.name);



    }
}
