package homework20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Purchase {
    private String itemName;

    private double price;

    public static Scanner scanner = new Scanner(System.in);

    public Purchase(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public static void addPurchase(ArrayList<Purchase> list, String name, double price) {
        list.add(new Purchase(name, price)); // Добавление в лист созданный объект с названием и ценой
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "Name=' " + itemName + '\'' +
                ", price= " + price +
                '}';
    }

    public static void printPurchase(ArrayList<Purchase> list) {
        Iterator<Purchase> iterator = list.iterator();
        while (iterator.hasNext()) {
            Purchase element = iterator.next();
            System.out.println(element);
        }
    }

    public static void findPurchase(ArrayList<Purchase> list, String productName) {
        boolean findProduct = false;
        for (Purchase name : list) {
            if (productName.equalsIgnoreCase(name.itemName)) {
                System.out.println("This product is included in your purchases");
                findProduct = true;
                break;
            }
        }
        if (!findProduct) {
            System.out.println("This product is not included in your purchases");
        }
    }

    public static void removingProduct(ArrayList<Purchase> list, String productName) {
        boolean notFindProduct = false;
        for (int i = 0; i < list.size(); i++) {
            if (productName.equalsIgnoreCase(list.get(i).itemName)) {
                list.remove(i);
                notFindProduct = true;
                break;
            }
        }
        if (!notFindProduct) {
            System.out.println("This product is not included in your purchases!");
        }
        System.out.println("Here's what's left on the shopping list: ");
        printPurchase(list);
    }
}
