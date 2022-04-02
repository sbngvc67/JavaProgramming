package week04;

import java.util.*;

class GiftCard {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        int Blanket= 60, Charger=25, Hat=25, Headphones=30, Laptop=200,
                Pants=50,Pillow=40, Smartphone= 1000,Socks= 5, USBCable= 10, giftCard=100;
        Scanner input=new Scanner(System.in);
        String item=input.nextLine();

        switch (item){
            case "Hat":
                System.out.println("Thank you for your purchase!\nYour current balance is: "+(giftCard-Hat)+"$");
                break;
            case "Blanket":
                System.out.println("Thank you for your purchase!\nYour current balance is: "+(giftCard-Blanket)+"$");
                break;
            case "Charger":
                System.out.println("Thank you for your purchase!\nYour current balance is: "+(giftCard-Charger)+"$");
                break;
            case "Headphones":
                System.out.println("Thank you for your purchase!\nYour current balance is: "+(giftCard-Headphones)+"$");
                break;
            case "Laptop": case "Smartphone":
                System.out.println("Sorry, not enough funds on your gift card!");
                break;
            case "Pants":
                System.out.println("Thank you for your purchase!\nYour current balance is: "+(giftCard-Pants)+"$");
                break;
            case "Pillow":
                System.out.println("Thank you for your purchase!\nYour current balance is: "+(giftCard-Pillow)+"$");
                break;
            case "Socks":
                System.out.println("Thank you for your purchase!\nYour current balance is: "+(giftCard-Socks)+"$");
                break;
            case "USB cable":
                System.out.println("Thank you for your purchase!\nYour current balance is: "+(giftCard-USBCable)+"$");
                break;
            default:
                System.out.println("Invalid item!");
        }
        }





    }

/*

Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something and display leftover balance after purchase.

If item is not in the list, display message: "Invalid item!".
If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
List of items Blanket - 60$ Charger - 25$ Hat - 25$ Headphones - 30$ Laptop - 200$ Pants - 50$ Pillow - 40$ Smartphone - 1000$ Socks - 5$ USB cable - 10$

Hint: if/ else if / else or switch statement

Examples:

input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$
input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$
input: Laptop
Output:
Sorry, not enough funds on your gift card!
input: Laptop
Output:
Sorry, not enough funds on your gift card!
input: Cupcake
output: Invalid item!
 */