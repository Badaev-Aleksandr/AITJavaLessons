package homework34;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalsActionsTest {
    private AnimalsActions animalsActions;
    private Animal animal;


    @BeforeEach
    void setUp() {
        animalsActions = new AnimalsActions();
        animal = new Animal();
    }

    @Test
    void eatTest() {
        assertEquals(120, animalsActions.eat(animal));
    }

    @Test
    void sleepTest() {
        assertEquals(130, animalsActions.sleep(animal));
    }

    @Test
    void playTest() {
        assertEquals(60, animalsActions.play(animal));
    }
}
