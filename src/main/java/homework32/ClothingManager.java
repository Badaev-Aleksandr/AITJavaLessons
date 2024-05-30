package homework32;

import java.util.ArrayList;
import java.util.List;

public class ClothingManager {
    private List<ClothingItem> clothingItems = new ArrayList<>();

    public void addClothingItem(ClothingItem item) {
        clothingItems.add(item);
    }

    public boolean removeClothingItem(String name) {
        boolean checkResult = clothingItems.removeIf(item -> item.getName().equalsIgnoreCase(name));clothingItems.removeIf(item -> item.getName().equalsIgnoreCase(name));
        return checkResult;
    }

    public List<ClothingItem> findClothingByType(String type) {
        ArrayList<ClothingItem> sortTypeList = new ArrayList<>();
        for (ClothingItem item : clothingItems) {
            if (item.getType().equalsIgnoreCase(type)) {
                sortTypeList.add(item);
            }
        }
        return sortTypeList;
    }

    public List<ClothingItem> findClothingBySize(ItemSize size) {
        ArrayList<ClothingItem> sortSizeList = new ArrayList<>();
        for (ClothingItem item : clothingItems) {
            if (item.getSize() == size) {
                sortSizeList.add(item);
            }
        }
        return sortSizeList;
    }

    public ClothingItem findCheapestItem() {
        ClothingItem cheapestItem = clothingItems.get(0);
        for (ClothingItem item : clothingItems) {
            if (item.getPrice() < cheapestItem.getPrice()) {
                cheapestItem = item;
            }
        }
        return cheapestItem;
    }

    public List<ClothingItem> getClothingItems() {
        return clothingItems;
    }

}
