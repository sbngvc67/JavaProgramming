package week08;

public class ReportMaxPricedItem {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        double maxPrice=prices[0];
        int indexOfMaxPrice=0;

        double minPrice=prices[0];
        int indexOfMinPrice=0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<minPrice){
                minPrice=prices[i];
                indexOfMinPrice=i;
            }
        }

        System.out.println("indexOfMinPrice = " + indexOfMinPrice);
        System.out.println("minPrice = " + minPrice);


        for (int i = 0; i < prices.length; i++) {
            if (prices[i]>maxPrice){
                maxPrice=prices[i];
                indexOfMaxPrice=i;
            }
        }

        System.out.println("indexOfMaxPrice = " + indexOfMaxPrice);
        System.out.println("maxPrice = " + maxPrice);



    }
}
