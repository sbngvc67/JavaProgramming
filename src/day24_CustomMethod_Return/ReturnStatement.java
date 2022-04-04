package day24_CustomMethod_Return;

public class ReturnStatement {
    public static void main(String[] args) {

        nameOfDay(3);

    }
    public static void nameOfDay(int number){
        String result="";
        if (number<1 || number>7){
            System.out.println("Invalid");
            return;
        }
        result=(number==1)? "Monday" : (number==2)? "hgh" :(number==3)? "kj" :(number==4)? "lkl"
                :(number==5)? "lkj" :(number==6)? "ıoo": "fgdfg" ; return;


    }
}
