package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {

        ArrayList<Pizza> pizzas=new ArrayList<>();
        //create 100 pizza objects: size - 'S', cheesetopping - 2, pepperoni tooping -3
        //create 100 pizza objects: size - 'M', cheesetopping - 3, pepperoni tooping -4
        //create 100 pizza objects: size - 'L', cheesetopping - 4, pepperoni tooping -5

        for (int i = 1; i <= 100; i++) {
            Pizza smallPizza=new Pizza('S',2,3);
            Pizza mediumPizza=new Pizza('M',3,4);
            Pizza largePizza=new Pizza('L',4,5);
            pizzas.addAll(Arrays.asList(smallPizza,mediumPizza,largePizza));

        }
        System.out.println("Total number of pizza: "+pizzas.size());
        double totalPrice=0;
        for (Pizza pizza : pizzas) {
            totalPrice+=pizza.calcCost();

        }
        System.out.println("totalPrice = $" + totalPrice);













    }
}
