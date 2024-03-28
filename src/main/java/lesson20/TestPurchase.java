package lesson20;

import java.util.ArrayList;

public class TestPurchase {
    public static void main(String[] args) {
        ArrayList<Purchase> purchases = new ArrayList<>();
        Purchase purchaseOne = new Purchase("Ananas",5);
        Purchase purchaseTwo = new Purchase("Cheese",3);
        purchases.add(purchaseOne);
        purchases.add(purchaseTwo);
        Purchase.addPurchase(purchases,"Bier",2);
        System.out.println(purchases);


    }
}
