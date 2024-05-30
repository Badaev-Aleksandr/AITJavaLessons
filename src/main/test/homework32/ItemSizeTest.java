package homework32;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.apache.commons.lang3.ArrayUtils.contains;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemSizeTest {
    @ParameterizedTest
    @EnumSource(ItemSize.class)
    void testItemSizeValues(ItemSize itemSize) {
        assertNotNull(itemSize);

    }
    @Test
    void testItemSize(){
        assertEquals(4,ItemSize.values().length);
        assertTrue(contains(ItemSize.values(), ItemSize.S));
        assertTrue(contains(ItemSize.values(), ItemSize.XL));
        assertTrue(contains(ItemSize.values(), ItemSize.L));
        assertTrue(contains(ItemSize.values(), ItemSize.M));
    }
}
