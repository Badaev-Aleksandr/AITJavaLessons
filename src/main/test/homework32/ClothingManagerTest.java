package homework32;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClothingManagerTest {

    private ClothingManager clothingManager;

    @BeforeEach
    void setUp() {
        clothingManager = new ClothingManager();
        clothingManager.addClothingItem(new ClothingItem("Polo", "Свитер", ItemSize.S, 129.99));
        clothingManager.addClothingItem(new ClothingItem("Mustang", "Джинсы", ItemSize.XL, 49.99));
        clothingManager.addClothingItem(new ClothingItem("Jeans", "Куртка", ItemSize.L, 99.99));
        clothingManager.addClothingItem(new ClothingItem("Calvin Klein", "Футболка", ItemSize.M, 29.99));

    }
    @Test
    void testAddClothingItem() {
        clothingManager.addClothingItem(new ClothingItem("Calvin Klein", "Футболка", ItemSize.M, 299.99));
                assertEquals(5,clothingManager.getClothingItems().size());
    }


    @ParameterizedTest
    @ValueSource(strings = {"Свитер", "Джинсы", "Куртка", "Футболка"})
    void testFindClothingByType(String type) {
        List<ClothingItem> items = clothingManager.findClothingByType(type);
        for (ClothingItem item : items) {
            assertEquals(item.getType(), type);
        }
    }

    @Test
    void testFindCheapestItem() {
        ClothingItem cheapestItem = clothingManager.findCheapestItem();
        assertNotNull(cheapestItem);
        assertEquals("Calvin Klein", cheapestItem.getName());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Calvin Klein", "Polo", "Jeans", "Mustang"})
    void testRemoveClothingItem(String name) {
        assertTrue(clothingManager.removeClothingItem(name));
        assertEquals(3, clothingManager.getClothingItems().size());
    }

    @ParameterizedTest
    @CsvSource({
            "Calvin Klein, true",
    })
    void testRemoveClothingItemPositive(String name, boolean expectedResult) {
        boolean result = clothingManager.removeClothingItem(name);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "XL,1",
            "S,1",
            "M,1",
            "L,1"
    })
    void testFindClothingBySize(ItemSize itemSize, int quantity) {
        List<ClothingItem> newList = clothingManager.findClothingBySize(itemSize);
        assertEquals(quantity, newList.size());
    }
}
