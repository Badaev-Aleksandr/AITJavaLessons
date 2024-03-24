package homework20;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPlay {
    public static void main(String[] args) {
        ArrayList<Purchase> product = new ArrayList<>();
        Purchase purchaseOne = new Purchase("Banana", 2);
        Purchase purchaseTwo = new Purchase("Potato", 3);
        product.add(purchaseOne);
        product.add(purchaseTwo);

        Purchase.addPurchase(product, "Kiwi", 3);
        Purchase.addPurchase(product, "Lemon", 1.99);
        Purchase.addPurchase(product, "Bread", 4.99);

        System.out.println(product);


        Purchase.printPurchase(product);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the product to search for it in the shopping list: ");
        String productName = scanner.nextLine().toLowerCase().trim();
        Purchase.findPurchase(product, productName);

        System.out.println("Enter the name of the product to removing for it in the shopping list: ");
        String deleteProduct = scanner.nextLine().toLowerCase().trim();
        Purchase.removingProduct(product,deleteProduct);

    }
}
