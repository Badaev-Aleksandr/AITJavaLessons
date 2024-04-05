package homework23;

import java.util.HashSet;

public class TestClothingItem {
    public static void main(String[] args) {
        ClothingManager clothingManager = new ClothingManager();

        clothingManager.addClothingItem(new ClothingItem("jacket", 66, "red", "outerwear"));
        clothingManager.addClothingItem(new ClothingItem("jacket", 66, "red", "outerwear"));
        clothingManager.addClothingItem(new ClothingItem("sweater", 50, "green", "outerwear"));
        clothingManager.addClothingItem(new ClothingItem("socks", 52, "blue", "underwear"));
        clothingManager.addClothingItem(new ClothingItem("sneakers", 44, "black", "shoes"));
        clothingManager.printInfoClothingItem();

        System.out.println("Search for clothes: ");
        HashSet<ClothingItem> foundItems = clothingManager.foundClothingItem("socks", 52, "blue",
                "underwear");
        foundItems.forEach(System.out::println);

        System.out.println("--------delete----------");
        clothingManager.removeClothingItem(new ClothingItem("jacket", 66, "red", "outerwear"));
        clothingManager.printInfoClothingItem();

        clothingManager.sortBySize();

        clothingManager.printAllCategoryInCollection();
    }
}
