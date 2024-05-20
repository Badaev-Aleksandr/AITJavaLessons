package lesson20;

import java.util.ArrayList;
import java.util.Iterator;

    public class Purchase implements Comparable<Purchase> {
        /*
        1. Создание списка покупок:
    a. Создайте класс Purchase с полями itemName (название товара) и price (цена товара).
    b. Создайте метод main для инициализации ArrayList с покупками и заполните его несколькими товарами.
        2. Добавление новых покупок:
    a. Напишите метод для добавления новой покупки в список. Параметры метода: название товара и его цена.
    b. Проверьте работу метода, добавив несколько новых покупок в список.
        3. Вывод списка покупок:
    a. Напишите метод для вывода всех покупок из списка.
    b. Проверьте работу метода, вызвав его после добавления нескольких покупок.
        4. Поиск покупок:
    a. Напишите метод для поиска покупок по названию товара.
    b. Проверьте работу метода, вызвав его для поиска нескольких товаров.
        5. Удаление покупок:
    a. Напишите метод для удаления покупки по её названию.
    b. Проверьте работу метода, удалив одну из покупок и выведя список покупок снова.
         */
        private String itemName;
        private double price;

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

        public static void addPurchase(ArrayList<Purchase> purchaseArrayList, String purchaseName, double purchasePrice) {
            purchaseArrayList.add(new Purchase(purchaseName, purchasePrice));
        }

        @Override
        public String toString() {
            return "Purchase{" +
                    "itemName='" + itemName + '\'' +
                    ", price=" + price +
                    '}';
        }

        public static void printArrayList(ArrayList<Purchase> list) {
            if (list.isEmpty()) {
                System.out.println("Лист покупок пуст! ");
            } else {
                System.out.println("------------------------------------------------------------------");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println("Element " + (i + 1) + ": " + "itemName='" + list.get(i).itemName + '\'' +
                            ", price='" + list.get(i).price + '\'');
                }
            }
        }

        public static int searchByName(ArrayList<Purchase> list, String name) {
            int index = -1;
            System.out.println("------------------------------------------------------------");
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getItemName().equals(name)) {
                    System.out.println("Покупка " + name + " найдена в списке!");
                    System.out.println("Element " + (i + 1) + ": " + "  " + list.get(i).toString());
                    index = i;
                }
            }
            if (index == -1) {
                System.out.println("Покупка " + name + " в списке отсутствует!");
            }
            return index;
        }

        public static void searchPurchaseByName(ArrayList<Purchase> purchaseList, String name) {
            boolean purchaseFound = false;
            System.out.println("Ищем покупку с названием " + name);
            for (Purchase purchase : purchaseList) {
                if (purchase.getItemName().equalsIgnoreCase(name)) {
                    System.out.println("Покупка найдена !!!");
                    purchaseFound = true;
                }
            }
            if (!purchaseFound) {
                System.out.println("Покупка " + name + " в списке отсутствует!");
            }
        }

        public static void removeByName(ArrayList<Purchase> list, String name) {
            int index = searchByName(list, name);
            if (index != -1) {
                list.remove(index);
                System.out.println("Покупка удалена!");
            } else {
                System.out.println("Удалять нечего!");
            }

        }

        public static void removePurchaseByName(ArrayList<Purchase> purchaseList, String name) {
            System.out.println("Удаляем покупку " + name);
            boolean found = false;
            for (int i = 0; i < purchaseList.size(); i++) {
                if (purchaseList.get(i).getItemName().equalsIgnoreCase(name)) {
                    purchaseList.remove(i);
                    System.out.println("Покупка была найдена и удалена");
                    found = true;
                    i--;
                }
            }
            if (!found) {
                System.out.println("Покупка не была найдена");
            }
        }

        public static void removePurchaseByNameIterator(ArrayList<Purchase> purchasesList, Purchase purchaseToDelete) {
            Iterator<Purchase> iterator = purchasesList.iterator();
            while (iterator.hasNext()) {
                Purchase purchase = iterator.next();
                if (purchase.equals(purchaseToDelete)) {
                    iterator.remove();
                    System.out.println("Покупка найдена и удалена!");
                }
            }
        }
        public int compareTo(Purchase purchase){
            return Double.compare(this.price,purchase.price);
        }
    }
