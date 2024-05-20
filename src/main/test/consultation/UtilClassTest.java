package consultation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UtilClassTest {
    private UtilClass utilClass;

    @BeforeEach
    void setUp(){
        utilClass = new UtilClass();
    }


    @Test
    void reverseStringTest(){
        UtilClass utilClass = new UtilClass();
        assertEquals("koobeton",utilClass.reverseString("notebook"));
    }
    @Test
    void findMaxTestOnlyPositiveNumber(){
    int [] testArray = {1,5,3,6,8,5};
    assertEquals(8,utilClass);
    }
}
