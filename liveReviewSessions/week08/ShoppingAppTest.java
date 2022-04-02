package week08;

public class ShoppingAppTest {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("gloves")) {
                System.out.println("Gloves found at index : " + i);
                break;
            }
        }

        System.out.println("------------Set a boolean variable true if 'ipad' exists in the items");
        boolean iPadExists=false;

        for (String item : items) {
            if (item.equalsIgnoreCase("ipad")){
                iPadExists=true;
                break;
            }
        }
        if (iPadExists){
            System.out.println("We have it");
        }
        System.out.println("---------------------Look for Jacket, if found print all the details");

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Jacket")) {
                String itemDetail=items[i]+" - $ "+prices[i]+" - # "+itemIDs[i];
                System.out.println("itemDetail = " + itemDetail);            }

        }


    }
}
