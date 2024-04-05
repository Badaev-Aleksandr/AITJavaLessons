package homework23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

/*
Разработайте класс ClothingManager, который использует HashSet для управления коллекцией ClothingItem.
Класс должен иметь методы для добавления, удаления и поиска одежды. Убедитесь, что добавление одинаковых
элементов (согласно определению в equals()) не допускается.
 */
public class ClothingManager {
    private HashSet<ClothingItem> collection = new HashSet<>();

    public HashSet<ClothingItem> getCollection() {
        return collection;
    }

    public void addClothingItem(ClothingItem item) {
        if (item == null) {
            System.out.println("Element is null");
        } else {
            boolean addResult = collection.add(item);
            if (addResult) {
                System.out.println("Clothing item " + item.getName() + " was added in collection");
            } else {
                System.out.println("Clothing item " + item.getName() + " has been already added in collection !!!!");
            }
        }
    }

    public void removeClothingItem(ClothingItem item) {
        boolean removeResult = collection.remove(item);
        if (removeResult) {
            System.out.println("Clothing item " + item.getName() + " has been removed from the collection");
        } else {
            System.out.println("Clothing item " + item.getName() + " not removed from the catalog, not found");
        }
    }

    public HashSet<ClothingItem> foundClothingItem(String name, double size, String color, String category) {
        HashSet<ClothingItem> foundListClothingItem = new HashSet<>();
        for (ClothingItem element : collection) {
            if (element.getName().equalsIgnoreCase(name) && element.getSize() == size &&
                    element.getColor().equalsIgnoreCase(color) && element.getCategory().equalsIgnoreCase(category)) {
                foundListClothingItem.add(element);
            }
        }
        if (foundListClothingItem.isEmpty()) {
            System.out.println("Clothing item was no found!");
        }
        return foundListClothingItem;
    }

    public void printInfoClothingItem() {
        if (!collection.isEmpty()) {
            System.out.println("--------Elements in collection--------");
            collection.forEach(System.out::println);
            System.out.println("--------------------------------------");
        } else {
            System.out.println(" Collection is empty!");
        }
    }

    public void sortBySize() {
        ArrayList<ClothingItem> clothingItems = new ArrayList<>(collection);
        clothingItems.sort(Comparator.comparing(ClothingItem::getSize));
        System.out.println("-----SortBySize-------");
        for (ClothingItem item : clothingItems) {
            System.out.println(item);
        }
        System.out.println("----------------------");
    }

    public void printAllCategoryInCollection() {
        System.out.println("---------Categories in collection--------");
        HashSet<String> categories = new HashSet<>();
        for (ClothingItem clothingItem : collection) {
            categories.add(clothingItem.getCategory());
        }
        for (String clothingItemString : categories) {
            System.out.println(clothingItemString);
        }
    }
}
